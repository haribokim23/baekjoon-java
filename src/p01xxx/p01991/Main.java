package p01xxx.p01991;

// 제목 : 트리 순회

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] nodes;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nodes = new int[n][2];

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int head = st.nextToken().charAt(0) - 'A';
            int left = st.nextToken().charAt(0) - 'A';
            int right = st.nextToken().charAt(0) - 'A';
            nodes[head][0] = left < 0 ? -1 : left;
            nodes[head][1] = right < 0 ? -1 : right;
        }

        br.close();
        sb = new StringBuilder();
        preorder(0);
        sb.append("\n");
        inorder(0);
        sb.append("\n");
        postorder(0);
        System.out.println(sb);
    }

    private static void preorder(int head) {
        sb.append((char) (head + 'A'));
        int left = nodes[head][0];

        if (left != -1) {
            preorder(left);
        }

        int right = nodes[head][1];

        if (right != -1) {
            preorder(right);
        }
    }

    private static void inorder(int head) {
        int left = nodes[head][0];

        if (left != -1) {
            inorder(left);
        }

        sb.append((char) (head + 'A'));
        int right = nodes[head][1];

        if (right != -1) {
            inorder(right);
        }
    }

    private static void postorder(int head) {
        int left = nodes[head][0];

        if (left != -1) {
            postorder(left);
        }

        int right = nodes[head][1];

        if (right != -1) {
            postorder(right);
        }

        sb.append((char) (head + 'A'));
    }
}
