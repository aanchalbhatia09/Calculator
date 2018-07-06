import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.lang.Math;

public class CalcStructure implements ActionListener{
	JFrame frame;
	JPanel panel,textPanel, buttonPanel;
	JButton button[];
	JTextField textField;
	int d;
	double a,b,res=0;
	String operator;

	public static void main(String ar[])
	{
		new CalcStructure();
	}
	
	public CalcStructure()
	{
		frame = new JFrame("Calculator");
		panel = new JPanel();
		textPanel = new JPanel();
		textField = new JTextField(10);
		button = new JButton[20];
		buttonPanel = new JPanel();
		
		frame.add(panel);
		panel.add(textPanel);
		panel.add(buttonPanel);
		
		Dimension frameSize = new Dimension(300,400);
		frame.setSize(frameSize);

		panel.setLayout(null);
		
		textPanel.setBackground(Color.white);
		Dimension textPanelSize = new Dimension(frameSize.width-15,
				frameSize.height/5);
		textPanel.setBounds(5,5,textPanelSize.width,textPanelSize.height);
		textPanel.setLayout(null);
		textPanel.add(textField);
		textField.setBounds(0,0,textPanelSize.width,textPanelSize.height);
		Border border = BorderFactory.createLineBorder(new Color(136,14,79),2);
		textField.setBorder(border);
		textField.setFont(new Font("Courier New",Font.BOLD,
				textPanelSize.height-20));
		
		buttonPanel.setBounds(5,textPanelSize.height+10,frameSize.width-15,
				frameSize.height-textPanelSize.height-42);
		buttonPanel.setLayout(new GridLayout(5,4));
		
		for(d=0;d<20;d++)
		{
			button[d] = new JButton();
			buttonPanel.add(button[d]);
			button[d].setFont(new Font("Courier New",Font.BOLD,20));
			button[d].setForeground(Color.BLACK);
			button[d].setFocusable(false);
			button[d].setBackground(new Color(234,128,252));
			Border border1 = BorderFactory.createLineBorder(new Color(136,14,79));
			button[d].setBorder(border1);
			button[d].addActionListener(this);
		}
		button[0].setText("9");
		button[1].setText("8");
		button[2].setText("7");
		button[3].setText("+");
		button[4].setText("6");
		button[5].setText("5");
		button[6].setText("4");
		button[7].setText("-");
		button[8].setText("3");
		button[9].setText("2");
		button[10].setText("1");
		button[11].setText("/");
		button[12].setText("*");
		button[13].setText("0");
		button[14].setText("%");
		button[15].setText("=");
		button[15].setBackground(new Color(213,0,249));
		button[15].setForeground(Color.WHITE);
		button[16].setText("^");
		button[17].setText(".");
		button[18].setText("<-");
		button[18].setBackground(new Color(213,0,249));
		button[18].setForeground(Color.WHITE);
		button[19].setText("C");
		button[19].setBackground(new Color(213,0,249));
		button[19].setForeground(Color.WHITE);
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evt) {
		String s=textField.getText();
		if(evt.getSource() == button[15])
		{
			b = Double.parseDouble(s);
			calculate();
			textField.setText(Double.toString(res));
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				if(evt.getSource() == button[i])
				{
					String s1 = button[i].getText();
					textField.setText(s+s1);
				}
			}
			for(int i=4;i<7;i++)
			{
				if(evt.getSource() == button[i])
				{
					String s1 = button[i].getText();
					textField.setText(s+s1);
				}
			}
			for(int i=8;i<11;i++)
			{
				if(evt.getSource() == button[i])
				{
					String s1 = button[i].getText();
					textField.setText(s+s1);
				}
			}
			if(evt.getSource() == button[13])
			{
				String s1 = button[13].getText();
				textField.setText(s+s1);
			}
			else if(evt.getSource()==button[3])
			{
				a = Double.parseDouble(s);
				textField.setText("");
				operator = button[3].getText();
			}
			else if(evt.getSource()==button[7])
			{
				a = Double.parseDouble(s);
				textField.setText("");
				operator = button[7].getText();
			}
			else if(evt.getSource()==button[11])
			{
				a = Double.parseDouble(s);
				textField.setText("");
				operator = button[11].getText();
			}
			else if(evt.getSource()==button[12])
			{
				a = Double.parseDouble(s);
				textField.setText("");
				operator = button[12].getText();
			}
			else if(evt.getSource()==button[14])
			{
				a = Double.parseDouble(s);
				textField.setText("");
				operator = button[14].getText();
			}
			else if(evt.getSource()==button[16])
			{
				a = Double.parseDouble(s);
				textField.setText("");
				operator = button[16].getText();
			}
			else if(evt.getSource()==button[17])
			{
				textField.setText(s+".");
				//operator = button[17].getText();
			}
			else if(evt.getSource()==button[19])
			{
				a=0;b=0;
				textField.setText("");
			}
			else if(evt.getSource()==button[18])
			{
				String s1=textField.getText();
				String s2 = s1.substring(0,s1.length()-1);
				textField.setText(s2);
			}
		}
	}
	
	public void calculate()
	{
		char c = operator.charAt(0);
		switch(c)
		{
		case '+':
			res = a+b; break;
		case '-':
			res = a-b; break;
		case '*':
			res = a*b; break;
		case '/':
			res = a/b; break;
		case '%':
			res = a%b; break;
		case '^':
			res = Math.pow(a, b);
		}
	}
	
}
