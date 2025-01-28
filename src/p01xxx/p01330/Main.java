package p01xxx.p01330;

// 제목 : 두 수 비교하기

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }

    }
}
