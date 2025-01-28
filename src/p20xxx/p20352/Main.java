package p20xxx.p20352;

// 제목 : Circus

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.sqrt(Double.parseDouble(br.readLine()) / Math.PI) * 2 * Math.PI);
        br.close();
    }
}
