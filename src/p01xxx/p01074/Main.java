package p01xxx.p01074;

// 제목 : Z

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int r;
    private static int c;
    private static int order;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        order = 0;
        recurse(0, 0, (int) Math.pow(2, n));
        System.out.println(order);
    }

    private static void recurse(int x, int y, int length) {
        if (length == 1) {
            return;
        }

        length /= 2;

        if (r - y < length) {
            if (c - x < length) {
                recurse(x, y, length);
            } else {
                order += length * length;
                recurse(x + length, y, length);
            }
        } else {
            if (c - x < length) {
                order += length * length * 2;
                recurse(x, y + length, length);
            } else {
                order += length * length * 3;
                recurse(x + length, y + length, length);
            }
        }
    }
}
