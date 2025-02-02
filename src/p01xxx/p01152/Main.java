package p01xxx.p01152;

// 제목 : 단어의 개수

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split;
        int count;

        split = scanner.nextLine().split(" ");
        scanner.close();
        count = 0;

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                count++;
            }
        }

        System.out.println(count);

    }
}
