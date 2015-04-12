import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private Queue frontier = new Queue();
    private Node n;

    private char path='#';
    private char wall=' ';
    private char me='c';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
      solved - instance variable to indicate we're done
			
    */
    public void solve(int x, int y){
	frontier.enqueue(board[x][y], x, y);

	while (!frontier.empty()) {
	    Node n = frontier.dequeue();
	    if (n.getData()==exit){
		solved = true;
		System.exit(0);
	    }
	    board[x][y] = me;
	    if (board[x][y] == path || board[x - 1][y] == path ||
	        board[x + 1][y] == path || board[x][y + 1] == path ||
		board[x][y - 1] == path) {
		if (n.getX() - 1 > 0 || n.getX() < maxX ||
		    n.getY() - 1 > 0 || n.getY() < maxY) {
		    frontier.enqueue(board[n.getX() - 1][n.getY()], n.getX() - 1, n.getY());
		    frontier.enqueue(board[n.getX() + 1][n.getY()], n.getX() + 1, n.getY());
		    frontier.enqueue(board[n.getX()][n.getY() - 1], n.getX(), n.getY() - 1);
		    frontier.enqueue(board[n.getX()][n.getY() + 1], n.getX(), n.getY() + 1);
		}
	    }

	    delay(100);
	    if (!solved){
		board[x][y]=visited;
	    }
	    System.out.println(this);
	}
    }
}
