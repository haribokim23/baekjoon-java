package p10xxx.p10162;

// 제목 : 전자레인지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), count = 0;
        br.close();

        if (T % 10 == 0) {
            while (T >= 300) {
                count++;
                T -= 300;
            }

            System.out.print(count + " ");

            count = 0;

            while (T >= 60) {
                count++;
                T -= 60;
            }

            System.out.print(count + " ");

            count = 0;

            while (T > 0) {
                count++;
                T -= 10;
            }

            System.out.println(count);
        } else {
            System.out.println(-1);
        }

    }
}
