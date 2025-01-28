package p02xxx.p02884;

// 제목 : 알람 시계

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H, M, time;

        H = scanner.nextInt();
        M = scanner.nextInt();
        scanner.close();

        time = H * 60 + M - 45;

        if (time < 0) {
            time += 24 * 60;
        }

        M = time % 60;
        H = (time - M) / 60;

        System.out.println(H + " " + M);

    }
}
