import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class mergeSort {

    ArrayList<Integer> A;
    ArrayList<Integer> B;
    ArrayList<Integer> result;

    public mergeSort() {
	ArrayList<Integer> A = new ArrayList<Integer>();
	A.add(1);
	A.add(2);
	A.add(3);
	ArrayList<Integer> B = new ArrayList<Integer>();
	B.add(4);
	B.add(5);
	B.add(12);
    }

    public void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	if (A.get(A.size()) < B.get(0)) {
	    result.addAll(A);
	    result.addAll(B);
	}
    }

    public ArrayList<Integer> getA() {
	return A;
    }

    public ArrayList<Integer> getB() {
	return B;
    }

    public ArrayList<Integer> getResult() {
	return result;
    }

    public static void main(String[] args) {
	mergeSort ms = new mergeSort();
	ArrayList<Integer> a = ms.getA();
	ArrayList<Integer> b = ms.getB();
	ms.merge(a, b);
	System.out.println(ms.getResult());
    }
}
