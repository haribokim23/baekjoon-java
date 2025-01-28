package p15xxx.p15727;

// 제목 : 조별과제를 하려는데 조장이 사라졌다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((Integer.parseInt(br.readLine()) - 1) / 5 + 1);
        br.close();

    }
}
