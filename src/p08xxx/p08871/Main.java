package p08xxx.p08871;

// 제목 : Zadanie próbne 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((n + 1) * 2 + " " + (n + 1) * 3);
    }
}
