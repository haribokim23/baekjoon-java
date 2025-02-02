package p03xxx.p03733;

// 제목 : Shares

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (String line = br.readLine(); line != null && line.length() != 0;
                line = br.readLine()) {
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            sb.append(Integer.parseInt(st.nextToken()) / (n + 1)).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
