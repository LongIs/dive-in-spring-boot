package org.loong.algorithm.linkedlist;

import java.util.LinkedList;
import java.util.Objects;

public class Test01 {


    public static void main(String[] args) {
        Node<String> node = new Node<>();
        node.add("zs");
        node.add("ls");
        node.add("ww");
        node.add("lq");
        node.add("io");

        node.addLRU("ww");
        node.printData();


        LinkedList<String> list = new LinkedList<>();
        list.add("13");
        list.get(0);
    }

    static class Node<T> {

        private static class InnerNode<T> {

            InnerNode<T> pre;
            T t;
            InnerNode<T> next;

            public InnerNode(InnerNode<T> pre, T t, InnerNode<T> next) {
                this.pre = pre;
                this.t = t;
                this.next = next;
            }

            public InnerNode(T t) {
                this.t = t;
            }

            public InnerNode() {

            }
        }

        private InnerNode<T> head;

        private InnerNode<T> tail;

        public void add(T t) {

            InnerNode<T> temp = tail;
            InnerNode<T> innerNode = new InnerNode<>(temp, t, null);

            if (Objects.isNull(head)) {
                head = innerNode;
            } else {
                temp.next = innerNode;
            }
            this.tail = innerNode;
        }

        public void printData() {
            InnerNode<T> node = head;
            while (!Objects.isNull(node)) {
                System.out.println(node.t + "");
                node = node.next;
            }

        }

        public void addLRU(T t) {

            InnerNode temp = null;

            InnerNode<T> node = this.head;
            while (!Objects.isNull(node.next)) {
                if (node.t == t) {
                    temp = node;
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                    break;
                }
                node = node.next;
            }


            temp.next = node;
            node.next = temp;


            //this.head = temp;


        }


    }
}

