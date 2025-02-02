package p02xxx.p02439;

// 제목 : 별 찍기 - 2

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        N = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
