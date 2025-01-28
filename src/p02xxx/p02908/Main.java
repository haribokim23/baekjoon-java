package p02xxx.p02908;

// 제목 : 상수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, temp;

        A = 0;
        B = 0;
        temp = scanner.nextInt();

        while (temp != 0) {
            A = A * 10 + temp % 10;
            temp /= 10;
        }

        temp = scanner.nextInt();
        scanner.close();

        while (temp != 0) {
            B = B * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println(Integer.max(A, B));

    }
}
