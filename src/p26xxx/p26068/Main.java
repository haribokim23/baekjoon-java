package p26xxx.p26068;

// 제목 : 치킨댄스를 추는 곰곰이를 본 임스 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "-");
            st.nextToken();

            if (Integer.parseInt(st.nextToken()) <= 90) {
                count++;
            }
        }

        br.close();
        System.out.println(count);
    }
}
