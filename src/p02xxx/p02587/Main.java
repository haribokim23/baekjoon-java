package p02xxx.p02587;

// 제목 : 대표값2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;
            numbers[i] = number;
        }

        br.close();

        Arrays.sort(numbers);
        System.out.println(sum / 5);
        System.out.println(numbers[2]);
    }
}
