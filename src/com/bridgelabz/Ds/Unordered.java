package com.bridgelabz.Ds;


public class Unordered<T> {
 public static Node head;
 	
	
static class Node
{
	int data;
	Node next;
	
}


	

public  void Insert(int data) {
	Node n=new Node();
	n.data=data;
	if(head==null) {
		head =n;
	}
	else {
		Node last=head;
		while(last.next!=null)
		{
			last =last.next;
		}
		last.next=n;
		
	}
}

//insert at beginning
public  void InsertBeg(int data) {
	Node n=new Node();
	n.data=data;
	if(head==null) {
		head =n;
	}
	else {
		n.next=head;
		head=n;
		System.out.println(n.data+"inserted at head");

	}
}
//insert after
public void insertAfter(Node prev,int data)
{
	if(prev==null)
	{
		System.out.println("prev cannot be null");
	}
	Node n = new Node();
	n.data=data;
	n.next=prev.next;
	prev.next=n;
}
//insert at end
public void InsertEnd(int data)
{
	Node n = new Node();
	n.data=data;
	if(head==null)
	{
		head=n;
		n.next=null;
	}
		else
	{
			Node last=head;
			while(last.next!=null)
			{
				last =last.next;
			}
			last.next=n;
			System.out.println(n.data+"inserted at end");
	}
}
//del head
public void DelHd()
{
	if(head==null)
	{
		System.out.println("List empty");
	}
	else
	{
		Node temp=head;
		head=head.next;
		System.out.println(temp.data+"head found and deleted");
				
	}
}
//Del at position
public void Delat(int pos)
{
	if(head ==null)
	{
		System.out.println("empty");
	}
	else
	{
		Node temp=head;
		if(pos==0)
		{
			head=temp.next;
		}
		for(int i=0;temp!=null&&i<pos-1;i++)
		{
			temp=temp.next;
			
		}
		if(temp==null||temp.next==null)
		{
			
		}
		Node next =  temp.next.next;
		temp.next=next;
	}
}
//del last elemnt
public void Dellast()
{
if(head==null||head.next==null)
{
	System.out.println("List empty");
}
else
{
	Node scndlst=head;
	while(scndlst.next.next!=null)
	{
		scndlst=scndlst.next;
	}
	scndlst.next=null;
	System.out.println("last found and deleted");
			
}
	
}
public void printList()
{
	Node temp = head;
	if(temp==null)
	{
		System.out.println("list empty");
	}
	while(temp != null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unordered<Integer> ol = new Unordered<Integer>();
		ol.Insert(1);
		ol.Insert(2);
		ol.insertAfter(head.next, 5);
		ol.InsertBeg(3);
		ol.InsertEnd(4);
		ol.DelHd();
		ol.Dellast();
		ol.Delat(1);
		ol.printList();
	}

}
