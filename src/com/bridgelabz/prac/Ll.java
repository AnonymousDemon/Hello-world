package com.bridgelabz.prac;

class Ll{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data =d;
			next=null;
	}
	}
	
		public static Ll insert(Ll list,int data)
		{
			Node n = new Node(data),last;
			n.next=null;
			
			if(list.head==null)
			{
				list.head=n;
			}
			else
			{
			    last = list.head;
				while(last.next!=null)
				{
					last = last.next;
				}
				last.next=n;
				
				
			}
			return list;
		}	
		
		
		public static Ll insertBeg(Ll list ,int data)
		{
			Node n = new Node(data);
			n.next=null;
			if(list.head==null)
			{
				list.head=n;
				n.next=null;
			}
			else{
				
				n.next = list.head;
				list.head=n;
			}
			
			return list;
		}
//		public static Ll insertEnd(Ll list, int data)
//		{
//			Node n =new Node(data);
//			Node last = list.head;
//			if(list.head==null)
//			{
//			list.head = n;
//			
//			}
//			else
//			{						
//				while(last.next!=null)
//				{
//					last = last.next;
//					last.next=n;
//				}
//				
//			}
//			return list;
//		}

		public static Ll printList(Ll list)
		{
			Node cur = list.head;
			
			System.out.println("Linkedlist:");
			if(list.head==null)
			{
				System.out.println("list is empty");
			}
			else
			{
			while(cur.next!=null)
			{
				System.out.println(cur.data+"");
				cur =cur.next;
			}
			}
			return list;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ll list = new Ll(); 
		  
        // 
        // ******INSERTION****** 
        // 
  
		
//        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        list = insert(list, 9); 
		
        list = insertBeg(list, 3);
        //list = insertEnd(list, 3);
  
        // Print the linkedlist 
        printList(list); 
	}

}
