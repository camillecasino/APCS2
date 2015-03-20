public class LLit {
    private Node l;
    public LLit() {
	l = n.getNext();
    }

    public boolean hasNext() {
	return l != null;
    }

    public String next() {
	String s = l.getData();
    }
}
