package p25xxx.p25206;

// 제목 : 너의 평점은

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double gpa = 0;
        double credits = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());

            switch (st.nextToken()) {
                case "A+":
                    gpa += credit * 4.5;
                    break;
                case "A0":
                    gpa += credit * 4;
                    break;
                case "B+":
                    gpa += credit * 3.5;
                    break;
                case "B0":
                    gpa += credit * 3;
                    break;
                case "C+":
                    gpa += credit * 2.5;
                    break;
                case "C0":
                    gpa += credit * 2;
                    break;
                case "D+":
                    gpa += credit * 1.5;
                    break;
                case "D0":
                    gpa += credit;
                    break;
                case "F":
                    break;
                case "P":
                    continue;
            }

            credits += credit;
        }

        br.close();
        System.out.println(gpa / credits);
    }
}
