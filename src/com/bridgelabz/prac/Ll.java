package com.bridgelabz.prac;


public class Ll{
	static Node head;
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
			
			if(Ll.head==null)
			{
				Ll.head=n;
			}
			else
			{
			    last = Ll.head;
				while(last.next!=null)
				{
					last = last.next;
				}
				last.next=n;
				
				
			}
			return list;
		}	
		
		//insert head of the list
		public static Ll insertBeg(Ll list ,int data)
		{
			Node n = new Node(data);
			n.next=null;
			if(Ll.head==null)
			{
				list.head=n;
				n.next=null;
			}
			else{
				
				n.next = Ll.head;
				Ll.head=n;
			}
			
			return list;
		}
		public static Ll insertAfter(Ll list,Node prev,int data)
		{
			if(prev==null)
			{
				System.out.println("prev cannot be null");
			}
			Node n =new Node(data);
			n.data=data;
			n.next=prev.next;
			prev.next=n;
			return list;
		}
		//insert end
		public static Ll insertEnd(Ll list,int data)
		{
			Node n = new Node(data);

			n.next=null;
			
			if(Ll.head==null)
			{
				Ll.head=n;
				
			}
			else
			{
				Node last=Ll.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=n;
			}
			return list;
		}
		//Del head of list
		public static Ll DelHd(Ll list)
		{
			
			if(Ll.head==null)
			{
			System.out.println("lis empty");
			}
			else{
				
				Node temp=head;
				head = head.next;
				System.out.println("delted "+temp.data);
				
			}
			
			return list;
		}
		//Delete at
		public static Ll Delat(Ll list,int pos)
		{
			if(Ll.head ==null)
			{
				System.out.println("empty");
			}
			else
			{
				Node temp=Ll.head;
				if(pos==0)
				{
					Ll.head=temp.next;
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
			return list;
		}
		//delete last
		public static Ll Dellast(Ll list)
		{
			if(Ll.head==null)
			{
			System.out.println("lis empty");
			}
			else{
				
				Node scndlast=head;
				while(scndlast.next.next!=null)
				{
					scndlast=scndlast.next;
				}
				scndlast.next=null;
				System.out.println("last found and delted");
			}
			
			return list;
		}
		//printlist
		public static Ll printList(Ll list)
		{
			Node temp = Ll.head;
			if(temp==null)
			{
				System.out.println("list empty");
			}
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.next;
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
        list = insertBeg(list, 5);
        list = insertEnd(list,6);
        list = DelHd(list);
        list = Dellast(list);
        list = insertEnd(list, 7);
        list = insertAfter(list,head.next.next,8);
        list = Delat(list,2);
  
        // Print the linkedlist 
        printList(list); 
	}

}
