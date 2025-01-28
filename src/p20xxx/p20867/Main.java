package p20xxx.p20867;

// 제목 : Rulltrappa

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double M = Double.parseDouble(st.nextToken());
        double S = Double.parseDouble(st.nextToken());
        double G = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double L = Double.parseDouble(st.nextToken());
        double R = Double.parseDouble(st.nextToken());
        br.close();

        System.out.println(M / S + R / B < M / G + L / A ? "latmask" : "friskus");
    }
}
