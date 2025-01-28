package p01xxx.p01076;

// 제목 : 저항

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                (Color.valueOf(br.readLine()).ordinal() * 10 + Color.valueOf(br.readLine())
                        .ordinal()) * (long) Math.pow(10, Color.valueOf(br.readLine()).ordinal()));
        br.close();
    }

    public enum Color {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }
}
