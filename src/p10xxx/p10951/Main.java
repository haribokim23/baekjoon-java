package p10xxx.p10951;

// 제목 : A+B - 4

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;

        while (scanner.hasNext()) {
            sum = scanner.nextInt();
            sum += scanner.nextInt();

            System.out.println(sum);
        }

        scanner.close();

    }
}
