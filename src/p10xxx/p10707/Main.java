package p10xxx.p10707;

// 제목 : 수도요금

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        br.close();

        X *= P;

        if (P <= C) {
            Y = B;
        } else {
            Y = (P - C) * Y + B;
        }

        System.out.println(Math.min(X, Y));

    }
}
