package p01xxx.p01343;

// 제목 : 폴리오미노

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        br.close();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < board.length(); i++) {
            char character = board.charAt(i);

            if (character == 'X') {
                count++;

                if (count == 4) {
                    count = 0;
                    sb.append("AAAA");
                }

                continue;
            }

            if (count % 2 == 1) {
                System.out.println(-1);
                return;
            }

            if (count == 2) {
                count = 0;
                sb.append("BB");
            }

            sb.append(".");
        }

        if (count % 2 == 1) {
            System.out.println(-1);
            return;
        }

        if (count == 2) {
            sb.append("BB");
        }

        System.out.println(sb);
    }
}
