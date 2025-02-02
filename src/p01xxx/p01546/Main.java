package p01xxx.p01546;

// 제목 : 평균

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] score;
        int N, M;
        double sum;

        N = scanner.nextInt();
        score = new double[N];
        M = -1;
        sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();

            if (M < score[i]) {
                M = (int) score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] / M * 100;

            sum += score[i];
        }

        System.out.println(sum / N);

        scanner.close();

    }
}
