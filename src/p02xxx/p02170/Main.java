package p02xxx.p02170;

// 제목 : 선 긋기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            tm.put(x, y);
        }

        br.close();
        int start = -1000000000;
        int end = -1000000000;
        int sum = 0;

        for (Iterator<Entry<Integer, Integer>> i = tm.entrySet().iterator(); i.hasNext(); ) {
            Entry<Integer, Integer> entry = i.next();
            int key = entry.getKey();
            int value = entry.getValue();

            if (key <= end) {
                if (value > end) {
                    end = value;
                }
            } else {
                sum += end - start;
                start = key;
                end = value;
            }
        }

        System.out.println(sum + end - start);
    }
}
