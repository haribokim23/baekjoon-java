package p18xxx.p18111;

// 제목 : 마인크래프트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int height = Integer.parseInt(st.nextToken());

                if (tm.containsKey(height)) {
                    tm.put(height, tm.get(height) + 1);
                } else {
                    tm.put(height, 1);
                }
            }
        }

        br.close();
        int minTime = Integer.MAX_VALUE;
        int maxHeight = 0;

        for (int height = tm.firstKey(); height <= tm.lastKey(); height++) {
            int block = b;
            int time = 0;

            for (Entry<Integer, Integer> entry : tm.entrySet()) {
                int currHeight = entry.getKey();
                int count = entry.getValue();

                if (currHeight < height) {
                    int blocks = (height - currHeight) * count;
                    block -= blocks;
                    time += blocks;
                } else if (currHeight > height) {
                    int blocks = (currHeight - height) * count;
                    block += blocks;
                    time += blocks * 2;
                }
            }

            if (block >= 0) {
                if (time < minTime) {
                    minTime = time;
                    maxHeight = height;
                } else if (time == minTime) {
                    if (height > maxHeight) {
                        maxHeight = height;
                    }
                }
            }
        }

        System.out.println(minTime + " " + maxHeight);
    }
}
