package p10xxx.p10039;

// 제목 : 평균 점수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score, temp;

        score = 0;

        for (int i = 0; i < 5; i++) {
            temp = scanner.nextInt();

            if (temp < 40) {
                temp = 40;
            }

            score += temp;
        }

        System.out.println(score / 5);

        scanner.close();

    }
}
