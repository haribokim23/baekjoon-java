package p15xxx.p15312;

// 제목 : 이름 궁합

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        br.close();

        int length = a.length();
        int[] sum = new int[length * 2];
        int[] count = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2,
                1};

        for (int i = 0; i < length; i++) {
            sum[i * 2] = count[a.charAt(i) - 'A'];
            sum[i * 2 + 1] = count[b.charAt(i) - 'A'];
        }

        for (int i = 0; i < length * 2 - 2; i++) {
            for (int j = 0; j < length * 2 - 1 - i; j++) {
                sum[j] = (sum[j] + sum[j + 1]) % 10;
            }
        }

        System.out.println(sum[0] + "" + sum[1]);
    }
}
