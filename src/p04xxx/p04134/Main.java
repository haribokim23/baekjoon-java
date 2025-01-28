package p04xxx.p04134;

// 제목 : 다음 소수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            if (n <= 2) {
                sb.append("2\n");
                continue;
            }

            while (true) {
                int sqrt = (int) Math.sqrt(n);
                boolean isPrime = true;

                for (int i = 2; i <= sqrt; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    break;
                }

                n++;
            }

            sb.append(n).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
