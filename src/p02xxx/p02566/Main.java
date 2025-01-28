package p02xxx.p02566;

// 제목 : 최댓값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxValue = -1;
        int maxRow = -1;
        int maxColumn = -1;

        for (int row = 1; row <= 9; row++) {
            st = new StringTokenizer(br.readLine());

            for (int column = 1; column <= 9; column++) {
                int value = Integer.parseInt(st.nextToken());

                if (value > maxValue) {
                    maxValue = value;
                    maxRow = row;
                    maxColumn = column;
                }
            }
        }

        br.close();
        System.out.println(maxValue + "\n" + maxRow + " " + maxColumn);
    }
}
