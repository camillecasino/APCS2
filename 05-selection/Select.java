import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Select {

    private int pivot;
    private ArrayList<Integer> aL;
    
    public void partition() {
	for (int i = 0; i < this.length; i++) {
	    if (this.get(i) < 6) {
		this.add(0, this.get(i));
	    } else {
		this.add(this.get(i));
	    }
	}
    }

    public static void main(String[] args) {
	ArrayList<Integer> aL = new ArrayList<Integer>();
	aL.add(1);
	aL.add(13);
	aL.add(25);
	aL.add(4);
	aL.add(6);
	aL.add(17);
	aL.add(2);
	aL.partition();
	System.out.println(aL);
    }


}
