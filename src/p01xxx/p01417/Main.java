package p01xxx.p01417;

// 제목 : 국회의원 선거

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        int[] votes = new int[101];
        int max = 0;

        while (n-- > 1) {
            int vote = Integer.parseInt(br.readLine());
            votes[vote]++;
            max = Math.max(max, vote);
        }

        br.close();
        int count = 0;

        while (dasom <= max) {
            if (votes[max] == 0) {
                max--;
                continue;
            }

            votes[max]--;
            votes[max - 1]++;
            dasom += 1;
            count += 1;
        }

        System.out.println(count);
    }
}
