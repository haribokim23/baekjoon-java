package p16xxx.p16486;

// 제목 : 운동장 한 바퀴

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) * 2
                + Integer.parseInt(br.readLine()) * 2 * 3.141592);
        br.close();
    }
}
