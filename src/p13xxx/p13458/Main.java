package p13xxx.p13458;

// 제목 : 시험 감독

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ai = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(ai);
        long count = 0;

        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(st.nextToken());
            count += 1 + Math.ceil(Math.max((a - b), 0) / c);
        }

        System.out.println(count);
    }
}
