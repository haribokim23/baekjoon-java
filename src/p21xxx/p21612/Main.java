package p21xxx.p21612;

// 제목 : Boiling Water

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine()) * 5 - 400;
        br.close();

        System.out.println(P + "\n" + Integer.compare(P, 100) * -1);
    }
}
