package p05xxx.p05554;

// 제목 : 심부름 가는 길

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum;

        sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + Integer.parseInt(
                br.readLine()) + Integer.parseInt(br.readLine());
        br.close();

        System.out.println(sum / 60 + "\n" + sum % 60);

    }
}
