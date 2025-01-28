package p25xxx.p25593;

// 제목 : 근무 지옥에 빠진 푸앙이 (Small)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        for (int week = 0; week < n; week++) {
            for (int time : new int[]{4, 6, 4, 10}) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int day = 0; day < 7; day++) {
                    String name = st.nextToken();

                    if (!name.equals("-")) {
                        hm.putIfAbsent(name, 0);
                        hm.put(name, hm.get(name) + time);
                    }
                }
            }
        }

        br.close();
        int min = 50 * 7 * 10;
        int max = 0;

        for (int time : hm.values()) {
            min = Math.min(min, time);
            max = Math.max(max, time);
        }

        System.out.println(max - min <= 12 ? "Yes" : "No");
    }
}
