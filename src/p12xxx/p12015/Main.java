package p12xxx.p12015;

// 제목 : 가장 긴 증가하는 부분 수열 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int maxLength = 1;
        int[] minValues = new int[n + 1];
        minValues[1] = 1_000_000_000;

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(st.nextToken());

            if (element <= minValues[1]) {
                minValues[1] = element;
                continue;
            }

            if (element == minValues[maxLength]) {
                continue;
            }

            if (element > minValues[maxLength]) {
                minValues[++maxLength] = element;
                continue;
            }

            int length = 1;

            for (int last = maxLength - 1; length <= last; ) {
                int middle = (length + last) / 2;
                int middleValue = minValues[middle];

                if (element == middleValue) {
                    length = middle;
                    break;
                }

                if (element > middleValue) {
                    length = middle + 1;
                } else {
                    last = middle - 1;
                }
            }

            if (element < minValues[length]) {
                minValues[length] = element;
            }
        }

        System.out.println(maxLength);
    }
}
