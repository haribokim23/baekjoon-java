package p01xxx.p01929;

// 제목 : 소수 구하기

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<Integer>();
        StringTokenizer st;
        int M, N;
        boolean isPrime;

        st = new StringTokenizer(br.readLine());
        br.close();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= N; ) {
            isPrime = true;

            if (i % 2 != 0) {
                for (int j = 0; j < al.size(); j++) {
                    if (al.get(j) > Math.sqrt(i)) {
                        break;
                    } else if (i % al.get(j) == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else if (i != 2) {
                isPrime = false;
            }

            if (isPrime) {
                al.add(i);

                if (i >= M && i <= N) {
                    bw.write(i + "\n");
                }
            }

            if (i == 2) {
                i++;
            } else {
                i += 2;
            }
        }

        bw.flush();
        bw.close();

    }
}
