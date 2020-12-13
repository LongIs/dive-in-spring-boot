package org.loong.algorithm.linkedlist;

public class Test03 {

    public static void main(String[] args) {

        MyNode<String> myNode = new MyNode<>();
        myNode.addLast("1");myNode.addLast("2");myNode.addLast("3");myNode.addLast("4");myNode.addLast("5");
        myNode.reversal1();
        myNode.print();

    }


    public static class MyNode<E>{

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

        public void MyNode() {
            head = null;
            tail = null;
            size = 0;
        }

        private Node head, tail;

        private int size;


        public void add(int index, E e) {

            if (head == null) {
                head = new Node(e);
                tail = head;

            }else if (index == 0) {
                head = new Node(e, head);

            }else {

                Node pre = head;
                for (int i = 0; i < index - 1; i++) {
                    pre = pre.next;
                }

                pre.next = new Node(e, pre.next);

            }
            size++;
        }

        public void addFirst(E e) {
            this.add(0, e);
        }

        public void addLast(E e) {
            if (head == null) {
                head = new Node(e);
                tail = head;
                return;
            }

            tail.next = new Node(e);
            tail = tail.next;
            size++;
        }

        public E get(E e) {

            Node node = head;
            while (node != null) {

                if (node.e.equals(e)) {
                    return node.e;
                }
                node = node.next;
            }

            return null;
        }

        public void delete(E e) {

            Node node = head;
            while (node != null) {
                if (node.next.e.equals(e)) {
                    break;
                }
                node = node.next;
            }

            Node rel = node.next;
            node.next = node.next.next;
            rel.next = null;

        }

        public void print() {

            Node node = head;
            while (node != null) {
                System.out.println(node.e);
                node = node.next;
            }

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


        public void reversal () {

            //获取头结点
            Node head = this.head;
            if(head == null){
                return;
            }
            //获取头结点的下一个节点
            Node next = head.next;
            // 清除头节点的next节点
            head.next = null;
            //如果存在下一个节点，循环遍历
            while(next != null){
                //保存下下个节点
                Node tmp = next.next;
                //下一个节点执行head节点
                next.next = head;
                //下一个节点置为head节点
                head = next;
                //检查下下一个节点
                next = tmp;
            }
            this.head = head;
        }

    }

}

