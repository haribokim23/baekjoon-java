package p09xxx.p09996;

// 제목 : 한국이 그리울 땐 서버에 접속하지

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern = br.readLine().replace("*", ".*");
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            sb.append(br.readLine().matches(pattern) ? "DA" : "NE").append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
