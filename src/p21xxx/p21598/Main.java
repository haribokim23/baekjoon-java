package p21xxx.p21598;

// 제목 : SciComLove

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            sb.append("SciComLove\n");
        }

        System.out.print(sb);
    }
}
