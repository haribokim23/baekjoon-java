package p13xxx.p13241;

// 제목 : 최소공배수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (b > a) {
            long temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a * b / gcd(a, b));
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
