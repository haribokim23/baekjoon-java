package p10xxx.p10797;

// 제목 : 10부제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one, count;
        StringTokenizer st;

        one = Integer.parseInt(br.readLine());
        count = 0;
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(st.nextToken()) == one) {
                count++;
            }
        }

        System.out.println(count);

    }
}
