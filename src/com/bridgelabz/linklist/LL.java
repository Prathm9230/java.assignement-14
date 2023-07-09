package com.bridgelabz.linklist;
public class LL
{ //First We need to create Node class for linked list,that contains our data and nextpointer.
    Node head;
    class Node{
        int data;
        Node next;
        public  Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    //Secondly we need to create one method that will append nodes to link list
    public void appendNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    //This pop method will remove the first element.
    public void pop()
    {
        if (head == null) {
            System.out.println("list is empty list");
            return;
        }
        head = head.next;
    }
    //We need to crete one method that will print our linked list.
        public void printNode()
        {
            if (head == null) {
                System.out.println("list is empty list");
                return;
            }
            Node temp = head;
            while (temp!= null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

    public static void main(String[] args) {
        LL list = new LL();
        list.appendNode(56);
        list.appendNode(30);
        list.appendNode(70);
        list.pop();
        System.out.println("After deleting first node:");
        list.printNode();
    }

}
