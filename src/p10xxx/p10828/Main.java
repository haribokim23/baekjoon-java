package p10xxx.p10828;

// 제목 : 스택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        IntStack intStack = new IntStack();
        int N;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    intStack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(intStack.pop());
                    break;
                case "size":
                    System.out.println(intStack.getSize());
                    break;
                case "empty":
                    if (intStack.getSize() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "top":
                    System.out.println(intStack.getTop());
                    break;
                default:
                    break;
            }
        }

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

    public String toString() {
        String tempString = "";
        IntNode tempNode;

        for (tempNode = top.getNext(); tempNode != null; tempNode = tempNode.getNext()) {
            tempString += tempNode.toString() + "\n";
        }

        return tempString;
    }
}
