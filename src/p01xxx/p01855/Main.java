package p01xxx.p01855;

// 제목 : 암호

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String string = br.readLine();
        br.close();
        int rows = string.length() / k;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < rows; j++) {
                boolean even = j % 2 == 0;
                sb.append(string.charAt(i + k * (j + (even ? 0 : 1)) - (even ? 0 : 2 * i + 1)));
            }
        }

        System.out.println(sb);
    }
}
