package p12xxx.p12790;

// 제목 : Mini Fantasy War

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ph = Integer.parseInt(st.nextToken()), pm = Integer.parseInt(st.nextToken()), pa
                    = Integer.parseInt(st.nextToken()), pd = Integer.parseInt(st.nextToken()), ah
                    = Integer.parseInt(st.nextToken()), am = Integer.parseInt(st.nextToken()), aa
                    = Integer.parseInt(st.nextToken()), ad = Integer.parseInt(st.nextToken());

            sb.append((int) ((Math.max(ph + ah, 1)) + 5 * (Math.max(pm + am, 1)) + 2 * (Math.max(
                    pa + aa, 0)) + 2 * (pd + ad))).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
