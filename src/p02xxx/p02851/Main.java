package p02xxx.p02851;

// 제목 : 슈퍼 마리오

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int previous = 0;
        int current = 0;

        for (int i = 0; i < 10; i++) {
            previous = current;
            current += Integer.parseInt(br.readLine());

            if (current >= 100) {
                break;
            }
        }

        br.close();
        System.out.println(100 - previous < current - 100 ? previous : current);
    }
}
