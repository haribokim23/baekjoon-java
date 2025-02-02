package p15xxx.p15792;

// 제목 : A/B - 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        BigDecimal a = new BigDecimal(st.nextToken()), b = new BigDecimal(st.nextToken());

        System.out.println(a.divide(b, 1024, BigDecimal.ROUND_HALF_UP));
    }
}
