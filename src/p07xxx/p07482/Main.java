package p07xxx.p07482;

// 제목 : 상자 만들기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.0000000000");

        while (n-- > 0) {
            sb.append(df.format(Double.parseDouble(br.readLine()) / 6)).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
