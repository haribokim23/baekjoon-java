package p02xxx.p02477;

// 제목 : 참외밭

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[][] lengths = new int[6][2];

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());

            // 언어 : Java 15 -> Java 8
            switch (direction) {
                case 4:
                    direction = 1;
                    break;
                case 1:
                    direction = 4;
                    break;
            }
            // switch (direction) {
            //     case 4 -> direction = 1;
            //     case 1 -> direction = 4;
            // }

            lengths[i][0] = direction;
            lengths[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        for (int i = 0; i < 6; i++) {
            if (lengths[i][0] == lengths[(i + 2) % 6][0] && lengths[(i + 1) % 6][0] == lengths[
                    (i + 3) % 6][0]) {
                System.out.println(((lengths[(i + 4) % 6][1] * lengths[(i + 5) % 6][1]) - (
                        lengths[(i + 1) % 6][1] * lengths[(i + 2) % 6][1])) * k);
                break;
            }
        }
    }
}
