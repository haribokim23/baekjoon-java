package p03xxx.p03052;

// 제목 : 나머지

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num;

        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt() % 42;

            if (!array.contains(num)) {
                array.add(num);
            }

        }

        scanner.close();

        System.out.println(array.size());

    }
}
