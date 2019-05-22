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
		// 创建
		Frame f = new Frame("窗体小明");
		// 设置窗体位置和大小
		f.setBounds(300, 400, 500, 500);

		// 流式布局
		f.setLayout(new FlowLayout());

		// 添加组件
		Label l = new Label("输入数字");
		f.add(l);
		TextField tf = new TextField(40);
		f.add(tf);

		// 添加关闭设置
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
