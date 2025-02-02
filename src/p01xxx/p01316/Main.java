package p01xxx.p01316;

// 제목 : 그룹 단어 체커

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> used = new ArrayList<Character>();
        int N, count;
        String word;
        char letter;
        boolean repeated;

        N = scanner.nextInt();
        count = 0;

        for (int i = 0; i < N; i++) {
            used.clear();
            word = scanner.next();
            letter = ' ';
            repeated = false;

            for (int j = 0; !repeated && j < word.length(); j++) {
                if (letter != word.charAt(j)) {
                    letter = word.charAt(j);

                    if (used.contains(letter)) {
                        repeated = true;
                    } else {
                        used.add(letter);
                    }
                }

                if (!repeated && j == word.length() - 1) {
                    count++;
                }
            }
        }

        scanner.close();

        System.out.println(count);

    }
}
