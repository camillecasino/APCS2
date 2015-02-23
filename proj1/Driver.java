import java.io.*;
import java.util.*;

public class Driver {
    
    char[][] b;
    int maxX;
    int maxY;
    char square = '.';
    char visited = 'x';
    boolean done = false;
    
    public Driver() {
	int maxX = 9;
	int maxY = 9;
	b = new char[maxX][maxY];
	for (int i = 0; i < maxX; i++) {
	    if (i == 0 || i == 1 || i == 7 || i == 8) {
		for (int j = 0; j < maxY; j++) {
		    b[i][j] = 'x';
		}
	    } else {
		for (int j = 0; j < maxY; j++) {
		    if (j == 0 || j == 1 || j == 7 || j == 8) {
			b[i][j] = 'x';
		    } else {
			b[i][j] = '.';
		    }
		}
	    }
	}
    }

    public String getBoard() {
	String board = "";
	for (int i = 0; i < maxX; i++) {
	    for (int j = 0; j < maxY; j++) {
		board = board + b[i][j];
	    }
		board = board + "\n";
	}
	return board;
    }

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    //public void tour(int x, int y) {
    //	if
    //}

    /*
    public boolean done(char[][] b) {
	boolean finished = true;
	for (int i = 0; i < 9; i++) {
	    for (int j = 0; j < 9; j++) {
	        if (b[i][j] != 'x') {
		    finished = false;
		}
	    }
	}
	if (!finished) {
	    return;
	} else {
	    delay(150);
	    
    }
    */

    public static void main(String[] args) {
	Driver d = new Driver();
    }

}
