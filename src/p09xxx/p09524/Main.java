package p09xxx.p09524;

// 제목 : Beautiful Yekaterinburg

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());

        System.out.println(D == 1 ? 1 : D == 2 ? 7 : D == 3 ? 2 : 3);
        br.close();
    }
}
