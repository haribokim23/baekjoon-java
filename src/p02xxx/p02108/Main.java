package p02xxx.p02108;

// 제목 : 통계학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), temp, sum = 0, max = 0;
        int[] value = new int[n];
        int[] count = new int[8001];
        ArrayList<Integer> mode = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            sum += (temp = Integer.parseInt(br.readLine()));
            value[i] = temp;

            if (++count[temp + 4000] > max) {
                max = count[temp + 4000];
            }
        }
        br.close();

        for (int i = 0; i < count.length; i++) {
            temp = count[i];

            if (temp == max) {
                mode.add(i - 4000);
            }
        }

        Arrays.sort(value);
        mode.sort(null);
        System.out.println(
                (int) Math.round((double) sum / n) + "\n" + value[n / 2] + "\n" + (mode.size() == 1
                        ? mode.get(0) : mode.get(1)) + "\n" + (value[n - 1] - value[0]));
    }
}
