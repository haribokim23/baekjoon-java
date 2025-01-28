package p16xxx.p16017;

// 제목 : Telemarketer or not?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((Integer.parseInt(br.readLine()) > 7) && (Integer.parseInt(br.readLine())
                == Integer.parseInt(br.readLine())) && (Integer.parseInt(br.readLine()) > 7)
                ? "ignore" : "answer");
        br.close();
    }
}
