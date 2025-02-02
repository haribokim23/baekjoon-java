package p27xxx.p27889;

// 제목 : 특별한 학교 이름

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        switch (br.readLine()) {
            case "NLCS":
                System.out.println("North London Collegiate School");
                return;
            case "BHA":
                System.out.println("Branksome Hall Asia");
                return;
            case "KIS":
                System.out.println("Korea International School");
                return;
            case "SJA":
                System.out.println("St. Johnsbury Academy");
                return;
        }

        br.close();
    }
}
