package OutputWithoutArr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("b.txt");
		fos.write("There are scenes of all sorts; some dreadful combats,".getBytes());
		
	}
}
