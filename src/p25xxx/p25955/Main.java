package p25xxx.p25955;

// 제목 : APC는 쉬운 난이도 순일까, 아닐까?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        Problem[] unsorted = new Problem[n];
        Problem[] sorted = new Problem[n];

        for (int i = 0; i < n; i++) {
            Problem problem = new Problem(st.nextToken());
            unsorted[i] = problem;
            sorted[i] = problem;
        }

        Arrays.sort(sorted);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            Problem problem = unsorted[i];

            if (problem.compareTo(sorted[i]) != 0) {
                sb.insert(0, problem.difficulty + " ");
            }
        }

        System.out.println(sb.length() == 0 ? "OK" : "KO\n" + sb);
    }

    private static class Problem implements Comparable<Problem> {
        private final String difficulty;
        private final int tier;

        public Problem(String difficulty) {
            this.difficulty = difficulty;

            switch (difficulty.charAt(0)) {
                case 'B':
                    tier = 1;
                    break;
                case 'S':
                    tier = 2;
                    break;
                case 'G':
                    tier = 3;
                    break;
                case 'P':
                    tier = 4;
                    break;
                default:
                    tier = 5;
                    break;
            }
        }

        @Override
        public int compareTo(Problem problem2) {
            int difference = tier - problem2.tier;

            if (difference != 0) {
                return difference;
            }

            return Integer.parseInt(problem2.difficulty.substring(1)) - Integer.parseInt(
                    difficulty.substring(1));
        }
    }
}
