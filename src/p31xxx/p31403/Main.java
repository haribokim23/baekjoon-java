package p31xxx.p31403;

// 제목 : A + B - C

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int c = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - c);
        System.out.println(Integer.parseInt(a + b) - c);
    }
}
