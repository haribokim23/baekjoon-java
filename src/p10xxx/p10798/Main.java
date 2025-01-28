package p10xxx.p10798;

// 제목 : 세로읽기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[5];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = br.readLine();
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (String string : strings) {
                if (string.length() > i) {
                    sb.append(string.charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}
