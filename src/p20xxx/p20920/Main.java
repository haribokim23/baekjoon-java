package p20xxx.p20920;

// 제목 : 영단어 암기는 괴로워

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<>();

        while (n-- > 0) {
            String word = br.readLine();

            if (word.length() < m) {
                continue;
            }

            hm.put(word, hm.containsKey(word) ? hm.get(word) + 1 : 1);
        }

        br.close();
        // 언어 : Java 11
        // Comparator<String> comparator = new Comparator<>() {
        //     @Override
        //     public int compare(String word1, String word2) {
        //         int count = hm.get(word2) - hm.get(word1);
        //
        //         if (count != 0) {
        //             return count;
        //         }
        //
        //         int length = word2.length() - word1.length();
        //
        //         if (length != 0) {
        //             return length;
        //         }
        //
        //         return word1.compareTo(word2);
        //     }
        // };
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int count = hm.get(word2) - hm.get(word1);

                if (count != 0) {
                    return count;
                }

                int length = word2.length() - word1.length();

                if (length != 0) {
                    return length;
                }

                return word1.compareTo(word2);
            }
        };
        TreeSet<String> ts = new TreeSet<>(comparator);
        ts.addAll(hm.keySet());
        StringBuilder sb = new StringBuilder();

        for (String word : ts) {
            sb.append(word).append("\n");
        }

        System.out.print(sb);
    }
}
