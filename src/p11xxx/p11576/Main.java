package p11xxx.p11576;

// 제목 : Base Conversion

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        int base10 = 0;

        while (m-- > 0) {
            base10 = base10 * a + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        while (base10 != 0) {
            sb.insert(0, base10 % b + " ");
            base10 /= b;
        }

        System.out.println(sb);
    }
}
