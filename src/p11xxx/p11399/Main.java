package p11xxx.p11399;

// 제목 : ATM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, time;
        Integer[] arr;
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        time = 0;
        arr = new Integer[N];
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = N; i > 0; i--) {
            time += arr[i - 1] * i;
        }

        System.out.println(time);

    }
}
