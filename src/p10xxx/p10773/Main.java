package p10xxx.p10773;

// 제목 : 제로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntStack intStack = new IntStack();
        int K, input;

        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            input = Integer.parseInt(br.readLine());

            if (input == 0) {
                intStack.pop();
            } else {
                intStack.push(input);
            }
        }

        br.close();
        System.out.println(intStack.sum());

    }
}

class IntNode {
    private IntNode next;
    private Integer integer;

    public IntNode() {
        this(null);
    }

    public IntNode(Integer integer) {
        next = null;
        this.integer = integer;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode intNode) {
        next = intNode;
    }

    public Integer getInt() {
        return integer;
    }

    public String toString() {
        return integer.toString();
    }
}

class IntStack {
    static final int EMPTY_STACK = -1;
    private IntNode top;
    private int size;

    public IntStack() {
        top = new IntNode();
        size = 0;
    }

    public Integer getTop() {
        if (top.getNext() == null || top.getNext().getInt() == null) {
            return EMPTY_STACK;
        }

        return top.getNext().getInt();
    }

    public int getSize() {
        return size;
    }

    public void push(Integer integer) {
        if (integer == null) {
            return;
        }

        IntNode intNode = new IntNode(integer);

        intNode.setNext(top.getNext());
        top.setNext(intNode);

        size++;
    }

    public Integer pop() {
        if (top.getNext() == null) {
            return EMPTY_STACK;
        }

        IntNode tempNode = top.getNext();
        top.setNext(top.getNext().getNext());

        size--;

        return tempNode.getInt();
    }

    public int sum() {
        int sum = 0;
        IntNode tempNode;

        for (tempNode = top.getNext(); tempNode != null; tempNode = tempNode.getNext()) {
            sum += tempNode.getInt();
        }

        return sum;
    }

    public String toString() {
        String tempString = "";
        IntNode tempNode;

        for (tempNode = top.getNext(); tempNode != null; tempNode = tempNode.getNext()) {
            tempString += tempNode.toString() + "\n";
        }

        return tempString;
    }
}
