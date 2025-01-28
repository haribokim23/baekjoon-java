package p09xxx.p09501;

// 제목 : 꿍의 우주여행

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int count = 0;

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                double v = Double.parseDouble(st.nextToken());
                double f = Double.parseDouble(st.nextToken());
                double c = Double.parseDouble(st.nextToken());

                if (v / c * f >= d) {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
