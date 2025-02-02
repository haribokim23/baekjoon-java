package p02xxx.p02476;

// 제목 : 주사위 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), input, largest, count, most, prize, max = 0;
        StringTokenizer st;
        int[] arr;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            largest = 0;
            count = 0;
            most = 0;
            arr = new int[6];

            for (int i = 0; i < 3; i++) {
                input = Integer.parseInt(st.nextToken());

                arr[input - 1]++;

                if (input > largest) {
                    largest = input;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > count) {
                    count = arr[i];
                    most = i + 1;
                }
            }

            switch (count) {
                case 3:
                    prize = most * 1000 + 10000;
                    break;
                case 2:
                    prize = most * 100 + 1000;
                    break;
                default:
                    prize = largest * 100;
                    break;
            }

            if (prize > max) {
                max = prize;
            }
        }

        br.close();
        System.out.println(max);
    }
}
