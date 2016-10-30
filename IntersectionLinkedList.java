package com.sai;

public class IntersectionLinkedList {
	
	IntersectLink head1,head2;
	
	public int getNode() {
		
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;
		
		if(c1> c2)
		{
			d = c1-c2;
			return getIntersection(head1,head2,d);
		}
		else
		{
			d = c2-c1;
			return getIntersection(head2,head1,d);
			
		}

	}
	
	public int getIntersection(IntersectLink head1, IntersectLink head2, int d) {
		
		IntersectLink curr1 = head1;
		IntersectLink curr2 = head2;
		for(int i=0; i< d;i++)
		{
			if(curr1 == null){
			return -1;}
			curr1 = curr1.next;
			
		}
		while(curr1 !=null && curr2!=null)
		{
			if(curr1.data == curr2.data)
			{
				return curr1.data;
			}
			curr1= curr1.next;
			curr2= curr2.next;
		}
		
		return -1;
	}

	public int getCount(IntersectLink node)
	{
		int count =0;
		IntersectLink current = node;
		while(current != null)
		{
		    current = current.next;
			count++;
			
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		
		IntersectionLinkedList Il = new IntersectionLinkedList();
		Il.head1 = new IntersectLink(3);
		Il.head1.next = new IntersectLink(6);
		Il.head1.next.next = new IntersectLink(9);
		Il.head1.next.next.next = new IntersectLink(15);
		Il.head1.next.next.next.next = new IntersectLink(30);
		
		
		Il.head2 = new IntersectLink(10);
		Il.head2.next = new IntersectLink(15);
		Il.head2.next.next = new IntersectLink(30);
		
		
		System.out.println("Meeting node is" + Il.getNode());
		

	}
}

class IntersectLink{
	
	int data;
	IntersectLink next;
	IntersectLink(int data){
		this.data = data;
	}
}
