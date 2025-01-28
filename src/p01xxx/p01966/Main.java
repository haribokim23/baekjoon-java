package p01xxx.p01966;

// 제목 : 프린터 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            Queue queue = new Queue();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                queue.push(Integer.parseInt(st.nextToken()), i == m);
            }

            int count = 1;

            while (true) {
                int front = queue.front();
                boolean print = true;

                for (int j = 0; j < queue.size(); j++) {
                    int data = queue.front();
                    boolean flag = queue.flag();

                    if (data > front) {
                        print = false;
                    }

                    queue.push(queue.pop(), flag);
                }

                if (print) {
                    if (queue.flag()) {
                        sb.append(count).append("\n");
                        break;
                    }

                    queue.pop();
                    count++;
                } else {
                    int data = queue.front();
                    boolean flag = queue.flag();

                    queue.pop();
                    queue.push(data, flag);
                }
            }
        }

        br.close();
        System.out.print(sb);
    }
}

class Queue {
    private Node front, back;
    private int size;

    public Queue() {
        front = new Node();
        back = new Node();

        front.setNext(back);
        back.setPrev(front);

        size = 0;
    }

    public void push(int data, boolean flag) {
        Node node = new Node(data, flag);

        back.getPrev().setNext(node);
        node.setPrev(back.getPrev());
        node.setNext(back);
        back.setPrev(node);

        size++;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }

        int data = front.getNext().getData();

        front.setNext(front.getNext().getNext());
        front.getNext().setPrev(front);

        size--;

        return data;
    }

    public int size() {
        return size;
    }

    public int empty() {
        return size == 0 ? 1 : 0;
    }

    public int front() {
        return size != 0 ? front.getNext().getData() : -1;
    }

    public int back() {
        return size != 0 ? back.getPrev().getData() : -1;
    }

    public boolean flag() {
        return size != 0 ? front.getNext().getFlag() : false;
    }
}

class Node {
    private Node prev, next;
    private Integer data;
    private boolean flag;

    public Node() {
        this(null, false);
    }

    public Node(Integer data, boolean flag) {
        prev = next = null;
        this.data = data;
        this.setFlag(flag);
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
