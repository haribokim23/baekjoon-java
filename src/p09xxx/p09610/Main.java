package p09xxx.p09610;

// 제목 : 사분면

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), x, y, q1 = 0, q2 = 0, q3 = 0, q4 = 0, a = 0;
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (x != 0 && y != 0) {
                if (y > 0) {
                    if (x > 0) {
                        q1++;
                    } else {
                        q2++;
                    }
                } else {
                    if (x < 0) {
                        q3++;
                    } else {
                        q4++;
                    }
                }
            } else {
                a++;
            }
        }

        br.close();
        System.out.println(
                "Q1: " + q1 + "\nQ2: " + q2 + "\nQ3: " + q3 + "\nQ4: " + q4 + "\nAXIS: " + a);
    }
}
