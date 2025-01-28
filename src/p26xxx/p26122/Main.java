package p26xxx.p26122;

// 제목 : 가장 긴 막대 자석

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String string = br.readLine();
        br.close();
        int[] lengths = new int[k];
        int index = 0;
        lengths[index] = 1;
        char previous = string.charAt(0);

        for (int i = 1; i < string.length(); i++) {
            char current = string.charAt(i);

            if (current == previous) {
                lengths[index]++;
            } else {
                lengths[++index]++;
            }

            previous = current;
        }

        int max = 0;

        for (int i = 0; i < index; i++) {
            max = Math.max(max, Math.min(lengths[i], lengths[i + 1]) * 2);
        }

        System.out.println(max);
    }
}
