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
		//创建
		Frame f =new Frame("窗体小明");
		//设置窗体位置和大小
		f.setBounds(300, 400, 500, 500);
		//流式布局
		f.setLayout(new FlowLayout());
		
		//添加关闭设置
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//添加按钮
		
		Button bu = new Button();
//		bu.setSize(30,100);
		f.add(bu);
		
		//按钮回复
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
