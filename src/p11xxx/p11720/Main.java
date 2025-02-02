package p11xxx.p11720;

// 제목 : 숫자의 합

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, sum;
        String num;

        N = scanner.nextInt();
        num = scanner.next();
        scanner.close();
        sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(sum);

    }
}
