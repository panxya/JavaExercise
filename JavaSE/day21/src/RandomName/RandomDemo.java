package RandomName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> arr = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("4.txt"));
		
		String s = null;
		while((s = br.readLine())!=null) {
			arr.add(s);
		}
		
		
		Random r =new Random();
		int index = r.nextInt(arr.size());
		String name = arr.get(index);
		
		System.out.println("It's"+name);
		
	}
}
