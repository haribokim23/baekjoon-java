package p06xxx.p06810;

// 제목 : ISBN

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The 1-3-sum is " + (91 + Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine()) * 3 + Integer.parseInt(br.readLine())));
        br.close();
    }
}
