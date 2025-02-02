package p12xxx.p12852;

// 제목 : 1로 만들기 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, int[]> hm = new HashMap<>();
        hm.put(1, new int[]{1});

        for (int number = 2; number <= n; number++) {
            int[] temp = hm.get(number - 1);

            if (number % 2 == 0 && hm.get(number / 2).length < temp.length) {
                temp = hm.get(number / 2);
            }

            if (number % 3 == 0 && hm.get(number / 3).length < temp.length) {
                temp = hm.get(number / 3);
            }

            int[] numbers = new int[temp.length + 1];
            numbers[0] = number;
            System.arraycopy(temp, 0, numbers, 1, temp.length);
            hm.put(number, numbers);
        }

        int[] numbers = hm.get(n);
        StringBuilder sb = new StringBuilder();
        sb.append(numbers.length - 1).append("\n");

        for (int number : numbers) {
            sb.append(number).append(" ");
        }

        System.out.println(sb);
    }
}
