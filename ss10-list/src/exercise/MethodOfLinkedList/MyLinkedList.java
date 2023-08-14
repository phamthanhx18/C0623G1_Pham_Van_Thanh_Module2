package exercise.MethodOfLinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(element);

        if (index == 0) {
            addFirst(element);
        } else {
            Node current = nodeAt(index - 1);
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
        } else {
            Node newNode = new Node(e);
            Node lastNode = nodeAt(size - 1);
            lastNode.next = newNode;
            size++;
        }
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        E element = head.data;
        head = head.next;
        size--;
        return element;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        E element;

        if (index == 0) {
            element = removeFirst();
        } else {
            Node prevNode = nodeAt(index - 1);
            Node currNode = prevNode.next;
            prevNode.next = currNode.next;
            element = currNode.data;
            size--;
        }

        return element;
    }

    public E removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        E element;

        if (head.next == null) {
            element = head.data;
            head = null;
        } else {
            Node prevNode = nodeAt(size - 2);
            Node lastNode = prevNode.next;
            prevNode.next = null;
            element = lastNode.data;
        }

        size--;

        return element;
    }

    public boolean remove(Object obj) {
        if (head == null) {
            return false;
        }

        if (obj == null) {
            for (Node current = head, prev = null;
                 current != null; prev = current, current = current.next) {
                if (current.data == null) {
                    unlinkNode(current, prev);
                    return true;
                }
            }
        } else {
            for (Node current = head, prev = null;
                 current != null; prev = current, current = current.next) {
                if (obj.equals(current.data)) {
                    unlinkNode(current, prev);
                    return true;
                }
            }
        }

        return false;
    }

    private void unlinkNode(Node current, Node prev) {
        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }

        size--;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();

        for (Node current = head; current != null; current = current.next) {
            clone.addLast(current.data);
        }

        return (E) clone;
    }

    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    public int indexOf(E e) {
        int index = 0;

        for (Node current = head; current != null; current = current.next) {
            if (e.equals(current.data)) {
                return index;
            }
            index++;
        }

        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node node = nodeAt(index);
        return node.data;
    }

    private Node nodeAt(int index) {
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        return head.data;
    }

    public E getLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node lastNode = nodeAt(size - 1);
        return lastNode.data;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            next = null;
        }
    }
}