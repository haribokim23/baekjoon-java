package p09xxx.p09020;

// 제목 : 골드바흐의 추측

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<Integer>();
        int T, n, one, two;
        boolean isPrime;

        for (int i = 2; i <= 10000; ) {
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
            }

            if (i == 2) {
                i++;
            } else {
                i += 2;
            }
        }

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            one = 0;
            two = 0;

            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) >= n / 2) {
                    two = al.get(j);

                    for (int k = 0; k < al.size(); k++) {
                        one = al.get(k);

                        if (one + two == n) {
                            break;
                        }
                    }

                    if (one + two == n) {
                        break;
                    }
                }
            }

            bw.write(one + " " + two + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
