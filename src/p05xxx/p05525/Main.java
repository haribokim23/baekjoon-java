package p05xxx.p05525;

// 제목 : IOIOI

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) * 2 + 1;
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();
        int count = 0;

        for (int index = 0, length = 0; index < m; index++) {
            char character = s.charAt(index);

            if (character == 'I') {
                if (length % 2 == 0) {
                    length++;
                } else {
                    length = 1;
                }

                if (length >= n) {
                    count++;
                }
            } else {
                if (length % 2 == 1) {
                    length++;
                } else {
                    length = 0;
                }
            }
        }

        System.out.println(count);
    }
}
