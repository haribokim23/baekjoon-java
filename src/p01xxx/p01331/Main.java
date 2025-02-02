package p01xxx.p01331;

// 제목 : 나이트 투어

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] visited = new boolean[6][6];
        String start = br.readLine();
        int startColumn = start.charAt(0) - 'A';
        int startRow = start.charAt(1) - '1';
        visited[startColumn][startRow] = true;

        for (int i = 0, previousColumn = startColumn, previousRow = startRow; i < 35; i++) {
            String current = br.readLine();
            int currentColumn = current.charAt(0) - 'A';
            int currentRow = current.charAt(1) - '1';

            if (visited[currentColumn][currentRow]) {
                System.out.println("Invalid");
                return;
            }

            int columnDifference = Math.abs(previousColumn - currentColumn);
            int rowDifference = Math.abs(previousRow - currentRow);

            if ((columnDifference == 1 && rowDifference == 2) || (columnDifference == 2
                    && rowDifference == 1)) {
                visited[currentColumn][currentRow] = true;
            } else {
                System.out.println("Invalid");
                return;
            }

            previousColumn = currentColumn;
            previousRow = currentRow;

            if (i == 34) {
                columnDifference = Math.abs(startColumn - currentColumn);
                rowDifference = Math.abs(startRow - currentRow);

                if (!(columnDifference == 1 && rowDifference == 2) && !(columnDifference == 2
                        && rowDifference == 1)) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        br.close();
        System.out.println("Valid");
    }
}
