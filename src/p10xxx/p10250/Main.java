package p10xxx.p10250;

// 제목 : ACM 호텔

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, H, W, N, Y, X, count;

        T = scanner.nextInt();
        Y = 1;

        for (int i = 0; i < T; i++) {
            H = scanner.nextInt();
            W = scanner.nextInt();
            N = scanner.nextInt();
            count = 0;

            for (X = 1; X <= W; X++) {
                for (Y = 1; count < N && Y <= H; Y++) {
                    count++;

                    if (count == N) {
                        System.out.println(Y * 100 + X);
                    }
                }
            }
        }

        scanner.close();

    }
}
