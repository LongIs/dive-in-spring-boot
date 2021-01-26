package org.loong.algorithm.linkedlist;

public class Test04 {


    public static void main(String[] args) {
        MyNode<String> myNode = new MyNode<>();
        myNode.addLRU("1");myNode.addLRU("2");myNode.addLRU("3");myNode.addLRU("4");myNode.addLRU("5");myNode.addLRU("9");
        myNode.addLRU("10");

        //System.out.println(myNode.getLRU("9"));
        //System.out.println("============");
        // myNode.practiceQuestions(3);

        /*System.out.println(myNode.oddElement());*/
        //myNode.createLoop("7");
        //System.out.println(myNode.loop());

        // myNode.reversal1();
        myNode.print();
    }


    public static class MyNode<E> {

        private class Node{

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

        private Node head, tail;

        private int size;

        public void createLoop (E e){

            Node node = head;
            while (node != null) {

                if (node.e == e) {
                    break;
                }

                node = node.next;
            }


            tail.next = node;
            // node.next = null;
        }

        public void addFirst(E e) {
            if (head == null) {
                head = new Node(e);
                tail = head;
                return;
            }

            head = new Node(e, head);

        }

        public void addLast(E e) {

            if (head == null) {
                head = new Node(e);
                tail = head;
                return;
            }

            tail.next = new Node(e);
            tail = tail.next;


        }

        public void print() {

            Node node = head;
            while (node != null) {
                System.out.println(node.e);
                node = node.next;
            }

        }

        /**
         * 给定一个奇数个元素的链表，查找出这个链表中间位置的结点的数值
         */
        public E oddElement() {

            Node head = this.head.next;
            Node tow = head.next;

            while (tow.next != null) {

                head = head.next;
                tow = tow.next.next;
            }

            return head.e;
        }

        /**
         * 判断链表是否有环
         */
        public E loop() {

            Node slow = this.head;
            Node fast = head.next;

            while (fast.next != null && fast.next.next != null) {
                if (slow == fast) {
                    return slow.e;
                }

                slow = slow.next;
                fast = fast.next.next;
            }
            return null;

        }

        /**
         * 给定一个含有 n 个元素的链表，现在要求每 k 个节点一组进行翻转，打印翻转后的链表结果。其中，k 是一个正整数，且可被 n 整除。
         * 例如，链表为 1 -> 2 -> 3 -> 4 -> 5 -> 6，k = 3，则打印 321654。
         */
        public void practiceQuestions (int nodeNumber){



        }

        /**
         * 链表翻转
         */
        public void reversal1() {

            Node head = this.head;
            Node cur = head.next;
            head.next = null;
            while (cur != null) {
                Node next = cur.next;
                cur.next = head;
                head = cur;
                cur = next;
            }
            this.head = head;
        }


        /**
         * 1. 实现LRU缓存淘汰算法
         */
        public E getLRU(E e) {
            Node node = this.head;
            if (node.e.equals(e)) {
                return node.e;
            }

            Node temp = this.head;
            Node cur = node.next;
            while (cur != null) {
                if (cur.e.equals(e)) {
                    node.next = node.next.next;
                    cur.next = temp;
                    break;
                }
                node = node.next;
                cur = cur.next;
            }
            this.head = cur;
            return cur.e;
        }

        /**
         * 2. 实现LRU缓存淘汰算法
         */
        public void addLRU(E e) {
            if (size >= 2) {
                Node head = this.head;
                for (int i = 0; i < size - 2; i++) {
                    head = head.next;
                }
                size--;
                head.next = null;
                this.tail = head;
            }
            this.addFirst(e);
            size++;
        }

        /**
         * 单链表 如何判断一个字符串是否是回文字符串的问题
         */
        public boolean isPalindrome() {

            Node node = this.head;


            return Boolean.TRUE;
        }
    }

}
