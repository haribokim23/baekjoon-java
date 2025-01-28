package p21xxx.p21591;

// 제목 : Laptop Sticker

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int wc = Integer.parseInt(st.nextToken());
        int hc = Integer.parseInt(st.nextToken());
        int ws = Integer.parseInt(st.nextToken());
        int hs = Integer.parseInt(st.nextToken());

        System.out.println(wc - 2 >= ws && hc - 2 >= hs ? 1 : 0);
    }
}
