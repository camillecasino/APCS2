public class Tree {
    private Node T;

    public Tree() {
	T = new Node();
    }

    public void insert(Node t, int i) {
	//Node tmp = new Node();
	//tmp.setData(i);
	Node T = t;
	Node T2;
	if (i < T.getData()) {
	    T2 = T.getLeft();
	} else {
	    T2 = T.getRight();
	}
	while (T != null) {
	    if (i < T.getData()) {
		T2 = T;
		T = T.getLeft();
	    } else {
		T2 = T;
		T = T.getRight();
	    }
	}
	if (i < T2.getData()) {
	    T2.setLeft(i);
	} else {
	    T2.setRight(i);
	}
    }

    public Node search(Node t, int i) {
	Node T = t;
	Node T2;
	if (i == T.getData()) {
	    return T;
	} else if (i < T.getData()) {
	    T2 = T.getLeft();
	} else {
	    T2 = T.getRight();
	}
	while (T != null) {
	    if (i == T.getData()) {
		return T;
	    } else if (i < T.getData()){
		T2 = T;
		T = T.getLeft();
	    } else {
		T2 = T;
		T = T.getRight();
	    }
	}
	return null;
	// if (i = T2.getData()) {
	//     T2.setLeft(i);
	// } else {
	//     T2.setRight(i);
	// }
    }

    public void rinsert(Node t, int i) {
	Node T = t;
	Node T2;
	if (i < T.getData()) {
	    T2 = T;
	    T = T.getLeft();
	} else {
	    T2 = T;
	    T = T.getRight();
	}
	if (T != null) {
	    if (i < T.getData()) {
		rinsert(T.getLeft(), i);
	    } else {
		rinsert(T.getRight(), i);
	    }
	} else {
	    if (i < T2.getData()) {
		T2.setLeft(i);
	    } else {
		T2.setRight(i);
	    }
	}
    }
	
	
	    
    public Node rsearch(Node t, int i) {
	Node T = t;
	if (i == T.getData()) {
	    return T;
	} else if (i < T.getData()) {
	    rsearch(T.getLeft(), i);
	} else {
	    rsearch(T.getRight(), i);
	}
	return null;
    }
}
