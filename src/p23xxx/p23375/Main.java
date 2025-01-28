package p23xxx.p23375;

// 제목 : Arm Coordination

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(
                (x - r) + " " + (y - r) + "\n" + (x - r) + " " + (y + r) + "\n" + (x + r) + " " + (y
                        + r) + "\n" + (x + r) + " " + (y - r));
    }
}
