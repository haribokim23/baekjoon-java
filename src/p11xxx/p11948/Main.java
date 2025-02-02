package p11xxx.p11948;

// 제목 : 과목선택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        System.out.println(A + B + C + D - Math.min(Math.min(A, B), Math.min(C, D)) + Math.max(
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
        br.close();
    }
}
