package p14xxx.p14696;

// 제목 : 딱지놀이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int[] a = new int[5];

            for (int i = 0; i < count; i++) {
                a[Integer.parseInt(st.nextToken())]++;
            }

            st = new StringTokenizer(br.readLine());
            count = Integer.parseInt(st.nextToken());
            int[] b = new int[5];

            for (int i = 0; i < count; i++) {
                b[Integer.parseInt(st.nextToken())]++;
            }

            sb.append(a[4] > b[4] ? "A" : a[4] < b[4] ? "B" : a[3] > b[3] ? "A" : a[3] < b[3] ? "B"
                            : a[2] > b[2] ? "A"
                                    : a[2] < b[2] ? "B" : a[1] > b[1] ? "A" : a[1] < b[1] ? "B" :
                                            "D")
                    .append("\n");
        }

        br.close();
        System.out.println(sb);
    }
}
