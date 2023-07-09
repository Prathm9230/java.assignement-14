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
    //Secondly we need to create one method that will add our nodes to linked list
    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    //We need to crete one method that will print our linked list.
        public void print()
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
        //In main method we are accpeting the data values and calling print()
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
       list.print();
    }
}
