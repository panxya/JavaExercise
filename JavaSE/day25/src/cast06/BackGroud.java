package cast06;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BackGroud {
	public static void main(String[] args) {
		final Frame f = new Frame("Ã÷Ã÷");
		f.setBounds(300,400,400,200);
		
		f.setLayout(new FlowLayout());
		
		Button b = new Button("black");
		f.add(b);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		
		
		b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.black);
			}
		
		});
		
		b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.WHITE);
			}
		
		});
		
		
		f.setVisible(true);
		
	}
}
