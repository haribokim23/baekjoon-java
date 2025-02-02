package p01xxx.p01730;

// 제목 : 판화

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] lines = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(lines[i], '.');
        }

        String moves = br.readLine();
        br.close();

        for (int i = 0, row = 0, col = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            if (move == 'U' && row > 0) {
                lines[row][col] = lines[row][col] == '-' || lines[row][col] == '+' ? '+' : '|';
                lines[--row][col] = lines[row][col] == '-' || lines[row][col] == '+' ? '+' : '|';
                continue;
            }

            if (move == 'D' && row < n - 1) {
                lines[row][col] = lines[row][col] == '-' || lines[row][col] == '+' ? '+' : '|';
                lines[++row][col] = lines[row][col] == '-' || lines[row][col] == '+' ? '+' : '|';
                continue;
            }

            if (move == 'L' && col > 0) {
                lines[row][col] = lines[row][col] == '|' || lines[row][col] == '+' ? '+' : '-';
                lines[row][--col] = lines[row][col] == '|' || lines[row][col] == '+' ? '+' : '-';
                continue;
            }

            if (move == 'R' && col < n - 1) {
                lines[row][col] = lines[row][col] == '|' || lines[row][col] == '+' ? '+' : '-';
                lines[row][++col] = lines[row][col] == '|' || lines[row][col] == '+' ? '+' : '-';
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char[] line : lines) {
            for (char l : line) {
                sb.append(l);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
