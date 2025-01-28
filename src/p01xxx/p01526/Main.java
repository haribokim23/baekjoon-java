package p01xxx.p01526;

// 제목 : 가장 큰 금민수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int n = Integer.parseInt(br.readLine()); n >= 4; n--) {
            if (!(Integer.toString(n).contains("0") || Integer.toString(n).contains("1")
                    || Integer.toString(n).contains("2") || Integer.toString(n).contains("3")
                    || Integer.toString(n).contains("5") || Integer.toString(n).contains("6")
                    || Integer.toString(n).contains("8") || Integer.toString(n).contains("9"))) {
                System.out.println(n);
                break;
            }
        }

        br.close();
    }
}
