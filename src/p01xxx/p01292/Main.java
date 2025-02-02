package p01xxx.p01292;

// 제목 : 쉽게 푸는 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 1, count = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (a <= ++count && count <= b) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);
    }
}
