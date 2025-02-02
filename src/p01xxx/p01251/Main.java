package p01xxx.p01251;

// 제목 : 단어 나누기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        br.close();
        int end = word.length() - 2;
        String[] substrings = new String[end];

        for (int i = 0; i < end; i++) {
            substrings[i] = new StringBuilder(word.substring(0, i + 1)).reverse().toString();
        }

        Arrays.sort(substrings);
        StringBuilder sb = new StringBuilder(substrings[0]);
        int start = sb.length();
        end = end - start + 1;
        substrings = new String[end];

        for (int i = 0; i < end; i++) {
            substrings[i] = new StringBuilder(word.substring(start, i + start + 1)).reverse()
                    .toString();
        }

        Arrays.sort(substrings);
        sb.append(substrings[0]).append(new StringBuilder(word.substring(sb.length())).reverse());
        System.out.println(sb);
    }
}
