package p01xxx.p01269;

// 제목 : 대칭 차집합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aCount = Integer.parseInt(st.nextToken());
        int bCount = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashSet<Integer> a = new HashSet<>();

        for (int i = 0; i < aCount; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        br.close();
        int count = 0;

        for (int i = 0; i < bCount; i++) {
            int bElement = Integer.parseInt(st.nextToken());

            if (a.contains(bElement)) {
                a.remove(bElement);
            } else {
                count++;
            }
        }

        System.out.println(count + a.size());
    }
}
