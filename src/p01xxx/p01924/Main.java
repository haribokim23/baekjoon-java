package p01xxx.p01924;

// 제목 : 2007년

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

        for (int i = 1; i < x; i++) {
            switch (i) {
                case 2:
                    y += 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    y += 30;
                    break;
                default:
                    y += 31;
                    break;
            }
        }

        switch (y % 7) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            default:
                System.exit(-1);
        }
    }
}
