package p02xxx.p02846;

// 제목 : 오르막길

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int previous = 1001;
        int start = -1;
        int end;
        int max = 0;

        while (n-- > 0) {
            int current = Integer.parseInt(st.nextToken());

            if (current > previous) {
                if (start == -1) {
                    start = previous;
                }

                end = current;
            } else {
                start = -1;
                end = -1;
            }

            if (start != -1 && end != -1) {
                max = Math.max(max, end - start);
            }

            previous = current;
        }

        System.out.println(max);
    }
}
