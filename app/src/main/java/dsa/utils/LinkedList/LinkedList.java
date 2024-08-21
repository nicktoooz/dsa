package dsa.utils.LinkedList;

public class LinkedList {
    private Node head;

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insert(int index, int data) {
        Node node = new Node(data);

        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            if (n == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            n = n.next;
        }
        if (n == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        node.next = n.next;
        n.next = node;
    }

    public void unshift(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void shift() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[ ]";
        }

        StringBuilder str = new StringBuilder("[");
        Node n = head;
        while (n != null) {
            str.append(n.data);
            if (n.next != null) {
                str.append(", ");
            }
            n = n.next;
        }
        str.append("]");
        return str.toString();
    }

    private static class Node {
        int data;
        Node next;

        Node() {}

        Node(int data) {
            this.data = data;
        }
    }
}
