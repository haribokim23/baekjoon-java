package p11xxx.p11021;

// 제목 : A+B - 7

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, sum;

        T = scanner.nextInt();
        sum = 0;

        for (int i = 0; i < T; i++, sum = 0) {
            sum += scanner.nextInt();
            sum += scanner.nextInt();

            System.out.println("Case #" + (i + 1) + ": " + sum);
        }

        scanner.close();

    }
}
