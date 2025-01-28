package p26xxx.p26711;

// 제목 : A+B

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        br.close();
        int index = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (index < a.length() && index < b.length()) {
            int sum = a.charAt(a.length() - ++index) - '0' + b.charAt(b.length() - index) - '0'
                    + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }

        if (index == a.length()) {
            a = b;
        }

        while (index < a.length()) {
            int sum = a.charAt(a.length() - ++index) - '0' + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            sb.insert(0, 1);
        }

        System.out.println(sb);
    }
}
