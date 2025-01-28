package p05xxx.p05613;

// 제목 : 계산기 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());
        char operator = br.readLine().charAt(0);

        while (operator != '=') {
            switch (operator) {
                case '+':
                    result += Integer.parseInt(br.readLine());
                    break;
                case '-':
                    result -= Integer.parseInt(br.readLine());
                    break;
                case '*':
                    result *= Integer.parseInt(br.readLine());
                    break;
                default:
                    result /= Integer.parseInt(br.readLine());
                    break;
            }

            operator = br.readLine().charAt(0);
        }

        br.close();
        System.out.println(result);
    }
}
