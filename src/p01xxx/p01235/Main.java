package p01xxx.p01235;

// 제목 : 학생 번호

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ids = new String[n];

        for (int i = 0; i < n; i++) {
            ids[i] = br.readLine();
        }

        br.close();
        int length = ids[0].length();
        int digit = 1;

        for (; digit <= length; digit++) {
            HashSet<String> hs = new HashSet<>();
            boolean isValid = true;

            for (int i = 0; i < n; i++) {
                String substring = ids[i].substring(length - digit);

                if (hs.contains(substring)) {
                    isValid = false;
                    break;
                }

                hs.add(substring);
            }

            if (isValid) {
                break;
            }
        }

        System.out.println(digit);
    }
}
