package p04xxx.p04299;

// 제목 : AFC 윔블던

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int s = Integer.parseInt(st.nextToken()), d = s - Integer.parseInt(st.nextToken());

        System.out.println(d >= 0 && d % 2 == 0 ? s - d / 2 + " " + d / 2 : -1);
    }
}
