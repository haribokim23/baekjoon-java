package p01xxx.p01008;

// 제목 : A/B

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();

        System.out.println((double) A / B);

    }
}
