package com.epam.gitdemo;
 
import java.util.*;
public class LinkedList { 
  
    Node head; 
    static class Node { 
  
        int data; 
        Node next; 
 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    public static LinkedList insert(LinkedList list, int data) 
    { 

        Node new_node = new Node(data); 
        new_node.next = null; 

        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 

            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 

            last.next = new_node; 
        } 

        return list; 
    } 
 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
	int l=0,k=0;
        System.out.print("Middle element: "); 
        while (currNode != null) { 
            l++;
            currNode = currNode.next; 
        } 
        
        if(l%2==0)	{
			 currNode = list.head;
			 k=0;
			 while (k!=(l/2-1)) 
				{ 
		            		k++;
		            	currNode = currNode.next; 
		        	}
			 System.out.print(currNode.data + " ");
		 }
        currNode = list.head;
        k=0;
		while (k!=l/2) 
		{ 
            		k++;
            	currNode = currNode.next; 
        	}
		 System.out.print(currNode.data + " ");
		 
    } 

    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
  	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of elements:");
	int n=s.nextInt();
	System.out.println("enter elements:");
	for(int i=0;i<n;i++)
	{
		int x=s.nextInt();
		list = insert(list, x); 
	}
        printList(list); 
    } 
} 