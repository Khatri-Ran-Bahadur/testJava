package mini_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JPanel implements ActionListener{
	
	private JTextField display=new JTextField("0");
	private double result=0;
	private String operator="=";
	private boolean calculating=true;
	
	public Calculator() {
		setLayout(new BorderLayout());
		display.setEditable(true);
		display.setPreferredSize(new Dimension(70,70));
		
		add(display,"North");		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(4,4));
		
		String buttonlabels="789/456*123-0.=+";
		for(int i=0; i<buttonlabels.length(); i++) {
			JButton b=new JButton(buttonlabels.substring(i, i+1));
			panel.add(b);
			b.addActionListener(this);
		}
		
		add(panel,"Center");
	}
	
	public static void main(String args[]) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
		frame.setTitle("AMC Calculator");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.out.println(0);
			}
		});
		
		Container contentpane=frame.getContentPane();
		Calculator ct=new Calculator();
		contentpane.add(ct);
		
		frame.show();
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}
