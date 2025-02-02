package p01xxx.p01026;

// 제목 : 보물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        br.close();

        int[] A = new int[N];
        Integer[] B = new Integer[N];

        for (int index = 0; index < N; index++) {
            A[index] = Integer.parseInt(st1.nextToken());
            B[index] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        int S = 0;

        for (int index = 0; index < N; index++) {
            S += A[index] * B[index];
        }

        System.out.println(S);
    }
}
