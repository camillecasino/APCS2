import java.io.*;
import java.util.*;

public class Board {
    
    String[][] b;
    int maxX;
    int maxY;

    public Board() {
	maxX = 9;
	maxY = 9;

	b = new String[maxX][maxY];
	for (int i = 0; i < maxX; i++) {
	    if (i == 0 || i == 1 || i == 7 || i == 8) {
		for (int j = 0; j < maxY; j++) {
		    b[i][j] = "x";
		}
	    } else {
		for (int j = 0; j < maxY; j++) {
		    if (j == 0 || j == 1 || j == 7 || j == 8) {
			b[i][j] = "x";
		    } else {
			b[i][j] = ".";
		    }
		}
	    }
	}
    }

    public String toString() {
	String s = "";
	for (int i = 0; i < maxX; i++) {
	    for (int j = 0; j < maxY; j++) {
		s = s + b[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	Board bo = new Board();
	String sb = bo.toString();
	System.out.println(sb);
    }
}
