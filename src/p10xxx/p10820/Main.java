package p10xxx.p10820;

// 제목 : 문자열 분석

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;
        StringBuilder sb = new StringBuilder();

        while ((string = br.readLine()) != null && !string.isEmpty()) {
            int lowercase = 0;
            int uppercase = 0;
            int number = 0;
            int space = 0;

            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    lowercase++;
                } else if (c >= 'A' && c <= 'Z') {
                    uppercase++;
                } else if (c >= '0' && c <= '9') {
                    number++;
                } else {
                    space++;
                }
            }

            sb.append(lowercase).append(" ").append(uppercase).append(" ").append(number)
                    .append(" ").append(space).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
