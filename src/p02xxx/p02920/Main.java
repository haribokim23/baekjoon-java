package p02xxx.p02920;

// 제목 : 음계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[8];
        int prev, curr;
        boolean isSame;

        st = new StringTokenizer(br.readLine());
        br.close();
        arr[0] = Integer.parseInt(st.nextToken());
        prev = 0;
        curr = 0;
        isSame = true;

        for (int i = 1; i < arr.length && isSame; i++) {
            curr = ((arr[i] = Integer.parseInt(st.nextToken())) - arr[i - 1]);

            if (i > 1) {
                if (prev != curr) {
                    isSame = false;
                }
            }

            prev = curr;
        }

        if (isSame) {
            if (curr == 1) {
                System.out.println("ascending");
            } else {
                System.out.println("descending");
            }
        } else {
            System.out.println("mixed");
        }

    }
}
