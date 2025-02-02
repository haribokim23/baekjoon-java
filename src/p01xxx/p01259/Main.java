package p01xxx.p01259;

// 제목 : 팰린드롬수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        input = "";

        while (!(input = br.readLine()).equals("0")) {
            if (input.equals(new StringBuilder(input).reverse().toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        br.close();

    }
}
