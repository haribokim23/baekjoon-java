package p20xxx.p20232;

// 제목 : Archivist

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        switch (br.readLine()) {
            case "2006":
                System.out.println("PetrSU, ITMO");
                break;
            case "1996":
            case "1997":
            case "2000":
            case "2007":
            case "2008":
            case "2013":
            case "2018":
                System.out.println("SPbSU");
                break;
            default:
                System.out.println("ITMO");
        }

        br.close();
    }
}
