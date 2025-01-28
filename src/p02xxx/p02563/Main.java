package p02xxx.p02563;

// 제목 : 색종이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] canvas = new int[100][100];

        while (count-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    canvas[x + i][y + j] = 1;
                }
            }
        }

        br.close();
        int area = 0;

        for (int row = 0; row < 100; row++) {
            for (int column = 0; column < 100; column++) {
                area += canvas[row][column];
            }
        }

        System.out.println(area);
    }
}
