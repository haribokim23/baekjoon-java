package p02xxx.p02839;

// 제목 : 설탕 배달

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, count, min;

        N = scanner.nextInt();
        scanner.close();
        min = 1667;

        for (int i = N / 5; i >= 0; i--) {
            if ((N - (5 * i)) % 3 == 0) {
                if ((count = (i + ((N - (5 * i)) / 3))) < min) {
                    min = count;
                }
            }
        }

        if (min == 1667) {
            min = -1;
        }

        System.out.println(min);

    }
}
