package p01xxx.p01439;

// 제목 : 뒤집기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        int[] counts = new int[2];

        for (int i = 0, previous = -1; i < s.length(); i++) {
            int character = s.charAt(i) - '0';

            if (character != previous) {
                counts[s.charAt(i) - '0']++;
            }

            previous = character;
        }

        System.out.println(Math.min(counts[0], counts[1]));
    }
}
