package p03xxx.p03053;

// 제목 : 택시 기하학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.000000");
        int R;

        R = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(df.format(Math.PI * R * R));
        System.out.println(df.format(2 * R * R));

    }
}
