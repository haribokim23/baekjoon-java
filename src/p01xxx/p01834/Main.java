package p01xxx.p01834;

// 제목 : 나머지와 몫이 같은 수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        long sum = 0;

        for (long i = 1; i < n; i++) {
            sum += n * i + i;
        }

        System.out.println(sum);
    }
}
