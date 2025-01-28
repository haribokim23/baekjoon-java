package p24xxx.p24511;

// 제목 : queuestack

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        StringTokenizer c = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        for (int index = n - 1; index >= 0; index--) {
            if (Integer.parseInt(a[index]) == 1) {
                continue;
            }

            if (m-- == 0) {
                break;
            }

            sb.append(Integer.parseInt(b[index])).append(" ");
        }

        while (m-- > 0) {
            sb.append(Integer.parseInt(c.nextToken())).append(" ");
        }

        System.out.println(sb);
    }
}
