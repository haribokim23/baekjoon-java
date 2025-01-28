package p10xxx.p10768;

// 제목 : 특별한 날

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int date = Integer.parseInt(br.readLine()) * 32 + Integer.parseInt(br.readLine());

        System.out.println(date < 82 ? "Before" : date > 82 ? "After" : "Special");
        br.close();
    }
}
