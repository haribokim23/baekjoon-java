package p11xxx.p11283;

// 제목 : 한글 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((int) br.readLine().charAt(0) - 44031);
        br.close();

    }
}
