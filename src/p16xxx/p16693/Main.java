package p16xxx.p16693;

// 제목 : Pizza Deal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(
                br.readLine());
        br.close();

        System.out.println(Double.parseDouble(st1.nextToken()) / Double.parseDouble(st1.nextToken())
                < Math.PI * Math.pow(Double.parseDouble(st2.nextToken()), 2) / Double.parseDouble(
                st2.nextToken()) ? "Whole pizza" : "Slice of pizza");
    }
}
