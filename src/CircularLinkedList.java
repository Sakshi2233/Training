
public class CircularLinkedList {
		    private class Node{

	        private int data;

	        private Node next; //next is neither of the datatypes
	        
	     
	        

	        public Node(int data) {

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

	    

	    private Node first;

	    private Node current;

	    

	    public void add(int d) {

	        Node n = new Node(d);

	                if(first == null) //if no data is assigned than the first is null and hence n is saved in first

	                    first=n;

	                if(current != null) // it will check if the current is empty and than give the data to next

	                    current.setNext(n);    

	                current = n;
                      n.setNext(first);
	                

	    }

	    public void print() {

	        

	        Node t = first;

	        while(t != first) {

	            System.out.println(t.getData());

	            t= t.getNext();

	        }

	        }

	    public void addAfter(int pos,int data) {

            Node n = new Node(data);

            Node t = first;

            while (t != null) {

                if(t.getData() == pos) {

                    current = n;

                    n.setNext(t.getNext());

                    t.setNext(n);

                    break;

                }

                t=t.getNext();

            }    

        }

            

        public void addBefore(int pos,int data)    {

            Node n = new Node(data);

            Node t = first;

            Node p = null;

            while (t != null) {

                if(t.getData() == pos) {

                    if(t==first) {

                        n.next = t;

                        first = n;    

                    }

                    else {

                        p.setNext(n);

                        n.setNext(t);

                    }

                    break;

                }

                p=t;

                t= t.getNext();

            }    

    }

        

        public void remove (int pos) {

            Node t = first;

            Node p = null;

            while (t != null) {

                if(t.getData() == pos) {

                    if(t==first) {

                        first = t.getNext();    

                    }

                    else

                        p.setNext(t.getNext());

                        

                    t.next =null;

                    break;

                }

                p=t;

                t= t.getNext();

            }    

            

        }



	

}
