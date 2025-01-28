package p05xxx.p05717;

// 제목 : 상근이의 친구들

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(input);

            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                    .append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
