
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame {

    double result = 0;
    String operator = "";
    double number = 0;
    double number2 = 0;

    public calculator() {

        this.setSize(320, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculator");

        init();
    }

    private void init() {

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new GridLayout(2, 4));
        panel2.setLayout(new GridLayout(6, 4));

        panel2.setSize(320, 500);

        JLabel label = new JLabel("Standard Calculator");
        Font labelFont = new Font("Segoe UI", Font.BOLD, 15);
        label.setFont(labelFont);
        JTextField textField = new JTextField(25);
        textField.setPreferredSize(new Dimension(320, 50));
        Font font = new Font("Arial", Font.PLAIN, 20); // Arial font, plain style, size 20
        textField.setFont(font);

        JButton Button1 = new JButton("CE");
        JButton Button2 = new JButton("C");
        JButton Button3 = new JButton("\u2190");
        JButton Button4 = new JButton("%");
        JButton Button5 = new JButton("1 / x");
        JButton Button6 = new JButton("X \u00B2");
        JButton Button7 = new JButton("\u221A X");
        JButton Button8 = new JButton("/");
        JButton Button9 = new JButton("7");
        JButton Button10 = new JButton("8");
        JButton Button11 = new JButton("9");
        JButton Button12 = new JButton("X");
        JButton Button13 = new JButton("4");
        JButton Button14 = new JButton("5");
        JButton Button15 = new JButton("6");
        JButton Button16 = new JButton("-");
        JButton Button17 = new JButton("1");
        JButton Button18 = new JButton("2");
        JButton Button19 = new JButton("3");
        JButton Button20 = new JButton("+");
        JButton Button21 = new JButton("+");
        JButton Button22 = new JButton("0");
        JButton Button23 = new JButton(".");
        JButton Button24 = new JButton("=");
        Button24.setBackground(Color.blue);

        panel2.add(Button1);
        panel2.add(Button2);
        panel2.add(Button3);
        panel2.add(Button4);
        panel2.add(Button5);
        panel2.add(Button6);
        panel2.add(Button7);
        panel2.add(Button8);
        panel2.add(Button9);
        panel2.add(Button10);
        panel2.add(Button11);
        panel2.add(Button12);
        panel2.add(Button13);
        panel2.add(Button14);
        panel2.add(Button15);
        panel2.add(Button16);
        panel2.add(Button17);
        panel2.add(Button18);
        panel2.add(Button19);
        panel2.add(Button20);
        panel2.add(Button21);
        panel2.add(Button22);
        panel2.add(Button23);
        panel2.add(Button24);

        panel.add(label);
        panel.add(textField);

        getContentPane().add(panel2, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.NORTH);

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
            }
        });

        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "%";
                textField.setText(textField.getText() + "%");
            }
        });

        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "1 /";
                textField.setText("1 / " + textField.getText());
            }
        });

        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "*2";
                textField.setText(textField.getText() + "\u00B2");
            }
        });

        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "√";
                textField.setText("√" + textField.getText());
            }
        });

        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "/";
                textField.setText("");
            }
        });

        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 7);
            }
        });

        Button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 8);
            }
        });

        Button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 9);
            }
        });

        Button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "*";
                textField.setText("");
            }
        });

        Button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 4);
            }
        });

        Button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 5);
            }
        });

        Button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 6);
            }
        });

        Button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "-";
                textField.setText("");
            }
        });

        Button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 1);
            }
        });

        Button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 2);
            }
        });

        Button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 3);
            }
        });

        Button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField.getText());
                operator = "+";
                textField.setText("");
            }
        });

        Button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "-");
            }
        });

        Button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + 0);
            }
        });

        Button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ".");
            }
        });

        Button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator == "+") {

                    number2 = Double.parseDouble(textField.getText());
                    result = number + number2;
                    textField.setText(String.valueOf(result));

                } else if (operator == "-") {

                    number2 = Double.parseDouble(textField.getText());
                    result = number - number2;
                    textField.setText(String.valueOf(result));

                } else if (operator == "*") {

                    number2 = Double.parseDouble(textField.getText());
                    result = number * number2;
                    textField.setText(String.valueOf(result));

                } else if (operator == "/") {

                    number2 = Double.parseDouble(textField.getText());
                    result = number / number2;
                    textField.setText(String.valueOf(result));

                } else if (operator == "√") {

                    result = (Math.sqrt(number));
                    textField.setText(String.valueOf(result));

                } else if (operator == "1 /") {

                    result = 1 / number;
                    textField.setText(String.valueOf(result));

                } else if (operator == "%") {

                    result = (number / 100) * 100;
                    textField.setText(String.valueOf(result + "%"));

                } else if (operator == "*2") {

                    result = number * number;
                    textField.setText(String.valueOf(result));

                }
            }
        });

    }

    public static void main(String[] args) {

        FlatLightLaf.setup();
        new calculator().setVisible(true);

    }

}
