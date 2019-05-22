package CharCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyDemo {
	public static void main(String[] args) throws IOException {

		// ��ʼ����ʱ
		long start = System.currentTimeMillis();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\book\\��Ӣ����\\��������.txt"));
		OutputStreamWriter ops = new OutputStreamWriter(new FileOutputStream("������.txt"));

		// ��������
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			ops.write(chs, 0, len);
		}

		// �رջ�����
		isr.close();
		ops.close();

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
