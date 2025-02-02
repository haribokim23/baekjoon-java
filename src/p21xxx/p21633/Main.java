package p21xxx.p21633;

// 제목 : Bank Transfer

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double commission = Double.parseDouble(br.readLine()) / 100 + 25;
        br.close();

        System.out.println(new DecimalFormat("#.00").format(
                commission < 100 ? 100 : commission > 2000 ? 2000 : commission));
    }
}
