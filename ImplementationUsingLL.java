package STACK;

import BASICMATHS.n1;

public class ImplementationUsingLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        Node head;
        int size;

        Stack() {
            head = null;
            size = 0;
        }

        public void push(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
            size++;
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("empty");
                return;
            }System.out.println(head.data);
            head = head.next;
            size--;
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return;
            }
            System.out.println(head.data);
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.size);
    }
}
