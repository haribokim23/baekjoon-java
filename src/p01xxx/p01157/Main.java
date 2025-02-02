package p01xxx.p01157;

// 제목 : 단어 공부

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[26];
        String word;
        int max;
        char letter;

        word = scanner.nextLine().toUpperCase();
        scanner.close();
        max = 0;
        letter = 0;

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 65]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                letter = (char) (i + 65);
            } else if (max == count[i]) {
                letter = '?';
            }
        }

        System.out.println(letter);

    }
}
