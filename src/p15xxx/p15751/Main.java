package p15xxx.p15751;

// 제목 : Teleportation

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println(Math.min(b - a, Math.abs(a - x) + Math.abs(b - y)));
    }
}
