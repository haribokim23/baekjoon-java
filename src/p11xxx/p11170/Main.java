package p11xxx.p11170;

// 제목 : 0의 개수

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
            int m = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int i = n; i <= m; i++) {
                String s = Integer.toString(i);

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '0') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
