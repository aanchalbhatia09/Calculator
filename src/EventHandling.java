import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling implements ActionListener{
	CalcStructure obj;
	double a,b,res=0;
	String operator;
	
	//public EventHandling(){};
	
	public EventHandling(CalcStructure obj)
	{
		this.obj = obj;
	}

	public void actionPerformed(ActionEvent evt) {
		String s=obj.textField.getText();
		if(evt.getSource() == obj.button[15])
		{
			b = Double.parseDouble(s);
			calculate();
			//char c = operator.charAt(0);
			obj.textField.setText(Double.toString(res));
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				if(evt.getSource() == obj.button[i])
				{
					String s1 = obj.button[i].getText();
					obj.textField.setText(s+s1);
				}
			}
			for(int i=4;i<7;i++)
			{
				if(evt.getSource() == obj.button[i])
				{
					String s1 = obj.button[i].getText();
					obj.textField.setText(s+s1);
				}
			}
			for(int i=8;i<11;i++)
			{
				if(evt.getSource() == obj.button[i])
				{
					String s1 = obj.button[i].getText();
					obj.textField.setText(s+s1);
				}
			}
			if(evt.getSource() == obj.button[13])
			{
				String s1 = obj.button[13].getText();
				obj.textField.setText(s+s1);
			}
			else if(evt.getSource() == obj.button[3])
			{
				a = Double.parseDouble(s);
				obj.textField.setText("");
				operator = obj.button[3].getText();
			}
			else if(evt.getSource() == obj.button[7])
			{
				a = Double.parseDouble(s);
				obj.textField.setText("");
				operator = obj.button[7].getText();
			}
			else if(evt.getSource() == obj.button[11])
			{
				a = Double.parseDouble(s);
				obj.textField.setText("");
				operator = obj.button[11].getText();
			}
			else if(evt.getSource() == obj.button[12])
			{
				a = Double.parseDouble(s);
				obj.textField.setText("");
				operator = obj.button[12].getText();
			}
			else if(evt.getSource()==obj.button[14])
			{
				a = Double.parseDouble(s);
				obj.textField.setText("");
				operator = obj.button[14].getText();
			}
			else if(evt.getSource()==obj.button[16])
			{
				a = Double.parseDouble(s);
				obj.textField.setText("");
				operator = obj.button[16].getText();
			}
			else if(evt.getSource()==obj.button[17])
			{
				obj.textField.setText(s+".");
				//operator = button[17].getText();
			}
			else if(evt.getSource()==obj.button[19])
			{
				a=0;b=0;
				obj.textField.setText("");
			}
			else if(evt.getSource()==obj.button[18])
			{
				String s1=obj.textField.getText();
				String s2 = s1.substring(0,s1.length()-1);
				obj.textField.setText(s2);
			}
		}
	}
	
	public void calculate()
	{
		char c = operator.charAt(0);
		//System.out.println(a + " "+ b);
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
