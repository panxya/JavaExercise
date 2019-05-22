package cast05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class textDemo {
	public static void main(String[] args) {
		Frame f =new Frame();
	//边框大小	
		f.setBounds(400, 200, 400, 300);
	//流式布局
		f.setLayout(new FlowLayout());
	//设置框和域
		final TextField tf = new TextField(20);
		final TextArea ta = new TextArea(10,40);
	//设置按钮	
		Button bu=new Button("我是按钮");
	//添加
		f.add(tf);
		f.add(bu);
		f.add(ta);
		
	//关闭
		f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
		});
		
		//按钮添加事件
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String scr_text = tf.getText().trim();
				tf.setText("");
				
				ta.append(scr_text+"\r\n");
				tf.requestFocus();
				
			}
		});
		f.setVisible(true);
	}
}
