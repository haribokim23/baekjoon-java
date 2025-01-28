package p25xxx.p25305;

// 제목 : 커트라인

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
        Collections.sort(al);
        System.out.println(al.get(n - k));
    }
}
