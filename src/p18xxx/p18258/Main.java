package p18xxx.p18258;

// 제목 : 큐 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
                default:
                    sb.append("ERROR\n");
                    break;
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

    public void push(int x) {
        Node node = new Node(x);

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
}

class Node {
    private Node prev, next;
    private Integer data;

    public Node() {
        this(null);
    }

    public Node(Integer data) {
        prev = next = null;
        this.data = data;
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
}
