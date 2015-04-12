public class Node{

    private char ch;
    private int x;
    private int y;
    private Node next;
    
    public Node(){
	x = 0;
	y = 0;
	next = null;
    }

    public Node(char c) {
	ch = c;
	next = null;
    }

    public Node(char c, int a, int b) {
	ch = c;
	x = a;
	y = b;
    }
    /*
    public void setX(int n){
	x = n;
    }

    public void setY(int n) {
	y = n;
    }
    */

    public int getX(){
	return x;
    }
    public int getY() {
	return y;
    }
    
    public void setData(int a, int b) {
	x = a;
	y = b;
    }

    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    
    public char getData() {
	return ch;
    }

    public String toString(){
	return "(" + x + ", " + y + ")";
    }
}
