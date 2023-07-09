package com.bridgelabz.linklist;
public class LL
{ //First We need to create Node class for linked list,that contains our data and nextpointer.
    Node head;
    int number;
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
    public void popLast()
    {
        if (head == null) {
            System.out.println("list is empty list");
            return;
        }
       Node secondLast = head;
        Node Last = head.next;
        while(Last.next!=null)
        {
            Last = Last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public boolean findNode(int data)
    {
        if (head == null) {
            System.out.println("list is empty list");
        }
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == data)
            {
                System.out.println("Number is found.");
                return true;
            }
            temp=temp.next;
        }
        System.out.println("Number not found");
        return false;
    }
    public void insertNode(int newData) {
        Node newNode = new Node(newData);

        if (head == null)
        {
            head = newNode;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.data == 30 && currentNode.next.data == 70)
                {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void deleteIelement(int data)//delete Inserted element
    {
        int number;
        Node temp =head;
        while (temp.next.data!=data)
        {
           temp=temp.next;
         }
             temp.next=temp.next.next;
             temp=null;
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
        list.printNode();
        list.insertNode(40);
        list.deleteIelement(40);
        list.printNode();
       // System.out.println(list.findNode(30));

    }

}
