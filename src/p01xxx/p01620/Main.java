package p01xxx.p01620;

// 제목 : 나는야 포켓몬 마스터 이다솜

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hm = new HashMap<>();

        for (int index = 1; index <= N; index++) {
            String number = Integer.toString(index);
            String name = br.readLine();
            hm.put(number, name);
            hm.put(name, number);
        }

        StringBuilder sb = new StringBuilder();

        while (M-- > 0) {
            sb.append(hm.get(br.readLine())).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
