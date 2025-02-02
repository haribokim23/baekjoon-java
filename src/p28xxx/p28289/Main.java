package p28xxx.p28289;

// 제목 : 과 조사하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int software = 0;
        int embedded = 0;
        int ai = 0;
        int freshman = 0;

        while (p-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (st.nextToken().equals("1")) {
                freshman++;
                continue;
            }

            switch (st.nextToken()) {
                case "1":
                case "2":
                    software++;
                    break;
                case "3":
                    embedded++;
                    break;
                case "4":
                    ai++;
                    break;
            }
        }

        br.close();
        System.out.println(software + "\n" + embedded + "\n" + ai + "\n" + freshman);
    }
}
