package p19xxx.p19602;

// 제목 : Dog Treats

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) + 2 * Integer.parseInt(br.readLine())
                + 3 * Integer.parseInt(br.readLine()) >= 10 ? "happy" : "sad");
        br.close();
    }
}
