public class Stack {

    public Node L;
    
    public Stack() {
        L = null;
    }

    public void push(Node n) {
        n.setNext(L);
	L = n;
    }

    public void push(char c, int x, int y) {
	Node n = new Node(c,x,y);
	n.setNext(L);
	L = n;
    }

    public Node pop() {
	Node tmp = L;
	L = L.getNext();
	return tmp;
    }

    public boolean empty() {
        return L == null;
    }

    public Node peek() {
	if (!empty()) {
	    return L;
	}
	return null;
    }
    
    public String toString() {
	String s = "";
	Node tmp;
	for (tmp = L; tmp != null; tmp = tmp.getNext()){
	    s = s + " <-- " + tmp;
	}
	return s;
    }
}
