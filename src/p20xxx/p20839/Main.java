package p20xxx.p20839;

// 제목 : Betygsättning

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double z = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double xp = Double.parseDouble(st.nextToken());
        double yp = Double.parseDouble(st.nextToken());
        double zp = Double.parseDouble(st.nextToken());
        br.close();

        if (y == yp) {
            if (x == xp) {
                System.out.println("A");
            } else if (xp >= x / 2) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else if (yp >= y / 2) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
