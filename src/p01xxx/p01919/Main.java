package p01xxx.p01919;

// 제목 : 애너그램 만들기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] characters = new int[26];

        for (int i = 0; i < word.length(); i++) {
            characters[word.charAt(i) - 'a']++;
        }

        word = br.readLine();
        br.close();

        for (int i = 0; i < word.length(); i++) {
            characters[word.charAt(i) - 'a']--;
        }

        int count = 0;

        for (int i : characters) {
            count += Math.abs(i);
        }

        System.out.println(count);
    }
}
