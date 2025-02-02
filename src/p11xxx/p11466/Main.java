package p11xxx.p11466;

// 제목 : Alex Origami Squares

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());

        if (h > w) {
            double temp = h;
            h = w;
            w = temp;
        }

        System.out.println(h <= w / 3 ? h : h / 2 <= w / 3 ? w / 3 : h / 2);
    }
}
