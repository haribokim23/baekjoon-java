package p18xxx.p18870;

// 제목 : 좌표 압축

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] key = new int[n];
        TreeSet<Integer> ts = new TreeSet<Integer>();

        for (int i = 0; i < key.length; i++) {
            int x = Integer.parseInt(st.nextToken()) + 1000000000;
            key[i] = x;
            ts.add(x);
        }

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Iterator<Integer> iter = ts.iterator();

        for (int i = 0; i < ts.size(); i++) {
            hm.put(iter.next(), i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < key.length; i++) {
            sb.append(hm.get(key[i]) + " ");
        }

        System.out.println(sb);
    }
}
