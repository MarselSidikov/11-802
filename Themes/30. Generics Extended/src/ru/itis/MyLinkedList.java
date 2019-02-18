package ru.itis;

import java.util.Iterator;

/**
 * 18.02.2019
 * MyLinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MyLinkedList<Y> implements MyList<Y> {

    private Node<Y> head;

    private static class Node<Z> {
        private Z value;
        private Node<Z> next;

        Node(Z value) {
            this.value = value;
        }
    }

    @Override
    public void add(Y value) {
        Node<Y> newNode = new Node<>(value);
        if (head == null) {
            this.head = newNode;
        }
    }

    @Override
    public Iterator<Y> iterator() {
        return null;
    }

    private class LinkedListIterator implements Iterator<Y> {
        private Node<Y> current;

        LinkedListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Y next() {
            return null;
        }
    }
}
