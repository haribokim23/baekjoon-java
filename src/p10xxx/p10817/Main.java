package p10xxx.p10817;

// 제목 : 세 수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        if ((B <= A && A <= C) || (C <= A && A <= B)) {
            System.out.println(A);
        } else if ((A <= B && B <= C) || (C <= B && B <= A)) {
            System.out.println(B);
        } else if ((A <= C && C <= B) || (B <= C && C <= A)) {
            System.out.println(C);
        }

        scanner.close();

    }
}
