public class LList {
    // just in case I need to present my code tomorrow,
    // at least I'll have reference for myself if I
    // forget how exactly to explain anything! :)
    private Node l;
    private int len;

    public LList() {
	l = new Node();
	len = 0;
    }

    public LLit getLLit() {
	LLit llit = new LLit(l);
	return llit;
    }

    public void addInt(int n) {
	Node tmp = new Node(n);
	if (l.getNext() == null) {
	    l.setNext(tmp);
	} else {
	    tmp.setNext(l.getNext());
	    l.setNext(tmp);
	}
    }

    // toString method
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node getStart() {
	return T.getNext();
    }


    public void addInt(int i, int n) {
	Node tmp = new Node(n);
	// checks if we wanna add this node at the
	// 0th index, which is actually just the beginning
	if (i == 0) {
	    // therefore there's nothing wrong with using
	    // the add method with one param that we
	    // wrote before, since it automatically
	    // places the node in the beginning (aka,
	    // after the dummy node)
	    add(n);
	} else {
	    // now we find out what the node was
	    // that's in the spot BEFORE the spot
	    // that we want.
	    // ex: in a list
	    // null > 4 > 3 > 2 > 1 > 0 > null
	    // if we want our node to go into
	    // index 2 then we look at index 1,
	    // which in this case is 3.
	    // we use that information in the
	    // next (if you'll pardon the pun)
	    // step.
	    Node preN = get(i - 1);
	    
	    // now that we know the node that was
	    // in the spot before our desired
	    // spot, we find out what comes after it,
	    // and set that to be our next.
	    // continuing with the previous example,
	    // we find out that 2 comes after 3,
	    // so we set 1 to be our node's next.
	    // now the second half of the list looks
	    // like this:
	    // "hey" > 2 > 1 > 0 > null
	    tmp.setNext(preN.getNext());
	    
	    // after this, we can set the next of the
	    // node in index i - 1 to our node, to 
	    // re-link the whole thing together.
	    // the final list:
	    // null > 4 > 3 > hey > 2 > 1 > 0 > null
	    preN.setNext(tmp);
	}
	len = len + 1;
    }
    
    
    public void remove(int i) {
	// preN is the node before the one
	// we want to remove
	Node preN = get(i - 1);

	// postN is the node after the one
	// we want to remove
	Node postN = get(i + 1);

	// in order to make it so that
	// it's like the node doesn't
	// exist, we need to remove
	// the links that connect it
	// to the list and link
	// those two together.
	preN.setNext(postN);
	// now it's like the node was never there O_o
	len = len - 1;
    }
	
    public int removeIntRet(int i) {
	Node T = l;
	if (i >= len || i < 0) {
	    //throw exception
	} else {
	    for (int j = 0; j < i - 1; j++) {
		T = T.getNext();
	    }
	}
	int s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	return s;
    }

    public boolean removeBooRet(int n) {
	Node T = l;
	while (T.getNext() != null) {
	    if (T.getNext().getData() == n) {
		T.setNext(T.getNext().getNext());
		return true;
	    }
	}
	return false;
    }

    public boolean removeBooRetZ(int n) {
	Node T = l.getNext();
	Node T2 = l;
	while (T != null) {
	    if (T.getData() == n) {
		T2.setNext(T.getNext());
		return true;
	    }
	    T2 = T;
	    T = T.getNext();
	}
	return false;
    }

    public int getInt(int i) {
	return get(i).getData();
    }

    

    public Node get(int i) {
	Node f = l;
	int a = 0;
	// this was the same as the find routine
	// except since we have a dummy node in
	// the beginning, we need to add 1 to i
	// so that the list can have a simulated
	// beginning at the node after the first
	// dummy one.
	while (a < i + 1) {
	    f = f.getNext();
	    a = a + 1;
	}
	return f;
    }

    public int getLength() {
	return len;
    }
    //just to check if the len parts of each method work


    public static void main(String[] args) {

	Node T = l.getStart();
	while (l != null) {
	    System.out.println(L.getData());
	    l = l.getNext();
	}
	/*
	  LList LL = new LList();
	  System.out.println(LL);
	  System.out.println(LL.getLength());
	  System.out.println();
	  LL.add("hi");
	  //System.out.println(LL.getLength());
	  LL.add("1");
	  //System.out.println(LL.getLength());
	  LL.add("13");
	  //System.out.println(LL.getLength());
	  LL.add("888");
	  //System.out.println(LL.getLength());
	  System.out.println(LL);
	  LL.add(3, "whaddup");
	  System.out.println(LL);
	  System.out.println(LL.getLength());
	  System.out.println();
	  System.out.println(LL);
	  LL.remove(2);
	  System.out.println(LL);
	  System.out.println(LL.getLength());
	*/
	
    }
}		
