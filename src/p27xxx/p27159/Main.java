package p27xxx.p27159;

// 제목 : 노 땡스!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int sum = Integer.parseInt(st.nextToken());

        for (int previous = sum; --n > 0; ) {
            int value = Integer.parseInt(st.nextToken());

            if (value - previous != 1) {
                sum += value;
            }

            previous = value;
        }

        System.out.println(sum);
    }
}
