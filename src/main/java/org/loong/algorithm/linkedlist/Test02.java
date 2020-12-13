package org.loong.algorithm.linkedlist;


import java.util.Objects;

public class Test02 {


    public static void main(String[] args) {
        MyNode<String> myNode = new MyNode<>();
        //myNode.addFirst("1");myNode.addFirst("2");myNode.addFirst("3");myNode.add(0, "6");

        myNode.addLast("1");myNode.addLast("2");myNode.addLast("3");

        myNode.delete(0);
        myNode.print();

    }


    public static class MyNode<E> {

        private class Node {

            E e;

            Node next;

            public Node(E e, Node next) {
                this.e = e;
                this.next = next;
            }

            public Node(E e) {
                this(e, null);
            }

            public Node() {
                this(null);
            }

        }


        private Node head;

        private int size;


        public MyNode() {
            head = new Node(null);
        }

        public void addFirst(E e) {
            this.add(0, e);
        }


        public void add(int index, E e) {

            Node prev = this.head;
            for (int i = 0; i < index; i++) {
                prev = head.next;
            }


            prev.next = new Node(e, prev.next);

            size++;
        }


        public void addLast(E e) {

            this.add(size, e);

        }

        public void delete(int index) {

            Node prev = this.head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            Node relNode = prev.next;

            prev.next = relNode.next;
            relNode.next = null;
            size--;

        }

        public void print() {

            Node temp = this.head.next;
            while (!Objects.isNull(temp)) {
                System.out.println(temp.e);
                temp = temp.next;
            }

        }



    }


}

