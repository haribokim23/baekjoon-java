package p28xxx.p28702;

// 제목 : FizzBuzz

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();
        br.close();
        int fourth;

        switch (first) {
            case "Fizz":
            case "Buzz":
                fourth = (second.equals("Fizz") || second.equals("Buzz")) ? (Integer.parseInt(third)
                        + 1) : (Integer.parseInt(second) + 2);

                break;
            case "FizzBuzz":
                fourth = Integer.parseInt(second) + 2;
                break;
            default:
                fourth = Integer.parseInt(first) + 3;
                break;
        }

        boolean fizz = fourth % 3 == 0;
        boolean buzz = fourth % 5 == 0;

        if (fizz && buzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else {
            System.out.println(fourth);
        }
    }
}
