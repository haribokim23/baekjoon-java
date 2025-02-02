package p17xxx.p17626;

// 제목 : Four Squares

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int count = 4;

        for (int one = (int) Math.sqrt(n); one > 0; one--) {
            int sumOne = one * one;
            int diffOne = n - sumOne;

            if (diffOne == 0) {
                count = 1;
            }

            if (count <= 2) {
                break;
            }

            for (int two = (int) Math.sqrt(diffOne); two > 0; two--) {
                int sumTwo = sumOne + two * two;
                int diffTwo = n - sumTwo;

                if (diffTwo == 0) {
                    count = 2;
                }

                if (count <= 3) {
                    break;
                }

                for (int three = (int) Math.sqrt(diffTwo); three > 0; three--) {
                    int sumThree = sumTwo + three * three;
                    int diffThree = n - sumThree;

                    if (diffThree == 0) {
                        count = 3;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
