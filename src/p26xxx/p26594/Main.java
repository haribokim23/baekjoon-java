package p26xxx.p26594;

// 제목 : ZOAC 5

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        br.close();

        int length = string.length();
        string = string.replaceAll(String.valueOf(string.charAt(0)), "");
        System.out.println(length - string.length());
    }
}
