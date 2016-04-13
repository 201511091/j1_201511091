import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener {
	
	float result = 0;
	float raw_number = 0;
	int dotcount = 0;
	String operator;
	
	String buttonNames[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
			"+", "-", "*", "/", "=", "AC", "."};
	Button bt[] = new Button[buttonNames.length];

	String panelNames[] = {"Top", "Upper Middle", "Lower Middle", "Bottom"};
	Panel pn[] = new Panel[panelNames.length];

	TextField tf_result;
	TextField tf_operation;
	String display_result = "";
	String display_operation = "";
	
	public CalculatorBody() {	
		tf_result = new TextField(display_result, 20);
		tf_operation = new TextField(display_operation, 20);

		for (int i = 0; i < pn.length; i++)
			pn[i] = new Panel();

		for (int i = 0; i < panelNames.length; i++)
			add(panelNames[i], pn[i]);

		for (int i = 0; i < buttonNames.length; i++)
			bt[i] = new Button(buttonNames[i]);

		pn[0].add(tf_result);
		pn[3].add(tf_operation);

		pn[1].setLayout(new GridLayout(4, 3));
		pn[2].setLayout(new GridLayout(4, 3));

		tf_result.setEditable(false);
		tf_operation.setEditable(false);

		for (int i = 0; i < 10; i++) {
			pn[1].add(bt[i]);
			bt[i].addActionListener(this);
		}

		for (int i = 10; i < bt.length; i++) {
			pn[2].add(bt[i]);
			bt[i].addActionListener(this);
		}
	}
	
	public float add(float x, float y) {return x + y;}
	public float subtract(float x, float y) {return x - y;}
	public float multiply(float x, float y) {return x * y;}
	public float divide(float x, float y) {
		if (y != 0) 
			return x / y;
		else
			return -1;
	}
	
	public void update(String s) {
		display_result += s;
		display_operation += s;
		display();
	}
	
	public void display() {
		tf_result.setText(display_result);
		tf_operation.setText(display_operation);
	}
	
	public void operatorAction(String s) {
		operator = s;

		display_operation += s;

		display();

		raw_number = Float.parseFloat(display_result);

		if (result != 0) {	
			if (s == "+")
				result = add(result, raw_number);
			else if (s == "-")
				result = subtract(result, raw_number);
			else if (s == "*")
				result = multiply(result, raw_number);
			else if (s == "/")
				result = divide(result, raw_number);
		} else {
			result = raw_number;
		}

		display_result = "";
	}
	 
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(bt[0]))
			update(buttonNames[0]);
		else if (e.getSource().equals(bt[1])) 
			update(buttonNames[1]);
		else if (e.getSource().equals(bt[2])) 
			update(buttonNames[2]);
		else if (e.getSource().equals(bt[3])) 
			update(buttonNames[3]);
		else if (e.getSource().equals(bt[4])) 
			update(buttonNames[4]);
		else if (e.getSource().equals(bt[5])) 
			update(buttonNames[5]);
		else if (e.getSource().equals(bt[6])) 
			update(buttonNames[6]);
		else if (e.getSource().equals(bt[7])) 
			update(buttonNames[7]);
		else if (e.getSource().equals(bt[8])) 
			update(buttonNames[8]);
		else if (e.getSource().equals(bt[9])) 
			update(buttonNames[9]);
		else if (e.getSource().equals(bt[16])) {
			if(dotcount == 0){
				dotcount++;
				display_result += ".";
		        display_operation += ".";
		        display();
		      }
		}
		else if (!display_result.equals("")) {
			dotcount = 0;
			if (e.getSource().equals(bt[10]))
				operatorAction("+");
			else if (e.getSource().equals(bt[11]))
				operatorAction("-");
			else if (e.getSource().equals(bt[12]))
				operatorAction("*");
			else if (e.getSource().equals(bt[13]))
				operatorAction("/");
			else if (e.getSource().equals(bt[14])) {
				display_result = Float.toString(result);
			    display_operation = "";
			    display();
			}	
			else if (e.getSource().equals(bt[15])) {
				display_result = "";
				display_operation = "";
				result = 0;
				raw_number = 0;
				operator = "";
				display();
			}
		}
	}
}