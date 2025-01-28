package p26xxx.p26004;

// 제목 : HI-ARC

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();
        int[] counts = new int[5];

        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'H':
                    counts[0]++;
                    break;
                case 'I':
                    counts[1]++;
                    break;
                case 'A':
                    counts[2]++;
                    break;
                case 'R':
                    counts[3]++;
                    break;
                case 'C':
                    counts[4]++;
                    break;
            }
        }

        int max = 100_000;

        for (int count : counts) {
            max = Math.min(max, count);
        }

        System.out.println(max);
    }
}
