package p02xxx.p02798;

// 제목 : 블랙잭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int N, M, max, sum;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        max = 0;
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            al.add(Integer.parseInt(st.nextToken()));
        }

        al.sort(null);

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = al.get(i) + al.get(j) + al.get(k);

                    if (max < sum && sum <= M) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);

    }
}
