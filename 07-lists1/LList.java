public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public void insert(int n, String s) {
	Node n = new Node(s);
	if (n == 0) {
	    n.setNext(l);
	    l = n;
	} else {
	    Node preN = find(n - 1);
	    n.setNext(preN.getNext());
	    preN.setNext(newNode);
	}
    }

    public Node find(int i) {
	Node f = l;
	int a = 0;
	while (a < i) {
	    f = f.getNext();
	    a = a + 1;
	}
	return f;
    }
		
}
