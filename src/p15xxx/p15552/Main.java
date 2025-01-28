package p15xxx.p15552;

// 제목 : 빠른 A+B

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringTokenizer stringTokenizer;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        int T, sum;
        String input;

        T = Integer.parseInt(bufferedReader.readLine());
        sum = 0;

        for (int i = 0; i < T; i++, sum = 0) {
            input = bufferedReader.readLine();
            stringTokenizer = new StringTokenizer(input);

            sum += Integer.parseInt(stringTokenizer.nextToken());
            sum += Integer.parseInt(stringTokenizer.nextToken());

            bufferedWriter.write(sum + "\n");
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
