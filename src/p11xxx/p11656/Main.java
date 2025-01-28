package p11xxx.p11656;

// 제목 : 접미사 배열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        br.close();
        int length = sb.length();
        String[] suffixes = new String[length];

        for (int i = 0; i < length; i++) {
            suffixes[i] = sb.toString();
            sb.deleteCharAt(0);
        }

        Arrays.sort(suffixes);
        sb = new StringBuilder();

        for (String suffix : suffixes) {
            sb.append(suffix).append("\n");
        }

        System.out.print(sb);
    }
}
