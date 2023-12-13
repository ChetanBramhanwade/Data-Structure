
public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = newNode;
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("LinkedList is empty");
		}else {
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("LinkedList is Empty");
		}else {
			Node temp=head;
			if(temp.next == null) {
				head = null;
			}else {
				while(temp.next.next != null)
					temp=temp.next;
				temp.next = null;
			}
		}
	}
	
	public void display() {
		Node temp = head;;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
			
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(50);
		ll.addLast(60);
		ll.deleteFirst();
		ll.deleteLast();
		ll.display();
	}
}
