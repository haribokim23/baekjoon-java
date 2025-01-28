package p02xxx.p02577;

// 제목 : 숫자의 개수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, n;
        String product;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        product = Integer.toString(A * B * C);

        for (int i = 0; i < 10; i++) {
            n = 0;

            for (int j = 0; j < product.length(); j++) {
                if (product.substring(j, j + 1).equals(Integer.toString(i))) {
                    n++;
                }
            }
            System.out.println(n);
        }

        scanner.close();

    }
}
