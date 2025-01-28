package p02xxx.p02480;

// 제목 : 주사위 세개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] arr = new int[6];
        int input, max = 0;

        for (int i = 0; i < 3; i++) {
            input = Integer.parseInt(st.nextToken());

            arr[input - 1]++;

            if (input > max) {
                max = input;
            }
        }

        int count = 0, most = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];
                most = i + 1;
            }
        }

        switch (count) {
            case 3:
                System.out.println(most * 1000 + 10000);
                break;
            case 2:
                System.out.println(most * 100 + 1000);
                break;
            case 1:
                System.out.println(max * 100);
                break;
            default:
                break;
        }

    }
}
