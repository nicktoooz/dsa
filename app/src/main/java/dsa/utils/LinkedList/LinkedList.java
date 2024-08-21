package dsa.utils.LinkedList;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;

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
    
    public void insertAt(int index, int data){
        int counter = 0;
        Node node = new Node();
        node.data = data;

        if (head != null) {
            head = node;
        } else {
            Node n = new Node();
        }
    }

    public void unshift(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void shift(){
        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
    }
    
    
  
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        Node n = head;
        str.append("[");
        while (n.next != null) {
            str.append(n.data).append(", ");
            n = n.next;
        }
        str.append(n.data).append("]");
        return str.toString();
    }
}
