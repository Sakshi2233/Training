//import Linkedlist.Node;

//import Linkedlist.Node;

public class Stack {
	private class Node{
		private int data;
		private Node next;               //no datatype
		public Node(int data) {
			super();
			this.data = data;
			
		}
		public int getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	private Node first, last ;
	
	public void print() {
		Node t=first;
		while(t!=null) {
			System.out.println(t.getData());
			t=t.getNext();
		}
	}
	
	public void push(int data) {
		
		 Node n = new Node(data);
		 if(last==null)
			 last=n;
		 if(last!=null) {
			 n.setNext(first);
			 
		first=n;
			 
		 }
		 
					
	}
	
	public int pop() {
		if(first!=null) {
		int data=first.getData();
		first=first.getNext();
		return data;
		}
		else 
			System.out.println("Stack is empty...");
		return 0;
	}
	

}
