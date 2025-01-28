package p01xxx.p01193;

// 제목 : 분수찾기

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, count, row, col;

        X = scanner.nextInt();
        scanner.close();
        count = 1;
        row = 1;
        col = 1;

        for (int i = 0; count < X; i++) {
            if (i % 2 == 0) {
                if (i % 4 == 0) {
                    col++;
                    count++;
                } else {
                    row++;
                    count++;
                }
            } else {
                for (int j = 0; j < i / 2 + 1 && count < X; j++) {
                    if ((i - 1) % 4 == 0) {
                        row++;
                        col--;
                        count++;
                    } else {
                        row--;
                        col++;
                        count++;
                    }
                }
            }
        }

        System.out.println(row + "/" + col);

    }
}
