package p01xxx.p01543;

// 제목 : 문서 검색

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();
        int wordLength = word.length();
        br.close();
        int count = 0;

        for (int i = 0; i < document.length() - wordLength + 1; i++) {
            boolean contains = true;

            for (int j = 0; j < wordLength; j++) {
                if (document.charAt(i + j) != word.charAt(j)) {
                    contains = false;
                    break;
                }
            }

            if (contains) {
                count++;
                i += wordLength - 1;
            }
        }

        System.out.println(count);
    }
}
