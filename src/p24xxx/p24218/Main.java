package p24xxx.p24218;

// 제목 : Double Crypt 1

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final byte[] IV = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

    private static final String HEX_STRING = "0123456789ABCDEF";
    private static final char[] HEX_ARRAY = HEX_STRING.toCharArray();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        String p = br.readLine();
        String c2 = br.readLine();
        br.close();

        boolean recovered = false;
        StringBuilder k1 = new StringBuilder("00000000000000000000000000000000");
        StringBuilder k2 = new StringBuilder("00000000000000000000000000000000");

        for (int digit1 = 0; digit1 < s && !recovered; digit1++) {
            for (int index1 = 0; index1 < 16 && !recovered; index1++) {
                for (int digit2 = 0; digit2 < s && !recovered; digit2++) {
                    for (int index2 = 0; index2 < 16 && !recovered; index2++) {
                        k1.setCharAt(digit1, HEX_STRING.charAt(index1));
                        k2.setCharAt(digit2, HEX_STRING.charAt(index2));

                        if (E(p, k1.toString()).equals(D(c2, k2.toString()))) {
                            recovered = true;
                        }
                    }
                }
            }
        }

        System.out.println(k1 + "\n" + k2);
    }

    private static String E(String p, String k) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        SecretKeySpec key = new SecretKeySpec(toByteArray(k), "AES");
        IvParameterSpec params = new IvParameterSpec(IV);
        cipher.init(Cipher.ENCRYPT_MODE, key, params);
        return toHexString(cipher.doFinal(toByteArray(p)));
    }

    private static String D(String c, String k) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        SecretKeySpec key = new SecretKeySpec(toByteArray(k), "AES");
        IvParameterSpec params = new IvParameterSpec(IV);
        cipher.init(Cipher.DECRYPT_MODE, key, params);
        return toHexString(cipher.doFinal(toByteArray(c)));
    }

    private static byte[] toByteArray(String hexString) {
        int length = hexString.length();
        byte[] byteArray = new byte[length / 2];

        for (int i = 0; i < length; i += 2) {
            byteArray[i / 2] = (byte) ((HEX_STRING.indexOf(hexString.charAt(i)) << 4)
                    + HEX_STRING.indexOf(hexString.charAt(i + 1)));
        }

        return byteArray;
    }

    private static String toHexString(byte[] byteArray) {
        int length = byteArray.length;
        char[] hexCharArray = new char[length * 2];

        for (int i = 0; i < length; i++) {
            int value = byteArray[i] & 0xFF;
            hexCharArray[i * 2] = HEX_ARRAY[value >>> 4];
            hexCharArray[i * 2 + 1] = HEX_ARRAY[value & 0x0F];
        }

        return new String(hexCharArray);
    }
}
