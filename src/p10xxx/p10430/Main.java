package p10xxx.p10430;

// 제목 : 나머지

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        scanner.close();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);

    }
}
