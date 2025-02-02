package p17xxx.p17009;

// 제목 : Winning Score

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()) * 3 + Integer.parseInt(br.readLine()) * 2
                + Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()) * 3
                + Integer.parseInt(br.readLine()) * 2 + Integer.parseInt(br.readLine());
        br.close();

        System.out.println(A > B ? "A" : A < B ? "B" : "T");
    }
}
