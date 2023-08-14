package exercise.MethodOfArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E removedElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> clonedList = new MyList<>(elements.length);
        for (int i = 0; i < size; i++) {
            clonedList.add(i, (E) elements[i]);
        }
        return clonedList;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
    }
}