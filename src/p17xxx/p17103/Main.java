package p17xxx.p17103;

// 제목 : 골드바흐 파티션

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        TreeSet<Integer> primes = new TreeSet<>();

        for (int i = 3; i < 1_000_000; i += 2) {
            boolean isPrime = true;

            for (int prime : primes) {
                if (prime > Math.sqrt(i)) {
                    break;
                }

                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if (n == 4) {
                sb.append("1\n");
                continue;
            }

            int count = 0;

            for (int prime : primes) {
                if (prime > (double) n / 2) {
                    break;
                }

                if (primes.contains(n - prime)) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
