import java.io.*;
import java.util.*;

public class Driver {
    
    int[][] b;
    int maxX;
    int maxY;
    int square = 0;
    int visited = -1;
    boolean done = false;
    
    public Driver() {
	int maxX = 9;
	int maxY = 9;
	b = new int[maxX][maxY];
	for (int i = 0; i < maxX; i++) {
	    if (i == 0 || i == 1 || i == 7 || i == 8) {
		for (int j = 0; j < maxY; j++) {
		    b[i][j] = 0;
		}
	    } else {
		for (int j = 0; j < maxY; j++) {
		    if (j == 0 || j == 1 || j == 7 || j == 8) {
			b[i][j] = 0;
		    } else {
			b[i][j] = -1;
		    }
		}
	    }
	}
    }

    public String getBoard() {
	String board = "[2J\n";
	for (int i = 0; i < maxX; i++) {
	    for (int j = 0; j < maxY; j++) {
		board = board + String.format(" %2d", b[i][j]);
	    }
		board = board + "\n\n";
	}
	return board;
    }

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public void tour(int x, int y) {
    	for (int i = 0; i < b.length; i++) {
	    for (int j = 0; i < b[i].length; j++) {
		tour(i, j, 1);
	    }
	}
    }

    public void tour(int x, int y, int c) {
	if (done || b[x][y] != square) {
	    return;
	} else if (c == maxX * maxY) {
	    b[x][y] = visited;
	}

	b[x][y] = visited;

	tour(x+2, y+1, c+1);
    }
	

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
	String dr = d.getBoard();
	System.out.println(dr);
    }

}
