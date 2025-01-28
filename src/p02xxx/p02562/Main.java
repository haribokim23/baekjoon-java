package p02xxx.p02562;

// 제목 : 최댓값

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max, num, n;

        max = 0;
        n = 0;

        for (int i = 0; i < 9; i++) {
            if (max < (num = scanner.nextInt())) {
                max = num;
                n = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(n);

        scanner.close();

    }
}
