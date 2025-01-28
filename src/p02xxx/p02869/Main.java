package p02xxx.p02869;

// 제목 : 달팽이는 올라가고 싶다

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, V;

        A = scanner.nextInt();
        B = scanner.nextInt();
        V = scanner.nextInt();
        scanner.close();

        System.out.println((int) Math.ceil((V - A) / (A - B) + 1));

    }
}
