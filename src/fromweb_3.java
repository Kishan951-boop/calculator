// creating a simple GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.Math;

public class fromweb_3 extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JLabel text;
    private JButton button;
    public static void main (String[] args) throws Exception {
        EventQueue.invokeLater(() -> {
            fromweb_3 calc = new fromweb_3();
            calc.setVisible(true); // opens up a new window of the app
        });
    }

    public fromweb_3() {
        setTitle("LiAn's Calculator");
        setSize(350,300);
        setLocationRelativeTo(null); // centers window on the screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4,5,5));
        String[] buttons = {"7", "8", "9", "/", "4","5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+","√","Clear"};
        ArrayList<JButton> buttonList = new ArrayList<JButton>();

        // creating number buttons labelled from an array of strings
        for (String s : buttons) {
            button = new JButton(s);
            buttonList.add(button);
            buttonPanel.add(button);
        }

        // adding ActionListener for each of the created buttons, with special cases
        int i = 0;

        for (JButton b : buttonList){
            if (i != 14 && i != 17){
                b.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        text.setText(text.getText() + b.getText());
                    }
                });
                i++;
            } else if (i == 14) {
                b.addActionListener(new ActionListener(){ // EQUALS BUTTON
                    @Override
                    public void actionPerformed(ActionEvent e){
                        text.setText(calculate((text.getText()).replaceAll("\\s+","")));
                    }
                });
                i++;
            } else if (i == 17) { // CLEAR BUTTON
                b.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        text.setText(" ");
                    }
                });
                i++;
            }
        }

        add(mainPanel);

        text = new JLabel(" ", SwingConstants.CENTER);
        text.setFont(new Font("Sans-serif", Font.BOLD, 20));
        text.setBounds(0, 0, 0, 20); // sets coordinates on the app (x, y, width, height)
        mainPanel.add(text, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
    }

    public static String calculate(String equation){
        char[] arr = equation.toCharArray();
        String a = "";
        String b = "";
        String op = "";
        double result =  0;

        if (arr[0] == '-'){
            a += arr[0];
            for (int i = 1; i < arr.length; i++){
                char c = arr[i];
                if(c >= '0' && c <= '9' || c =='.'){
                    if (op.isEmpty()){
                        a += c;
                    } else {
                        b += c;
                    }
                }
    
                if (c == '+' || c == '-' || c == '*' || c == '/' || c == '√'){
                    op += c;
                }
            }
        } else {
            for (char c : arr){
                if(c >= '0' && c <= '9' || c =='.'){
                    if (op.isEmpty()){
                        a += c;
                    } else {
                        b += c;
                    }
                }
    
                if (c == '+' || c == '-' || c == '*' || c == '/' || c == '√'){
                    op += c;
                }
                
            }
        }

        if (op.equals("+")){
            result = (Double.parseDouble(a) + Double.parseDouble(b));
        } else if (op.equals("-")){
            result = (Double.parseDouble(a) - Double.parseDouble(b));
        } else if (op.equals("*")){
            result = (Double.parseDouble(a) * Double.parseDouble(b));
        } else if (op.equals("/")){
            result = (Double.parseDouble(a) / Double.parseDouble(b));
        } else if (op.equals("√")){
            result = (Math.sqrt(Double.parseDouble(a)));
        }

        return String.valueOf(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}