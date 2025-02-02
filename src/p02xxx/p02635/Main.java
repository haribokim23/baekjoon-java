package p02xxx.p02635;

// 제목 : 수 이어가기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        br.close();
        int maxCount = 0;
        String numbers = "";

        for (int second = 0; second <= first; second++) {
            StringBuilder sb = new StringBuilder();
            sb.append(first).append(" ").append(second).append(" ");
            int count = 2;

            for (int a = first, b = second, c; a >= b; a = b, b = c) {
                c = a - b;
                sb.append(c).append(" ");
                count++;
            }

            if (count > maxCount) {
                maxCount = count;
                numbers = sb.toString();
            }
        }

        System.out.println(maxCount + "\n" + numbers);
    }
}
