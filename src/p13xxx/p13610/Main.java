package p13xxx.p13610;

// 제목 : Volta

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double X = Double.parseDouble(st.nextToken()), Y = Double.parseDouble(st.nextToken());

        System.out.println((int) Math.ceil(Y / (Y - X)));
    }
}
