public class Queue{
    Node head;
    Node tail;
    int size;	
    public Queue(){
	head = new Node();
	tail = new Node();
	size = 0;
    }
    public void enqueue(Node n) {
	Node newNode = n;
	Node tmp = head;
	if(size==0){
	    head.setNext(newNode);
	} else {		
	    tail.setNext(newNode);
	    tail = newNode;
	}
	size++;
    }
    
    public void enqueue(char ch, int x, int y) {
	Node newNode = new Node(ch, x, y);
	Node tmp = head;
	if (size == 0) {
	    head.setNext(newNode);
	} else {
	    tail.setNext(newNode);
	    tail = newNode;
	}
	size++;	    
    }

    public Node dequeue() {
	Node a = head.getNext();
	head.setNext(a.getNext());
	size--;		
	return a;
		
    }
    public boolean empty(){
	return(size==0);
    }
    public Node front() {
	Node a = head.getNext();
	return a;
    }
    public int size(){
	return size;
    }

    public String toString() {
	String s = "head <-- ";
	Node tmp = head.getNext();
	while (tmp != null) {
	    s = s + tmp.getData() + "<-- ";
	    tmp = tmp.getNext();
	}
	return s + "tail";
    }


}
