package p10xxx.p10869;

// 제목 : 사칙연산

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

    }
}
