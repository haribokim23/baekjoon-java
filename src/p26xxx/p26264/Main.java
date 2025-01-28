package p26xxx.p26264;

// 제목 : 빅데이터? 정보보호!

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double half = Double.parseDouble(br.readLine()) / 2 * 8;
        String note = br.readLine();
        br.close();

        note = note.replaceAll("bigdata", "");
        int length = note.length();

        if (length <= half) {
            System.out.print("bigdata? ");
        }

        if (length >= half) {
            System.out.print("security!");
        }
    }
}
