package p02xxx.p02741;

// 제목 : N 찍기

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        N = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < N; i++) {
            System.out.println(i + 1);
        }

    }
}
