package p25xxx.p25501;

// 제목 : 재귀의 귀재

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static char[] chars;
    private static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            int length = s.length();
            chars = new char[length];

            for (int i = 0; i < length; i++) {
                chars[i] = s.charAt(i);
            }

            count = 0;
            System.out.println(isPalindrome(0, length - 1) + " " + count);
        }

        br.close();
    }

    private static int isPalindrome(int left, int right) {
        count++;

        if (left >= right) {
            return 1;
        }

        if (chars[left] != chars[right]) {
            return 0;
        }

        return isPalindrome(left + 1, right - 1);
    }
}
