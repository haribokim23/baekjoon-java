package p11xxx.p11282;

// 제목 : 한글

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((char) (Integer.parseInt(br.readLine()) + 44031));
        br.close();
    }
}
