
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fromweb_2 extends JFrame implements ActionListener {
	
	JTextField textField = new JTextField();
	int num1 = 0;
	int num2 = 0;
	String operator = "";

	public fromweb_2() {		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		this.setTitle("Calculator");
		
		String[] labels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
		
		for (int i = 0; i < 16; i++) {
			JButton numButton = new JButton();
			numButton.setText(labels[i]);
			panel.add(numButton);
			numButton.addActionListener(this);
		}
		getContentPane().add(panel, BorderLayout.CENTER);
		
		getContentPane().add(textField, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		fromweb_2 calculator = new fromweb_2();
		calculator.setSize(300, 300);
		calculator.setVisible(true);
		calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();

		if (textField.getText().equals("Can\'t divide by zero!") || textField.getText().equals("Error!")) {
			textField.setText("");
		}
		
		switch (button) {
			case "0": case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9":
				textField.setText(textField.getText() + button);
				break;
			case "/":
				num1 = Integer.parseInt(textField.getText());
				operator = "/";
				textField.setText("");
				break;
			case "*":
				num1 = Integer.parseInt(textField.getText());
				operator = "*";
				textField.setText("");
				break;
			case "-":
				num1 = Integer.parseInt(textField.getText());
				operator = "-";
				textField.setText("");
				break;
			case "+":
				num1 = Integer.parseInt(textField.getText());
				operator = "+";
				textField.setText("");
				break;
			case "=":
				if (!textField.getText().isEmpty()) {
					num2 = Integer.parseInt(textField.getText());
				}
				switch (operator) {
					case "/":
						if (num2 != 0) {
							textField.setText(Integer.toString(num1 / num2));
						} else {
							textField.setText("Can\'t divide by zero!");
						}
						break;
					case "*":
						textField.setText(Integer.toString(num1 * num2));
						break;
					case "-":
						textField.setText(Integer.toString(num1 - num2));
						break;
					case "+":
						textField.setText(Integer.toString(num1 + num2));
						break;
					case "":
						textField.setText("Error!");
						break;
				}
				break;
			case "C":
				textField.setText("");
				num1 = 0;
				num2 = 0;
				operator = "";
				break;
		}
	}

}