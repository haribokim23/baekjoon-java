package p15xxx.p15688;

// 제목 : 수 정렬하기 5

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.print(sb);
    }
}
