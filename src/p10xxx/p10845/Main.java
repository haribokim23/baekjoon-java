package p10xxx.p10845;

// 제목 : 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        IntQueue intQueue = new IntQueue();
        int N;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    intQueue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(intQueue.pop());
                    break;
                case "size":
                    System.out.println(intQueue.getSize());
                    break;
                case "empty":
                    if (intQueue.getSize() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front":
                    System.out.println(intQueue.getFront());
                    break;
                case "back":
                    System.out.println(intQueue.getBack());
                    break;
                default:
                    break;
            }
        }

    }
}

class IntNode {
    private IntNode next;
    private IntNode prev;
    private Integer integer;

    public IntNode() {
        this(null);
    }

    public IntNode(Integer integer) {
        next = null;
        prev = null;
        this.integer = integer;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode intNode) {
        next = intNode;
    }

    public IntNode getPrev() {
        return prev;
    }

    public void setPrev(IntNode intNode) {
        prev = intNode;
    }

    public Integer getInt() {
        return integer;
    }

    public String toString() {
        return integer.toString();
    }
}

class IntQueue {
    static final int EMPTY_QUEUE = -1;
    private IntNode front, back;
    private int size;

    public IntQueue() {
        front = new IntNode();
        back = new IntNode();

        front.setNext(back);
        back.setPrev(front);

        size = 0;
    }

    public Integer getFront() {
        if (front.getNext() == null || front.getNext().getInt() == null) {
            return EMPTY_QUEUE;
        }

        return front.getNext().getInt();
    }

    public Integer getBack() {
        if (back.getPrev() == null || back.getPrev().getInt() == null) {
            return EMPTY_QUEUE;
        }

        return back.getPrev().getInt();
    }

    public int getSize() {
        return size;
    }

    public void push(Integer integer) {
        if (integer == null) {
            return;
        }

        IntNode intNode = new IntNode(integer);

        back.getPrev().setNext(intNode);
        intNode.setPrev(back.getPrev());
        intNode.setNext(back);
        back.setPrev(intNode);

        size++;
    }

    public Integer pop() {
        if (front.getNext() == null || front.getNext().getInt() == null) {
            return EMPTY_QUEUE;
        }

        IntNode tempNode = front.getNext();
        front.setNext(tempNode.getNext());
        tempNode.getNext().setPrev(front);

        size--;

        return tempNode.getInt();
    }

    public String toString() {
        String tempString = "";
        IntNode tempNode;

        for (tempNode = front.getNext(); tempNode.getNext() != null;
                tempNode = tempNode.getNext()) {
            tempString += tempNode.toString() + "\n";
        }

        return tempString;
    }
}
