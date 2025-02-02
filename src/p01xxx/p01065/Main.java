package p01xxx.p01065;

// 제목 : 한수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, prev, curr, count;
        boolean value;

        N = scanner.nextInt();
        scanner.close();
        count = 0;

        for (int i = 0; i < N; i++) {
            prev = ((i + 1) % 10) - ((i + 1) / 10 % 10);
            value = true;

            for (int j = i + 1; 99 < i + 1 && 9 < j; j /= 10) {
                if (value) {
                    curr = (j % 10) - (j / 10 % 10);

                    if (prev == curr) {
                        prev = curr;
                    } else {
                        value = false;
                    }
                } else {
                    break;
                }
            }

            if (value) {
                count++;
            }
        }

        System.out.println(count);

    }
}
