package p15xxx.p15128;

// 제목 : Congruent Numbers

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())
                * Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()) / 2 % 1
                == 0 ? 1 : 0);
    }
}
