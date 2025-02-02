package p10xxx.p10984;

// 제목 : 내 학점을 구해줘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), N, c, C;
        double G;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.0");

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            c = 0;
            G = 0;

            while (N-- > 0) {
                st = new StringTokenizer(br.readLine());
                C = Integer.parseInt(st.nextToken());
                c += C;
                G += C * Double.parseDouble(st.nextToken());
            }

            sb.append(c).append(" ").append(df.format(G / c)).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
