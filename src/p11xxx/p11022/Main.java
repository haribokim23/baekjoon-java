package p11xxx.p11022;

// 제목 : A+B - 8

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, sum, num;

        T = scanner.nextInt();
        sum = 0;

        for (int i = 0; i < T; i++, sum = 0) {
            System.out.print("Case #" + (i + 1) + ": ");

            num = scanner.nextInt();

            sum += num;

            System.out.print(num + " + ");

            num = scanner.nextInt();

            sum += num;

            System.out.println(num + " = " + sum);
        }

        scanner.close();

    }
}
