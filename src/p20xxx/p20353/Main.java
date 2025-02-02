package p20xxx.p20353;

// 제목 : Atrium

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.sqrt(Double.parseDouble(br.readLine())) * 4);
        br.close();
    }
}
