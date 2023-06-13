package multi;

import java.awt.Font;
import java.awt.Graphics;

public class Banner extends Frame implements Runnable {
	String str="Center for Good Governance";

	public Banner()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	
	public void paint(Graphics g)
	{
		Font font=new Font("Courier",Font.BOLD,40);
		g.setFont(font);
		g.drawString(str, 100, 100);
	}
	
	public void run()
	{
		for(;;)
		{
			repaint();
			try {
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			char ch=str.charAt(0);
			str=str.substring(1,str.length());
			str=str+ch;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banner b=new Banner();
		b.setSize(700,700);
		b.setTitle("My Banner");
		b.setVisible(true);
		b.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Thread t=new Thread(b);
		t.start();
	}

}
