import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fromweb extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0;
    private String operator = "";

    public fromweb() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("0123456789".contains(cmd)) {
            display.setText(display.getText() + cmd);
        } else if ("/*-+".contains(cmd)) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            display.setText("");
        } else if ("=".equals(cmd)) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": display.setText(String.valueOf(num1 + num2)); break;
                case "-": display.setText(String.valueOf(num1 - num2)); break;
                case "*": display.setText(String.valueOf(num1 * num2)); break;
                case "/": 
                    if (num2 == 0) {
                        display.setText("Error");
                    } else {
                        display.setText(String.valueOf(num1 / num2));
                    }
                    break;
            }
        } else if ("C".equals(cmd)) {
            display.setText("");
            num1 = num2 = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new fromweb();
    }
}