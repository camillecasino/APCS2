import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class makelake {
    
    int R = 4, C = 6, E = 22, N = 2;
    int xcoor = 1;
    int ycoor = 4;
    int depth = 4;
    int xcoor2 = 1;
    int ycoor2 = 1;
    int depth2 = 10;
    int[][] lake = {
	{28, 25, 20, 32, 34, 36},
	{27, 25, 20, 20, 30, 34},
	{24, 20, 20, 20, 20, 30},
	{20, 20, 14, 14, 20, 20},  
    };


    /*
    public intAt(String s, int index) {
	int i = Integer.parseInt(s.substring(index, index + 1));
	return i;
    }
    */

    public void stomp() {
	int[] inst1 = new int[9];
	int count = 0;
	for (int i = xcoor; i < xcoor + 2; i++) {
	    for (int j = ycoor; j < ycoor + 2; j++) {
		inst1[count] = lake[i][j];
		count++;
	    }
	}
    }

    public int output() {
	int sum = 0;
	for (int i = 0; i < R; i++) {
	    for (int j = 0; j < C; j++) {
		if (lake[i][j] > 0) {
		    sum = sum + lake[i][j];
		}
	    }
	}
	return sum * 72 * 72;
    }

    public int[][] getLake() {
	return lake;
    }

    public static void main(String[] args) {
	makelake m = new makelake();
	m.stomp();
	System.out.println(m.getLake());
    }

}
