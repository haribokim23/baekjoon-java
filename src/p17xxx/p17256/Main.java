package p17xxx.p17256;

// 제목 : 달달함이 넘쳐흘러

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ax, ay, az, cx, cy, cz;

        st = new StringTokenizer(br.readLine());
        ax = Integer.parseInt(st.nextToken());
        ay = Integer.parseInt(st.nextToken());
        az = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        cx = Integer.parseInt(st.nextToken());
        cy = Integer.parseInt(st.nextToken());
        cz = Integer.parseInt(st.nextToken());

        System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax));

    }
}
