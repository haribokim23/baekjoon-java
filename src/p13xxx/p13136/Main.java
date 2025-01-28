package p13xxx.p13136;

// 제목 : Do Not Touch Anything

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()), N
                = Integer.parseInt(st.nextToken());

        System.out.println((long) (Math.ceil(R / N) * Math.ceil(C / N)));
    }
}
