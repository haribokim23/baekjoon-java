package p01xxx.p01011;

// 제목 : Fly me to the Alpha Centauri

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, y, moves;

        T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            y = (scanner.nextInt() - scanner.nextInt()) * -1;
            moves = 0;

            for (int j = 1; y > 0; j++) {
                if (y > j) {
                    y -= j * 2;
                    moves += 2;
                } else {
                    y -= j;
                    moves++;
                }
            }

            System.out.println(moves);
        }

        scanner.close();

    }
}
