package p10xxx.p10610;

// 제목 : 30

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        br.close();

        if (!N.contains("0")) {
            System.out.println(-1);
            return;
        }

        N = N.replaceFirst("0", "");
        BigInteger number = new BigInteger(N);

        if (!number.mod(new BigInteger("3")).equals(BigInteger.ZERO)) {
            System.out.println(-1);
            return;
        }

        StringBuilder[] sbs = new StringBuilder[10];

        for (int index = 0; index < 10; index++) {
            sbs[index] = new StringBuilder();
        }

        for (int index = 0; index < N.length(); index++) {
            String character = Character.toString(N.charAt(index));
            int digit = Integer.parseInt(character);
            sbs[digit].append(character);
        }

        StringBuilder sb = new StringBuilder();

        for (int index = 9; index >= 0; index--) {
            sb.append(sbs[index]);
        }

        System.out.println(sb.append("0"));
    }
}
