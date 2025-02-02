package p16xxx.p16648;

// 제목 : Accumulator Battery

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double t = Double.parseDouble(st.nextToken()), p = Double.parseDouble(st.nextToken()), rate
                = 0;

        rate = t / (p >= 20 ? 100 - p : 120 - 2 * p);

        System.out.println(Math.max(p - 20, 0) * rate + Math.min(p, 20) * 2 * rate);
    }
}
