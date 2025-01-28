package p04xxx.p04999;

// 제목 : 아!

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length() < br.readLine().length() ? "no" : "go");
        br.close();
    }
}
