package p02xxx.p02558;

// 제목 : A+B - 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()));
        br.close();

    }
}
