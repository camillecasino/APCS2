public class LListS {

    // previously coded LList methods with string params

    public LListS() {
	l = new Node();
	len = 0;
    }

    // adds at the beginning of the "list," which is technically
    // after the first dummy node (declared in the constructor)

    
    public void add(String s) {
	Node tmp = new Node(s);
	// checks if the list only has one element in it,
	// in which case we can just add tmp after the
	// dummy node without issue
	if (l.getNext() == null) {
	    l.setNext(tmp);
	} else {
	    // otherwise, we need to make sure that the rest
	    // of the list doesn't get lost.
	    // after we set tmp's next node to the dummy node's
	    // next node (which is the first real node in the
	    // list), we have to push the dummy node back to the
	    // front by setting its next as tmp.
	    tmp.setNext(l.getNext());
	    l.setNext(tmp);
	}
	// adds to length since we are adding to the list
	len = len + 1;
    }

    public String toString() {
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

    // adds to a specified index

    public void add(int i, String s) {
	Node tmp = new Node(s);
	// checks if we wanna add this node at the
	// 0th index, which is actually just the beginning
	if (i == 0) {
	    // therefore there's nothing wrong with using
	    // the add method with one param that we
	    // wrote before, since it automatically
	    // places the node in the beginning (aka,
	    // after the dummy node)
	    add(s);
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

    public static void main(String[] args) {
	
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
    }



}
