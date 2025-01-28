package p08xxx.p08674;

// 제목 : Tabliczka

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

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a % 2 == 0 || b % 2 == 0 ? 0 : a % 2 == 1 ? a : b);
    }
}
