package p25xxx.p25372;

// 제목 : 성택이의 은밀한 비밀번호

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int n = Integer.parseInt(br.readLine()); n > 0; n--) {
            int length = br.readLine().length();
            sb.append((length >= 6 && length <= 9) ? "yes" : "no").append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
