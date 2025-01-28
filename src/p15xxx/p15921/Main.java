package p15xxx.p15921;

// 제목 : 수찬은 마린보이야!!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) == 0 ? "divide by zero" : "1.00");
        br.close();

    }
}
