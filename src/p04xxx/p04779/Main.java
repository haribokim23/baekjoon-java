package p04xxx.p04779;

// 제목 : 칸토어 집합

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static String[] memo;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        memo = new String[13];
        memo[0] = "-";
        StringBuilder sb = new StringBuilder();

        for (String s = br.readLine(); s != null && !s.isEmpty(); s = br.readLine()) {
            int n = Integer.parseInt(s);
            sb.append(recurse(n)).append("\n");
        }

        br.close();
        System.out.print(sb);
    }

    private static String recurse(int n) {
        if (memo[n] != null) {
            return memo[n];
        }

        String previous = recurse(n - 1);
        String current = previous.concat(" ".repeat(previous.length())).concat(previous);
        memo[n] = current;
        return current;
    }
}
