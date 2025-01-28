package p01xxx.p01110;

// 제목 : 더하기 사이클

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, given, found, count, sum;

        N = scanner.nextInt();
        given = N;
        found = -1;
        count = 0;

        while (N != found) {
            if (0 <= found) {
                given = found;
            }
            if (given < 10) {
                sum = given;
            } else {
                sum = given / 10 + given % 10;
            }
            found = given % 10 * 10 + sum % 10;

            count++;
        }

        System.out.println(count);

        scanner.close();

    }
}
