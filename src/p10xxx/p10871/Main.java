package p10xxx.p10871;

// 제목 : X보다 작은 수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, X, num;
        String answer = "";

        N = scanner.nextInt();
        X = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            num = scanner.nextInt();

            if (num < X) {
                if (!answer.equals("")) {
                    answer += " ";
                }
                answer += num;
            }
        }

        System.out.println(answer);

        scanner.close();

    }
}
