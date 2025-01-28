package p21xxx.p21736;

// 제목 : 헌내기는 친구가 필요해

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] campus = new char[n][m];
        int startRow = -1;
        int startColumn = -1;

        for (int row = 0; row < n; row++) {
            String line = br.readLine();

            for (int column = 0; column < m; column++) {
                char character = line.charAt(column);

                if (character == 'I') {
                    character = 'O';
                    startRow = row;
                    startColumn = column;
                }

                campus[row][column] = character;

            }
        }

        br.close();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(startRow * 1000 + startColumn);
        int count = 0;

        while (!queue.isEmpty()) {
            int row = queue.peek() / 1000;
            int column = queue.poll() % 1000;
            char character = campus[row][column];

            if (character == 'X') {
                continue;
            }

            campus[row][column] = 'X';

            if (character == 'P') {
                count++;
            }

            int upRow = row - 1;

            if (upRow >= 0 && campus[upRow][column] != 'X') {
                queue.offer(upRow * 1000 + column);
            }

            int downRow = row + 1;

            if (downRow < n && campus[downRow][column] != 'X') {
                queue.offer(downRow * 1000 + column);
            }

            int leftColumn = column - 1;

            if (leftColumn >= 0 && campus[row][leftColumn] != 'X') {
                queue.offer(row * 1000 + leftColumn);
            }

            int rightColumn = column + 1;

            if (rightColumn < m && campus[row][rightColumn] != 'X') {
                queue.offer(row * 1000 + rightColumn);
            }
        }

        System.out.println(count == 0 ? "TT" : count);
    }
}
