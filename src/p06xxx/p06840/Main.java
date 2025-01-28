package p06xxx.p06840;

// 제목 : Who is in the middle?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] weights = new int[3];
        weights[0] = Integer.parseInt(br.readLine());
        weights[1] = Integer.parseInt(br.readLine());
        weights[2] = Integer.parseInt(br.readLine());
        Arrays.sort(weights);
        br.close();
        System.out.println(weights[1]);
    }
}
