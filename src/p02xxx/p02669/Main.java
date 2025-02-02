package p02xxx.p02669;

// 제목 : 직사각형 네개의 합집합의 면적 구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[100][100];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int row = y1; row < y2; row++) {
                for (int column = x1; column < x2; column++) {
                    array[row][column] = 1;
                }
            }
        }

        br.close();

        int area = 0;

        for (int[] ints : array) {
            for (int count : ints) {
                area += count;
            }
        }

        System.out.println(area);
    }
}
