import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	Queue a = new Queue();
	Node n = new Node(1);
	a.enqueue(1);
	System.out.println(a.front());		
	System.out.println(a.empty());
	System.out.println(a.size());
	a.dequeue();
	System.out.println(a.front());		
	System.out.println(a.empty());
	System.out.println(a.size());
    }
}
