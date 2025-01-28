package p25xxx.p25640;

// 제목 : MBTI

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        int count = 0;

        for (int n = Integer.parseInt(br.readLine()); n > 0; n--) {
            if (br.readLine().equals(mbti)) {
                count++;
            }
        }

        br.close();
        System.out.println(count);
    }
}
