package p02xxx.p02775;

// 제목 : 부녀회장이 될테야

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[15][14];
        int T, k, n, sum;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 14; j++) {
                sum = 0;

                if (i == 0) {
                    array[i][j] = j + 1;
                } else {
                    for (int l = 0; l <= j; l++) {
                        sum += array[i - 1][l];
                    }

                    array[i][j] = sum;
                }
            }
        }

        T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            k = scanner.nextInt();
            n = scanner.nextInt();

            System.out.println(array[k][n - 1]);
        }

        scanner.close();

    }
}
