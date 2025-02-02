package p01xxx.p01057;

// 제목 : 토너먼트

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        st.nextToken();
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());
        int round = 0;

        while (kim != lim) {
            round++;
            kim = kim / 2 + kim % 2;
            lim = lim / 2 + lim % 2;
        }

        System.out.println(round);
    }
}
