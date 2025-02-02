package p10xxx.p10156;

// 제목 : 과자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())
                - Integer.parseInt(st.nextToken());
        br.close();

        if (m > 0) {
            System.out.println(m);
        } else {
            System.out.println(0);
        }

    }
}
