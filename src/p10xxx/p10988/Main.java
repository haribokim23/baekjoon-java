package p10xxx.p10988;

// 제목 : 팰린드롬인지 확인하기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        br.close();

        System.out.println(word.contentEquals(new StringBuilder(word).reverse()) ? 1 : 0);
    }
}
