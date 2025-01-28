package p01xxx.p01463;

// 제목 : 1로 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] arr = new int[1000001];
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;

        for (int i = 4; i <= n; i++) {
            int min = arr[i - 1];

            if (i % 2 == 0 && arr[i / 2] < min) {
                min = arr[i / 2];
            }

            if (i % 3 == 0 && arr[i / 3] < min) {
                min = arr[i / 3];
            }

            arr[i] = min + 1;
        }

        System.out.println(arr[n]);
    }
}
