package p12xxx.p12865;

// 제목 : 평범한 배낭

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()) + 1;
        int[] maxValues = new int[k];

        for (int i = 0; i < k; i++) {
            maxValues[i] = -1;
        }

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            int[] temp = new int[k];
            System.arraycopy(maxValues, 0, temp, 0, k);

            for (int i = 0; i < k; i++) {
                int maxValue = maxValues[i];

                if (maxValue < 0) {
                    continue;
                }

                int newWeight = i + weight;
                int newValue = maxValue + value;

                if (newWeight < k && newValue > maxValues[newWeight]) {
                    temp[newWeight] = newValue;
                }
            }

            if (weight < k && value > temp[weight]) {
                temp[weight] = value;
            }

            maxValues = temp;
        }

        br.close();
        int maxValue = 0;

        for (int i = 0; i < k; i++) {
            int value = maxValues[i];

            if (value > maxValue) {
                maxValue = value;
            }
        }

        System.out.println(maxValue);
    }
}
