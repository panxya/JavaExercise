package ArrayListCopy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrCopyDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("3.txt"));
		
		array.add("Ã÷Ã÷ÃüÃûÃúÃú");
		array.add("dffff");
		
		
		for(String s : array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
	bw.close();
	}
}
