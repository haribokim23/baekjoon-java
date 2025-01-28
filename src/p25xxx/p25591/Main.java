package p25xxx.p25591;

// 제목 : 푸앙이와 종윤이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int number1 = Integer.parseInt(st.nextToken());
        int number2 = Integer.parseInt(st.nextToken());
        int a = 100 - number1;
        int b = 100 - number2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        int cPlusQ = c + q;

        while (cPlusQ > 100) {
            cPlusQ /= 10;
        }

        System.out.println(
                a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n" + cPlusQ + " " + r);
    }
}
