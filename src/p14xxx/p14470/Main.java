package p14xxx.p14470;

// 제목 : 전자레인지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()), C
                = Integer.parseInt(br.readLine()), D = Integer.parseInt(br.readLine()), E
                = Integer.parseInt(br.readLine()), time = 0;
        br.close();

        while (A < B) {
            if (A < 0) {
                time += C;
                A++;
            } else if (A == 0) {
                time += D + E;
                A++;
            } else {
                time += E;
                A++;
            }
        }

        System.out.println(time);
    }
}
