package p16xxx.p16503;

// 제목 : 괄호 없는 사칙연산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int K1 = Integer.parseInt(st.nextToken()), K2, K3, R1 = K1, R2;
        char O1 = st.nextToken().charAt(0), O2;

        R2 = K2 = Integer.parseInt(st.nextToken());
        O2 = st.nextToken().charAt(0);
        K3 = Integer.parseInt(st.nextToken());

        switch (O1) {
            case '+':
                R1 += K2;
                break;
            case '-':
                R1 -= K2;
                break;
            case '*':
                R1 *= K2;
                break;
            case '/':
                R1 /= K2;
                break;
            default:
                break;
        }

        switch (O2) {
            case '+':
                R1 += K3;
                R2 += K3;
                break;
            case '-':
                R1 -= K3;
                R2 -= K3;
                break;
            case '*':
                R1 *= K3;
                R2 *= K3;
                break;
            case '/':
                R1 /= K3;
                R2 /= K3;
                break;
            default:
                break;
        }

        switch (O1) {
            case '+':
                R2 = K1 + R2;
                break;
            case '-':
                R2 = K1 - R2;
                break;
            case '*':
                R2 = K1 * R2;
                break;
            case '/':
                R2 = K1 / R2;
                break;
            default:
                break;
        }

        if (R1 > R2) {
            int T = R2;
            R2 = R1;
            R1 = T;
        }

        System.out.println(R1 + "\n" + R2);
    }
}
