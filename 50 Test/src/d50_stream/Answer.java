package d50_stream;

import java.io.*;

public class Answer {

	// ����ѧ��ģ��
	String[] number = new String[5];
	String[] name = new String[5];
	float[][] grade = new float[5][3];
	float[] sum = new float[5];

	public static void main(String[] args) throws Exception {
		Answer stud = new Answer();
		stud.input();
		stud.output();
	}

	// ����ѧ�š��������ɼ�
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ¼��״̬��ʶ
		boolean isRecord = true;
		while (isRecord) {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.print("������ѧ�ţ�");
					number[i] = br.readLine();
					System.out.print("������������");
					name[i] = br.readLine();
					for (int j = 0; j < 3; j++) {
						System.out.print("�������" + (j + 1) + "�ſγɼ���");
						grade[i][j] = Integer.parseInt(br.readLine());
					}
					System.out.println();
					sum[i] = grade[i][0] + grade[i][1] + grade[i][2];
				}
				isRecord = false;
			} catch (NumberFormatException e) {
				System.out.println("������һ�����֣�");
			}
		}
	}

	// ����ļ�
	void output() throws IOException {
		FileWriter fw = new FileWriter("E://java50//stud.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("No.  " + "Name  " + "grade1  " + "grade2  " + "grade3  " + "average");
		bw.newLine();
		for (int i = 0; i < 5; i++) {
			bw.write(number[i]);
			bw.write("  " + name[i]);
			for (int j = 0; j < 3; j++)
				bw.write("  " + grade[i][j]);
			bw.write("  " + (sum[i] / 5));
			bw.newLine();
		}
		bw.close();
	}

}
