package exercise.MethodOfLinkedList;

public class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
        next = null;
    }

    public Object getData() {
        return data;
    }
}
