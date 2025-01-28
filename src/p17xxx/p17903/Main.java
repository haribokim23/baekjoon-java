package p17xxx.p17903;

// 제목 : Counting Clauses

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int m = Integer.parseInt(st.nextToken());

        System.out.println(m >= 8 ? "satisfactory" : "unsatisfactory");
    }
}
