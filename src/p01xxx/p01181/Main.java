package p01xxx.p01181;

// 제목 : 단어 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<SimpleEntry<String, Integer>> al = new ArrayList<SimpleEntry<String, Integer>>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            SimpleEntry<String, Integer> entry = new SimpleEntry<String, Integer>(word,
                    word.length());

            if (!al.contains(entry)) {
                al.add(entry);
            }
        }

        br.close();
        al.sort(Entry.comparingByKey());
        al.sort(Entry.comparingByValue());
        StringBuilder sb = new StringBuilder();

        for (SimpleEntry<String, Integer> entry : al) {
            sb.append(entry.getKey()).append("\n");
        }

        System.out.print(sb);
    }
}
