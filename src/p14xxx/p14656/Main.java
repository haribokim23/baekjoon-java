package p14xxx.p14656;

// 제목 : 조교는 새디스트야!!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            if (Integer.parseInt(st.nextToken()) != i) {
                count++;
            }
        }

        System.out.println(count);
    }
}
