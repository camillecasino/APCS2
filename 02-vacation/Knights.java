import java.io.*;
import java.util.*;

public class Knights {

    int px1, px2, px3, px4, py1, py2, py3, py4;
    String pcoor1, pcoor2, pcoor3, pcoor4, pcoor5, pcoor6, pcoor7, pcoor8;

    public Knights(int x, int y) {
        px1 = x + 2;
	px2 = x + 1;
	px3 = x - 3;
	px4 = x - 1;

        py1 = y + 2;
	py2 = y + 1;
	py3 = y - 2;
	py4 = y - 1;

	pcoor1 = px1 + "," + py2;
	pcoor2 = px1 + "," + py4;
	pcoor3 = px2 + "," + py1;
	pcoor4 = px2 + "," + py3;
	pcoor5 = px3 + "," + py2;
	pcoor6 = px3 + "," + py4;
	pcoor7 = px4 + "," + py1;
	pcoor8 = px4 + "," + py3;
    }

    public String getPcoor() {
	return this.pcoor1 + "\n" + this.pcoor2 + "\n" + this.pcoor3 + "\n" + this.pcoor4 + "\n" + this.pcoor5 + "\n" + this.pcoor6 + "\n" + this.pcoor7 + "\n";
    }

    public static void main(String[] args) {
	Knights k = new Knights(3,4);
	System.out.println(k.getPcoor());
    }
}
