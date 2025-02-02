package p14xxx.p14003;

// 제목 : 가장 긴 증가하는 부분 수열 5

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] a = new int[n];
        int[] minValues = new int[n + 1];
        minValues[1] = 1_000_000_000;
        int[] maxLengths = new int[n];
        int maxLengthIndex = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            a[i] = value;

            if (value <= minValues[1]) {
                minValues[1] = value;
                maxLengths[i] = 1;
                continue;
            }

            int lastMinValue = minValues[maxLength];

            if (value == lastMinValue) {
                maxLengths[i] = maxLength;
                continue;
            }

            if (value > lastMinValue) {
                minValues[++maxLength] = value;
                maxLengths[i] = maxLength;
                maxLengthIndex = i;
                continue;
            }

            int length = 1;

            for (int last = maxLength - 1; length <= last; ) {
                int middle = (length + last) / 2;
                int middleValue = minValues[middle];

                if (value == middleValue) {
                    length = middle;
                    break;
                }

                if (value > middleValue) {
                    length = middle + 1;
                } else {
                    last = middle - 1;
                }
            }

            if (value < minValues[length]) {
                minValues[length] = value;
            }

            maxLengths[i] = length;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxLength--).append("\n");
        Stack<Integer> stack = new Stack<>();
        int maxLengthValue = a[maxLengthIndex];

        for (int previous = a[maxLengthIndex--]; maxLength > 0; ) {
            int value = a[maxLengthIndex];

            if (maxLengths[maxLengthIndex--] == maxLength && value < previous) {
                previous = stack.push(value);
                maxLength--;
            }
        }

        while (!stack.empty()) {
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb.append(maxLengthValue));
    }
}
