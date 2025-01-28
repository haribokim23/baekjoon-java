package p02xxx.p02857;

// 제목 : FBI

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            if (br.readLine().contains("FBI")) {
                sb.append(i + 1).append(" ");
            }
        }

        br.close();
        System.out.println(sb.length() == 0 ? "HE GOT AWAY!" : sb);
    }
}
