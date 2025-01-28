package p01xxx.p01764;

// 제목 : 듣보잡

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        TreeSet<String> hear = new TreeSet<>();
        TreeSet<String> see = new TreeSet<>();

        while (N-- > 0) {
            hear.add(br.readLine());
        }

        while (M-- > 0) {
            String name = br.readLine();

            if (hear.contains(name)) {
                see.add(name);
            }
        }

        br.close();
        StringBuilder sb = new StringBuilder();
        sb.append(see.size()).append("\n");

        for (String name : see) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}
