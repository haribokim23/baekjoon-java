package p10xxx.p10448;

// 제목 : 유레카 이론

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] tn = new int[1001];

        for (int i = 1; i < 46; i++) {
            for (int j = i; j < 46; j++) {
                for (int k = j; k < 46; k++) {
                    int sum = i * (i + 1) / 2 + j * (j + 1) / 2 + k * (k + 1) / 2;

                    if (sum <= 1000) {
                        tn[sum] = 1;
                    }
                }
            }
        }

        while (t-- > 0) {
            System.out.println(tn[Integer.parseInt(br.readLine())]);
        }

        br.close();
    }
}
