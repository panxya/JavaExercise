package cast08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class BarDemo {
	public static void main(String[] args) {
		// 创建
		final Frame f = new Frame("窗体小明");
		final String name = f.getTitle();
		// 设置窗体位置和大小
		f.setBounds(300, 400, 500, 500);
		// 流式布局
		f.setLayout(new FlowLayout());
		// 创建菜单栏
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("更名");
		MenuBar mb = new MenuBar();
		MenuItem mt1 = new MenuItem("打开记事本");
		final MenuItem mt2 = new MenuItem("学习");
		final MenuItem mt3 = new MenuItem("恢复名字");
		MenuItem mt4 = new MenuItem("退出程序");

		// 添加
		m2.add(mt2);
		m2.add(mt3);

		m1.add(m2);
		m1.add(mt1);
		m1.add(mt4);

		mb.add(m1);

		f.setMenuBar(mb);

		// 添加关闭设置
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		mt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f.setTitle(mt2.getLabel());
			}
		});

		mt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f.setTitle(name);
			}
		});

		mt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
