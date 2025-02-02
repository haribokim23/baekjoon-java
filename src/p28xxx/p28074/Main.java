package p28xxx.p28074;

// 제목 : 모비스

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        br.close();
        int length = string.length();

        if (length < 5) {
            System.out.println("NO");
            return;
        }

        boolean m = false;
        boolean o = false;
        boolean b = false;
        boolean i = false;
        boolean s = false;

        for (int index = 0; index < length; index++) {
            switch (string.charAt(index)) {
                case 'M':
                    m = true;
                    break;
                case 'O':
                    o = true;
                    break;
                case 'B':
                    b = true;
                    break;
                case 'I':
                    i = true;
                    break;
                case 'S':
                    s = true;
                    break;
            }
        }

        System.out.println(m && o && b && i && s ? "YES" : "NO");
    }
}
