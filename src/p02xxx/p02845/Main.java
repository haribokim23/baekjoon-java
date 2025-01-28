package p02xxx.p02845;

// 제목 : 파티가 끝나고 난 뒤

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int LP;

        st = new StringTokenizer(br.readLine());
        LP = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();

        System.out.println(
                (Integer.parseInt(st.nextToken()) - LP) + " " + (Integer.parseInt(st.nextToken())
                        - LP) + " " + (Integer.parseInt(st.nextToken()) - LP) + " " + (
                        Integer.parseInt(st.nextToken()) - LP) + " " + (
                        Integer.parseInt(st.nextToken()) - LP));

    }
}
