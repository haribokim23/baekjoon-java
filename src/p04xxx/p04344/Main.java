package p04xxx.p04344;

// 제목 : 평균은 넘겠지

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score;
        int C, N;
        double average, ratio;

        C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            N = scanner.nextInt();
            score = new int[N];
            average = 0;
            ratio = 0;

            for (int j = 0; j < N; j++) {
                score[j] = scanner.nextInt();
                average += score[j];
            }

            average /= N;

            for (int j = 0; j < N; j++) {
                if (average < score[j]) {
                    ratio++;
                }
            }

            ratio = ratio / N * 100;

            System.out.println(String.format("%.3f", ratio) + "%");

        }

        scanner.close();

    }
}
