package d50_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*有五个学生，
 * 每个学生有3门课的成绩，
 * 从键盘输入以上数据（包括学生号，姓名，三门课成绩），
 * 计算出平均成绩，
 * 将原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
*/
public class StreamTest {
	String[] number = new String[5];
	String[] name = new String[5];
	float[][] grade = new float[5][3];
	float[] sum = new float[5];

	public static void main(String[] args) throws Exception {
		StreamTest st = new StreamTest();
		st.input();
		st.output();

	}

	private void output() throws IOException {
		FileWriter fw = new FileWriter("D:\\Text\\a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("name  "+"No.  "+"Chinese  "+"Math  "+"English  "+"Average");
		bw.newLine();
		for(int i = 0;i<5;i++) {
			bw.write(name[i]);
			bw.write("  "+number[i]);
			for(int j = 0;j<3;j++) {
				bw.write("  "+grade[i][j]);
			}
			bw.write("  "+sum[i]/3);
			bw.newLine();
		}
		bw.close();
	}

	private void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (flag) {
			try {
				for (int i = 0; i < 5; i++) {
					
					System.out.println("请输入姓名");
					name[i] = br.readLine();
					
					System.out.println("请输入学号");
					number[i] = br.readLine();
					for (int j = 0; j < 3; j++) {
						System.out.println("请输入第" + (j + 1) + "门成绩");
						grade[i][j] = Integer.parseInt(br.readLine());
					}
					System.out.println();
					sum[i] = grade[i][0] + grade[i][1] + grade[i][2];
				}
				flag = false;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
