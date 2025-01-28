package p02xxx.p02739;

// 제목 : 구구단

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }

    }
}
