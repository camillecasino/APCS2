public class LList {
    
    private Node l;
    private int len;

    public LList() {
	l = new Node();
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	if (l.getNext() == null) {
	    l.setNext(tmp);
	} else {
	    tmp.setNext(l.getNext());
	    l.getNext().setNext(tmp);
	}
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

    public void insert(int i, String s) {
	Node n = new Node(s);
	/*if (n == 0) {
	    n.setNext(l);
	    l = n;
	} else {
	*/
	    Node preN = find(i - 1);
	    n.setNext(preN.getNext());
	    preN.setNext(n);
	
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

    public static void main(String[] args) {
	LList LL = new LList();
	System.out.println(LL);
	System.out.println();
	LL.add("hi");
	LL.add("1");
	LL.add("13");
	LL.add("888");
	System.out.println(LL);
	
    }
		
}
