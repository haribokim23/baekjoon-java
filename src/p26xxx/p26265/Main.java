package p26xxx.p26265;

// 제목 : 멘토와 멘티

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, TreeSet<String>> tm = new TreeMap<>();

        while (n-- > 0) {
            String[] pair = br.readLine().split(" ");
            tm.putIfAbsent(pair[0], new TreeSet<>(Collections.reverseOrder()));
            tm.get(pair[0]).add(pair[1]);
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (String mentor : tm.keySet()) {
            for (String mentee : tm.get(mentor)) {
                sb.append(mentor).append(" ").append(mentee).append("\n");
            }
        }

        System.out.print(sb);
    }
}
