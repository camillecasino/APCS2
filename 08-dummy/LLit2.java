public class LLit<E> implements Iterator<E> {
    private Node<E> t;
    public LLit(Node<E> n) {
	t = n;
    }

    public boolean hasNext() {
	return t != null;
    }

    public E next() {
	
    }

    public void remove() {
    }

}
