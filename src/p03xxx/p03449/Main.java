package p03xxx.p03449;

// 제목 : 해밍 거리

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String one = br.readLine();
            String two = br.readLine();
            int count = 0;

            for (int i = 0; i < one.length(); i++) {
                if (one.charAt(i) != two.charAt(i)) {
                    count++;
                }
            }

            System.out.println("Hamming distance is " + count + ".");
        }

        br.close();
    }
}
