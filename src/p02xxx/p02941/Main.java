package p02xxx.p02941;

// 제목 : 크로아티아 알파벳

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        word = scanner.nextLine();
        scanner.close();

        word = word.replace("c=", "1");
        word = word.replace("c-", "2");
        word = word.replace("dz=", "3");
        word = word.replace("d-", "4");
        word = word.replace("lj", "5");
        word = word.replace("nj", "6");
        word = word.replace("s=", "7");
        word = word.replace("z=", "8");

        System.out.println(word.length());

    }
}
