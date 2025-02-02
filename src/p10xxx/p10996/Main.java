package p10xxx.p10996;

// 제목 : 별 찍기 - 21

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        N = scanner.nextInt();

        if (N == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < 2 * N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();

    }
}
