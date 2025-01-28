package p11xxx.p11549;

// 제목 : Identifying tea

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < 5; i++) {
            if (T == Integer.parseInt(st.nextToken())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
