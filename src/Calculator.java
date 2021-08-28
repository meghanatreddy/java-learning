import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
    JTextArea area,area1,area2,area3;
    JTextField tf1, tf2, tfAnswer;
    JButton b1, b2, b3, b4;

    Calculator() {
        JFrame f = new JFrame();
        area = new JTextArea("CALCULATOR");
        area.setBounds(100,20,100,20);
        area.setEditable(false);
        area1 = new JTextArea("number 1:");
        area1.setBounds(40,70,60,20);
        area1.setEditable(false);
        area2 = new JTextArea("number 2:");
        area2.setBounds(150,70,60,20);
        area2.setEditable(false);
        tf1 = new JTextField();
        tf1.setBounds(100, 70, 40, 20);
        tf2 = new JTextField();
        tf2.setBounds(210, 70, 40, 20);
        tfAnswer = new JTextField();
        tfAnswer.setBounds(120, 130, 50, 20);
        tfAnswer.setEditable(false);
        b1 = new JButton("+");
        b1.setBounds(20, 200, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(90, 200, 50, 50);
        b3 = new JButton("*");
        b3.setBounds(160,200,50,50);
        b4 = new JButton("/");
        b4.setBounds(230,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.add(area);
        f.add(area1);
        f.add(area2);
        f.add(tf1);
        f.add(tf2);
        f.add(tfAnswer);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        }
        else if (e.getSource() == b3){
            c = a*b;
        }
        else if (e.getSource() == b4){
            c = a/b;
        }
        String result = String.valueOf(c);
        tfAnswer.setText(result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
