package p02xxx.p02947;

// 제목 : 나무 조각

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] numbers;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int index = 0; true; ) {
            boolean swapped = false;

            for (int count = 0; count < 5; count++) {
                if (numbers[index] > numbers[index + 1]) {
                    swapped = true;
                    swap(index, index + 1);
                    break;
                }

                index = (index + 1) % 4;
            }

            if (!swapped) {
                break;
            }

            sb.append(numbers[0]).append(" ").append(numbers[1]).append(" ").append(numbers[2])
                    .append(" ").append(numbers[3]).append(" ").append(numbers[4]).append("\n");
        }

        // 언어 : Java 15 -> Java 8
        System.out.println(sb.length() == 0 ? "1 2 3 4 5" : sb);
        // System.out.println(sb.isEmpty() ? "1 2 3 4 5" : sb);
    }

    private static void swap(int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
