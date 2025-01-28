package p02xxx.p02675;

// 제목 : 문자열 반복

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, R;
        String S, P;

        T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            R = scanner.nextInt();
            S = scanner.next();
            P = "";

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    P += S.charAt(j);
                }
            }

            System.out.println(P);
        }

        scanner.close();

    }
}
