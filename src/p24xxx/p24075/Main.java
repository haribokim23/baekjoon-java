package p24xxx.p24075;

// 제목 : 計算 (Calculation)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int max = A + B;
        int min = A - B;

        System.out.println(max > min ? max + "\n" + min : min + "\n" + max);
    }
}
