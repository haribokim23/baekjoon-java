package p02xxx.p02523;

// 제목 : 별 찍기 - 13

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        N = scanner.nextInt();

        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < N - Math.abs(N - 1 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();

    }
}
