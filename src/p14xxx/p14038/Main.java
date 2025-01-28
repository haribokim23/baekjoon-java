package p14xxx.p14038;

// 제목 : Tournament Selection

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (br.readLine().charAt(0) == 'W') {
                count++;
            }
        }

        br.close();
        System.out.println(count > 4 ? 1 : count > 2 ? 2 : count > 0 ? 3 : -1);
    }
}
