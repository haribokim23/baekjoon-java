package p10xxx.p10814;

// 제목 : 나이순 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<String>> alal = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < 200; i++) {
            alal.add(new ArrayList<String>());
        }

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            alal.get(Integer.parseInt(st.nextToken()) - 1).add(st.nextToken());
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alal.size(); i++) {
            ArrayList<String> al = alal.get(i);

            for (int j = 0; j < al.size(); j++) {
                sb.append(i + 1).append(" ").append(al.get(j)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
