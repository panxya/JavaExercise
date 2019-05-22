package cast07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyButton {
	public static void main(String[] args) {
		// ����
		Frame f = new Frame("����С��");
		// ���ô���λ�úʹ�С
		f.setBounds(300, 400, 500, 500);

		// ��ʽ����
		f.setLayout(new FlowLayout());

		// ������
		Label l = new Label("��������");
		f.add(l);
		TextField tf = new TextField(40);
		f.add(tf);

		// ��ӹر�����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		tf.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				char ch = e.getKeyChar();
				if (!(ch >= '0'&& ch <= '9')) {
					e.consume();
				}
			}
		});

		f.setVisible(true);
	}
}
