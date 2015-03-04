import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class mergeSort {

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	if (A.get(A.size() - 1) < B.get(0)) {
	    result.addAll(A);
	    result.addAll(B);
	    return result;
	} else {
	    int iA = 0;
	    int iB = 0;
	    while (A.get(iA) < B.get(iA)) {
		if (A.get(0) < B.get(0)) {
		    result.add(A.remove(0));
		} else {
		    result.add(B.remove(0));
		}
	    }
	    while (A.size() > 0) {
		result.add(A.remove(0));
	    }
	    
	    while (B.size() > 0) {
		result.add(B.remove(0));
	    }
	    
	    return result;
	    
	}
    }
/*
    public ArrayList<Integer> getA() {
	return A;
    }

    public ArrayList<Integer> getB() {
	return B;
    }

    public ArrayList<Integer> getResult() {
	ArrayList<Integer> r = merge(A, B);
	return r;
    }
*/
    public static void main(String[] args) {
	/*
	mergeSort ms = new mergeSort();
	ArrayList<Integer> a = ms.getA();
	ArrayList<Integer> b = ms.getB();
	//System.out.println(a);
	//ArrayList<Integer> a = new ArrayList<Integer>();
	//a.add(1);
	//a.add(2);
	//a.add(3);
	//ArrayList<Integer> b = new ArrayList<Integer>();
	//b.add(4);
	//b.add(5);
	//b.add(12);
	ms.merge(a, b);
	//System.out.println();
	System.out.println(ms.getResult());
	*/
	
	
	
	
    }
    
}
