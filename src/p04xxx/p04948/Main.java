package p04xxx.p04948;

// 제목 : 베르트랑 공준

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n, count;
        boolean isPrime;

        for (int i = 2; i <= 246912; ) {
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

        while ((n = Integer.parseInt(br.readLine())) != 0) {
            count = 0;

            for (int i = 0; i < al.size(); i++) {
                if (al.get(i) > 2 * n) {
                    break;
                } else if (al.get(i) > n) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
