package p01xxx.p01145;

// 제목 : 적어도 대부분의 배수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[][] factors = new int[5][101];

        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(st.nextToken());

            for (int factor = 2; factor <= number; factor++) {
                while (number % factor == 0) {
                    factors[i][factor]++;
                    number /= factor;
                }
            }
        }

        int min = 1000000;

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int lcm = 1;

                    for (int l = 2; l < 101; l++) {
                        int max = Math.max(Math.max(factors[i][l], factors[j][l]), factors[k][l]);
                        lcm *= Math.max(Math.pow(l, max), 1);
                    }

                    min = Math.min(min, lcm);
                }
            }
        }

        System.out.println(min);
    }
}
