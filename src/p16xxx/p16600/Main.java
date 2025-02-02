package p16xxx.p16600;

// 제목 : Contemporary Art

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Math.pow(Double.parseDouble(br.readLine()), 0.5) * 4);
        br.close();
    }
}
