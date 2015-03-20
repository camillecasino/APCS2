import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.System;

public class TimeTest {
    public static void main(String[] args) {
	Random rnd = new Random();
	
	// ARRAYLIST TIME TEST
        long start, elapsed;
	ArrayList<Integer> aL = new ArrayList<Integer>();
	for (int i = 0; i < 1000000; i++) {
	    int r = rnd.nextInt(100);
	    aL.add(r);
	}
	//System.out.println(aL);
	int sum = 0;   
	start = System.currentTimeMillis();
	for (int i = 0; i < 1000000; i++) {
	    sum = sum + aL.get(i);
	}
	//elapsed = System.currentTimeMillis() - start;
	//System.out.println(sum);
	//System.out.println(elapsed);

	//System.out.println();
	//System.out.println();

	// LINKED LIST 1 TIME TEST
	long startL, elapsedL;
	LList LL = new LList();
	for (int j = 0; j < 1000000; j++) {
	    int r = rnd.nextInt(100);
	    LL.addInt(r);
	}
	System.out.println(LL);
	int sum = 0;
	for (int i = 0; i < 1000000; i++) {
	    


	// BUILT-IN LINKED LIST TIME TEST
	
    }
}
