package p25xxx.p25192;

// 제목 : 인사성 밝은 곰곰이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        int count = 0;

        while (n-- > 0) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                hs.clear();
                continue;
            }

            if (hs.add(input)) {
                count++;
            }
        }

        br.close();
        System.out.println(count);
    }
}
