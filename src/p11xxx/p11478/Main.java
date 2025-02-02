package p11xxx.p11478;

// 제목 : 서로 다른 부분 문자열의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        HashSet<String> substrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                substrings.add(s.substring(i, j + 1));
            }
        }

        System.out.println(substrings.size());
    }
}
