package p23xxx.p23627;

// 제목 : driip

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().endsWith("driip") ? "cute" : "not cute");
        br.close();
    }
}
