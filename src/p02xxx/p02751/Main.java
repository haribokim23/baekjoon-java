package p02xxx.p02751;

// 제목 : 수 정렬하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        al.sort(null);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(al.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}
