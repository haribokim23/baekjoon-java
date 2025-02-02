package p01xxx.p01264;

// 제목 : 모음의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (String sentence = br.readLine().toLowerCase(); !sentence.equals("#");
                sentence = br.readLine().toLowerCase()) {
            int count = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char character = sentence.charAt(i);

                if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
                        || character == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
