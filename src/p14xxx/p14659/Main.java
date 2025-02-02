package p14xxx.p14659;

// 제목 : 한조서열정리하고옴ㅋㅋ

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] heights = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            int height = heights[i];
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                if (heights[j] > height) {
                    break;
                }

                count++;
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
