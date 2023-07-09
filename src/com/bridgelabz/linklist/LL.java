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
    public void appendNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    // To insert data value(node) in between two nodes,insertNode method we need to crete.
    public void insertNode(int prevData, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.data == prevData) {
                    Node nextNode = current.next;
                    current.next = newNode;
                    newNode.next = nextNode;
                    break;
                }
                current = current.next;
            }
        }
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
    public static void main(String[] args)
    {
        LL list = new LL();
        list.appendNode(56);
        list.appendNode(70);
        System.out.println("After insertion of 30 in between 56 and 70:")
            list.inserNode(56,30);
        list.printNode();

}
