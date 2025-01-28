package p10xxx.p10815;

// 제목 : 숫자 카드

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < M; i++) {
            System.out.print(hs.contains(Integer.parseInt(st.nextToken())) ? "1 " : "0 ");
        }
    }
}
