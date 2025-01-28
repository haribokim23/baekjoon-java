package p26xxx.p26489;

// 제목 : Gum Gum for Jay Jay

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (String line = br.readLine(); line != null && line.length() != 0;
                line = br.readLine()) {
            count++;
        }

        br.close();
        System.out.println(count);
    }
}
