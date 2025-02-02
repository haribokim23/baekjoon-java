package p10xxx.p10809;

// 제목 : 알파벳 찾기

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int pos;

        s = scanner.nextLine();
        scanner.close();

        for (int i = 'a'; i <= 'z'; i++) {
            pos = -1;
            pos = s.indexOf(i);

            System.out.print(pos);
            if (i < 'z') {
                System.out.print(" ");
            }
        }

    }
}
