package p16xxx.p16433;

// 제목 : 주디와 당근농장

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int half = n / 2;
        boolean odd = n % 2 == 1;
        StringBuilder one;
        StringBuilder two;

        // 언어 : Java 11 -> Java 8
        if ((r + c) % 2 == 0) {
            one = new StringBuilder();
            two = new StringBuilder();

            for (int count = 0; count < half; count++) {
                one.append("v.");
                two.append(".v");
            }

            one.append(odd ? "v\n" : "\n");
            two.append(odd ? ".\n" : "\n");
        } else {
            one = new StringBuilder();
            two = new StringBuilder();

            for (int count = 0; count < half; count++) {
                one.append(".v");
                two.append("v.");
            }

            one.append(odd ? ".\n" : "\n");
            two.append(odd ? "v\n" : "\n");
        }
        // if ((r + c) % 2 == 0) {
        //     one = new StringBuilder("v.".repeat(half)).append(odd ? "v\n" : "\n");
        //     two = new StringBuilder(".v".repeat(half)).append(odd ? ".\n" : "\n");
        // } else {
        //     one = new StringBuilder(".v".repeat(half)).append(odd ? ".\n" : "\n");
        //     two = new StringBuilder("v.".repeat(half)).append(odd ? "v\n" : "\n");
        // }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < half; i++) {
            sb.append(one).append(two);
        }

        if (odd) {
            sb.append(one);
        }

        System.out.print(sb);
    }
}
