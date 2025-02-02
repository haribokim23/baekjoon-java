package p26xxx.p26575;

// 제목 : Pups

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.00");

        for (int n = Integer.parseInt(br.readLine()); n > 0; n--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("$").append(df.format(
                    Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken())
                            * Double.parseDouble(st.nextToken()))).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
