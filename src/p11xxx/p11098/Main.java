package p11xxx.p11098;

// 제목 : 첼시를 도와줘!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int p = Integer.parseInt(br.readLine());
            int max = 0;
            String name = "";

            while (p-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());

                if (price > max) {
                    max = price;
                    name = st.nextToken();
                }
            }

            sb.append(name).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
