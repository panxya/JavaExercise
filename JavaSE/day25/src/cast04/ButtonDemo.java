package cast04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonDemo {
	public static void main(String[] args) {
		//����
		Frame f =new Frame("����С��");
		//���ô���λ�úʹ�С
		f.setBounds(300, 400, 500, 500);
		//��ʽ����
		f.setLayout(new FlowLayout());
		
		//��ӹر�����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//��Ӱ�ť
		
		Button bu = new Button();
//		bu.setSize(30,100);
		f.add(bu);
		
		//��ť�ظ�
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click me.");
			}
		});
		
		f.setVisible(true);
		
	}
}
