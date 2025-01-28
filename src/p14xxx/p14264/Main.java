package p14xxx.p14264;

// 제목 : 정육각형과 삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                Math.pow(Double.parseDouble(br.readLine()), 2) * Math.sin(Math.toRadians(120)) / 2);
        br.close();
    }
}
