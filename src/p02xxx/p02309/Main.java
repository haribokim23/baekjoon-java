package p02xxx.p02309;

// 제목 : 일곱 난쟁이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = -100;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        br.close();
        Arrays.sort(arr);
        int i, j = 0;
        boolean found = false;

        for (i = 0; i < 8; i++) {
            for (j = i + 1; j < 9; j++) {
                if (arr[i] + arr[j] == sum) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < 9; k++) {
            if (!(k == i || k == j)) {
                sb.append(arr[k]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
