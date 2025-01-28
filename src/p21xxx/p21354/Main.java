package p21xxx.p21354;

// 제목 : Äpplen och päron

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()) * 7;
        int P = Integer.parseInt(st.nextToken()) * 13;
        br.close();

        System.out.println(A < P ? "Petra" : A > P ? "Axel" : "lika");
    }
}
