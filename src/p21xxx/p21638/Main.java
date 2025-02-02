package p21xxx.p21638;

// 제목 : SMS from MCHS

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        br.close();

        System.out.println(t2 < 0 && v2 >= 10
                ? "A storm warning for tomorrow! Be careful and stay home if possible!"
                : t2 < t1 ? "MCHS warns! Low temperature is expected tomorrow."
                        : v2 > v1 ? "MCHS warns! Strong wind is expected tomorrow." : "No message");
    }
}
