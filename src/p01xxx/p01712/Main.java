package p01xxx.p01712;

// 제목 : 손익분기점

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        scanner.close();

        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }

    }
}
