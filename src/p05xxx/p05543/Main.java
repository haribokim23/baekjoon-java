package p05xxx.p05543;

// 제목 : 상근날드

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int burger, drink, temp;

        burger = scanner.nextInt();
        if ((temp = scanner.nextInt()) < burger) {
            burger = temp;
        }
        if ((temp = scanner.nextInt()) < burger) {
            burger = temp;
        }

        drink = scanner.nextInt();
        if ((temp = scanner.nextInt()) < drink) {
            drink = temp;
        }

        temp = burger + drink - 50;

        System.out.println(temp);

        scanner.close();

    }
}
