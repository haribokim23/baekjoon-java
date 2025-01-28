package p10xxx.p10818;

// 제목 : 최소, 최대

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, num, min, max;

        N = scanner.nextInt();
        min = 1000001;
        max = -1000001;

        for (int i = 0; i < N; i++) {
            num = scanner.nextInt();

            if (num < min) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }

        System.out.println(min + " " + max);

        scanner.close();

    }
}
