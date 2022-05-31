package unit_4;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Sample {

	public static void main(String[] args) {

		SampleWorkSwing obj = new SampleWorkSwing();

	}

}

class SampleWorkSwing extends JFrame {

	JTextField t1;
	JTextField t2;
	
	JTextArea jr1;

	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;

	JLabel l1;

	SampleWorkSwing() {

		jr1 = new JTextArea(10,30);
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("sum");
		b2 = new JButton("Sub");
		b3= new JButton("multiply");
		b4= new JButton("devide");
		l1 = new JLabel("Result");

		add(jr1);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());
				
				String str = jr1.getText();
				
				if(e.getSource() == b1) {
					Integer sum = a1 + a2;
					l1.setText(sum.toString());
				}
				
				if(e.getSource() == b2) {
					Integer sub = a1 - a2;
					l1.setText(sub.toString());
				}
				if(e.getSource() == b3) {
					Integer multiply = a1*a2;
					l1.setText(multiply.toString());
				}
				if(e.getSource() == b4) {
					Float devide = (float) (a1/a2);
					l1.setText(devide.toString());
				}
				

			}
//			public void actionPerformed1(ActionEvent e1) {
//
//				int a1 = Integer.parseInt(t1.getText());
//				int a2 = Integer.parseInt(t2.getText());
//				
//				String str = jr1.getText();
//				//e1.getSource() == b4;
//				float devide = a1/a2;
//				AbstractButton al1;
//				al1.setText(devide.toString());
//			}
		};
		

		// Logic on b1 and b2
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}