package p02xxx.p02292;

// 제목 : 벌집

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, temp, moves;

        N = scanner.nextInt();
        scanner.close();
        temp = 1;
        moves = 1;

        while (temp < N) {
            temp += moves++ * 6;
        }

        System.out.println(moves);

    }
}
