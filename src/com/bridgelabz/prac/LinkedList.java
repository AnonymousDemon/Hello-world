package com.bridgelabz.prac;


public class LinkedList {
	private static Node head;
	private static int size;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		LinkedList ll = new LinkedList(10);
		ll.addHead(11);
		ll.addHead(12);
		ll.addHead(13);
		ll.addTail(8);
		ll.addTail(7);
		ll.addIndex(4,9);
		ll.addIndex(4,9);
		ll.deleteAtIndex(4);
		LinkedList.printList();

	}
	/**
	 * @param d
	 */
	public LinkedList(Object d)
	{
		head = new Node(d);
	}
	
	public void addHead(Object d)
	{
		Node temp = head;
		head = new Node(d);
		head.next = temp;
		size++;
	}
	
	public void addTail(Object d)
	{
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new Node(d);
		size++;
	}
	
	public void addIndex(int index, Object d)
	{
		Node temp = head;
		Node holder;
		for(int i=0; i < index-1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		holder = temp.next;
		temp.next = new Node(d);
		temp.next.next = holder;
		size++;
	}
	
	public void deleteAtIndex(int index)
	{
		Node temp = head;
		for(int i=0; i< index - 1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		System.out.println("found and deleted");
		size--;
	}
	
	public static int find(Node n)
	{
		Node t = head;
		int index = 0;
		while(t != n)
		{
			index++;
			t = t.next;
		}
		return index;
	}
	
	public static Node find(int index)
	{
		Node temp=head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
		
	public static void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static int getSize()
	{
		return size;
	}
	
	class Node
	{
		//Declare class variables
		private Node next;
		private Object data;
		
		public Node(Object d)
		{
			data = d;
		}
		
		public Object getdata()
		{
			return data;
		}
	}

}
