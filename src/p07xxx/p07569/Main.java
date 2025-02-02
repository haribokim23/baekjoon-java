package p07xxx.p07569;

// 제목 : 토마토

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[][][] tomatoes = new int[n][m][h];
        int green = 0;
        LinkedList<Coordinate> queue = new LinkedList<>();

        for (int z = 0; z < h; z++) {
            for (int x = 0; x < n; x++) {
                st = new StringTokenizer(br.readLine());

                for (int y = 0; y < m; y++) {
                    int tomato = Integer.parseInt(st.nextToken());
                    tomatoes[x][y][z] = tomato;

                    if (tomato == 0) {
                        green++;
                    } else if (tomato == 1) {
                        queue.offer(new Coordinate(x, y, z));
                    }
                }
            }
        }

        br.close();

        if (green == 0) {
            System.out.println(0);
            return;
        }

        int days = -1;

        while (!queue.isEmpty()) {
            LinkedList<Coordinate> nextQueue = new LinkedList<>();

            while (!queue.isEmpty()) {
                Coordinate current = queue.pop();

                for (Coordinate d : new Coordinate[]{new Coordinate(-1, 0, 0),
                        new Coordinate(1, 0, 0), new Coordinate(0, -1, 0), new Coordinate(0, 1, 0),
                        new Coordinate(0, 0, -1), new Coordinate(0, 0, 1),}) {
                    int nextX = current.x + d.x;
                    int nextY = current.y + d.y;
                    int nextZ = current.z + d.z;

                    if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && nextZ >= 0
                            && nextZ < h && tomatoes[nextX][nextY][nextZ] == 0) {
                        tomatoes[nextX][nextY][nextZ] = 1;
                        green--;
                        nextQueue.offer(new Coordinate(nextX, nextY, nextZ));
                    }
                }
            }

            days++;
            queue = nextQueue;
        }

        System.out.println(green == 0 ? days : -1);
    }

    private static class Coordinate {
        public int x;
        public int y;
        public int z;

        public Coordinate(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
