package p15xxx.p15610;

// 제목 : Abbey Courtyard

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
