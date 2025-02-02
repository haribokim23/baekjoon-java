package p05xxx.p05086;

// 제목 : 배수와 약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a, b;

        while ((a = Integer.parseInt(st.nextToken())) != 0) {
            b = Integer.parseInt(st.nextToken());
            System.out.println(b % a == 0 ? "factor" : a % b == 0 ? "multiple" : "neither");

            st = new StringTokenizer(br.readLine());
        }

        br.close();
    }
}
