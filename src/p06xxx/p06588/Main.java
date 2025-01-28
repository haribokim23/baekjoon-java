package p06xxx.p06588;

// 제목 : 골드바흐의 추측

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

        for (int n = Integer.parseInt(br.readLine()); n != 0; n = Integer.parseInt(br.readLine())) {
            boolean isGoldbach = false;

            for (int prime : primes) {
                if (prime > (double) n / 2) {
                    break;
                }

                if (primes.contains(n - prime)) {
                    isGoldbach = true;
                    sb.append(n).append(" = ").append(prime).append(" + ").append(n - prime);
                    break;
                }
            }

            if (!isGoldbach) {
                sb.append("Goldbach's conjecture is wrong.");
            }

            sb.append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
