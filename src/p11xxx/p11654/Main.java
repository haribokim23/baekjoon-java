package p11xxx.p11654;

// 제목 : 아스키 코드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((int) br.readLine().charAt(0));

    }
}
