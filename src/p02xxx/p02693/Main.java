package p02xxx.p02693;

// 제목 : N번째 큰 수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array);
            System.out.println(array[7]);
        }

        br.close();
    }
}
