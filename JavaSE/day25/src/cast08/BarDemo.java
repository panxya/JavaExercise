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
		// ����
		final Frame f = new Frame("����С��");
		final String name = f.getTitle();
		// ���ô���λ�úʹ�С
		f.setBounds(300, 400, 500, 500);
		// ��ʽ����
		f.setLayout(new FlowLayout());
		// �����˵���
		Menu m1 = new Menu("�ļ�");
		Menu m2 = new Menu("����");
		MenuBar mb = new MenuBar();
		MenuItem mt1 = new MenuItem("�򿪼��±�");
		final MenuItem mt2 = new MenuItem("ѧϰ");
		final MenuItem mt3 = new MenuItem("�ָ�����");
		MenuItem mt4 = new MenuItem("�˳�����");

		// ���
		m2.add(mt2);
		m2.add(mt3);

		m1.add(m2);
		m1.add(mt1);
		m1.add(mt4);

		mb.add(m1);

		f.setMenuBar(mb);

		// ��ӹر�����
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
