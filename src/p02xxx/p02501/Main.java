package p02xxx.p02501;

// 제목 : 약수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

            if (count == k) {
                System.out.println(i);
                break;
            }
        }

        if (count < k) {
            System.out.println(0);
        }
    }
}
