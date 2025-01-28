package p10xxx.p10179;

// 제목 : 쿠폰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("$0.00");
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(df.format(Double.parseDouble(br.readLine()) * 0.8)).append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}
