package CharCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyDemo {
	public static void main(String[] args) throws IOException {

		// 开始并计时
		long start = System.currentTimeMillis();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\book\\中英对照\\《名利场.txt"));
		OutputStreamWriter ops = new OutputStreamWriter(new FileOutputStream("名利场.txt"));

		// 遍历复制
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			ops.write(chs, 0, len);
		}

		// 关闭缓冲流
		isr.close();
		ops.close();

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
