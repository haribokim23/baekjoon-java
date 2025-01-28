package p20xxx.p20492;

// 제목 : 세금

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((int) (n * 0.78) + " " + (int) (n * 0.956));
    }
}
