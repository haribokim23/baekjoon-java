package p05xxx.p05928;

// 제목 : Contest Timing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int startTime = (11 * 24 + 11) * 60 + 11, endTime =
                (Integer.parseInt(st.nextToken()) * 24 + Integer.parseInt(st.nextToken())) * 60
                        + Integer.parseInt(st.nextToken());

        System.out.println(endTime < startTime ? -1 : endTime - startTime);
    }
}
