package p08xxx.p08958;

// 제목 : OX퀴즈

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, score, total;
        String result;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            score = 0;
            total = 0;
            result = scanner.next();

            for (int j = 0; j < result.length(); j++) {
                if (result.substring(j, j + 1).equals("O")) {
                    score++;
                } else {
                    score = 0;
                }

                total += score;
            }

            System.out.println(total);
        }

        scanner.close();

    }
}
