package p14xxx.p14681;

// 제목 : 사분면 고르기

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();

        if (y > 0) {
            if (x > 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else {
            if (x < 0) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        }

    }
}
