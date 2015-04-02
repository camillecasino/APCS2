public class Queue<E>{
    Node<E> head;
    Node<E> tail;
    int size;	
    public Queue(){
	head = new Node<E>(null);
	tail = new Node<E>(null);
	size = 0;
    }
    public void enqueue(E data){
	Node<E> newNode = new Node<E>(data);
	Node<E> tmp;
	tmp = head;
	if(size==0){
	    head.setNext(newNode);
	}
	else{
				
	    while(tmp.getNext()!=tail){
		tmp = tmp.getNext();
	    }		
	}
	tmp.setNext(newNode);
	size++;
    }
    public Node<E> dequeue() {
	Node<E> a = head.getNext();
	head.setNext(a.getNext());
	size--;		
	return a;
		
    }
    public boolean empty(){
	return(size==0);
    }
    public Node<E> front() {
	Node<E> a = head.getNext();
	return a;
    }
    public int size(){
	return size;
    }
}
