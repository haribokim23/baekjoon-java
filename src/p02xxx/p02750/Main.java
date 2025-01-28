package p02xxx.p02750;

// 제목 : 수 정렬하기

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<Integer>();
        int N;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }

        br.close();
        al.sort(null);

        for (int i = 0; i < N; i++) {
            bw.write(al.get(i) + "\n");
        }

        bw.flush();
        bw.close();

    }
}
