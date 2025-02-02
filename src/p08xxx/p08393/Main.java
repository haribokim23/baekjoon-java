package p08xxx.p08393;

// 제목 : 합

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum;

        n = scanner.nextInt();
        scanner.close();

        sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
