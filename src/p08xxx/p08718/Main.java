package p08xxx.p08718;

// 제목 : Bałwanek

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int x = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

        System.out.println(1000 * x >= 7000 * k ? 7000 * k
                : 1000 * x >= 3500 * k ? 3500 * k : 1000 * x >= 1750 * k ? 1750 * k : 0);
    }
}
