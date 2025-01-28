package p02xxx.p02164;

// 제목 : 카드2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        Queue queue = new Queue();

        for (int i = 0; i < n; i++) {
            queue.push(i + 1);
        }

        while (--n > 0) {
            queue.pop();
            queue.push(queue.pop());
        }

        System.out.println(queue.pop());
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
