package p11xxx.p11931;

// 제목 : 수 정렬하기 4

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine()) * -1;
        }

        br.close();
        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            sb.append(number * -1).append("\n");
        }

        System.out.print(sb);
    }
}
