package p02xxx.p02490;

// 제목 : 윷놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 3;
        StringTokenizer st;

        while (i-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) {
                case 0:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                default:
                    System.out.println("E");
                    break;
            }
        }

        br.close();
    }
}
