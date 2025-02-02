package p02xxx.p02742;

// 제목 : 기찍 N

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();
        scanner.close();

        for (; n > 0; n--) {
            System.out.println(n);
        }

    }
}
