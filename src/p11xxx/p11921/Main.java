package p11xxx.p11921;

// 제목 : 0.1

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[6000000];
        System.in.read(buffer, 0, 6000000);
        int i = 0, temp = 0, index = 8, b;
        long sum = 0;

        while (i++ < 600000) {
            temp = buffer[index++] - 48;

            while ((b = buffer[index++]) != 10) {
                temp *= 10;
                temp += b - 48;
            }

            sum += temp;
        }

        buffer[0] = 54;
        buffer[1] = 48;
        buffer[2] = 48;
        buffer[3] = 48;
        buffer[4] = 48;
        buffer[5] = 48;
        buffer[6] = 10;
        temp = 25;

        while (sum > 0) {
            buffer[temp++] = (byte) (sum % 10 + 48);
            sum /= 10;
        }

        index = 7;

        while (temp-- > 25) {
            buffer[index++] = buffer[temp];
        }

        System.out.write(buffer, 0, index);
    }
}
