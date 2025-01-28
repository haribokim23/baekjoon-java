package p14xxx.p14065;

// 제목 : Gorivo

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(100 / (Double.parseDouble(br.readLine()) * 1.609344 / 3.785411784));
        br.close();
    }
}
