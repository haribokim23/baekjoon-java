package p10xxx.p10952;

// 제목 : A+B - 5

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;

        while ((sum = scanner.nextInt()) != 0) {
            sum += scanner.nextInt();
            System.out.println(sum);
        }

        scanner.close();

    }
}
