package p09xxx.p09086;

// 제목 : 문자열

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String string = br.readLine();
            sb.append(string.charAt(0)).append(string.charAt(string.length() - 1)).append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}
