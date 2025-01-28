package p05xxx.p05635;

// 제목 : 생일

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String youngestName = st.nextToken();
        int youngestBirthday = Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken()) * 10000;
        String oldestName = youngestName;
        int oldestBirthday = youngestBirthday;

        while (n-- > 1) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int birthday = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) * 100
                    + Integer.parseInt(st.nextToken()) * 10000;

            if (birthday > youngestBirthday) {
                youngestName = name;
                youngestBirthday = birthday;
            }

            if (birthday < oldestBirthday) {
                oldestName = name;
                oldestBirthday = birthday;
            }
        }

        br.close();
        System.out.println(youngestName + "\n" + oldestName);
    }
}
