import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz.jpg.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 700, 500);
        add(image);
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(800, 60, 300, 70);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 38));
        heading.setForeground(Color.BLUE);
        add(heading);
        JLabel name = new JLabel("Enter your name");
        name.setBounds(850, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(Color.BLACK);
        add(name);
        tfname = new JTextField();
        tfname.setBounds(775, 200, 300, 30);
        tfname.setFont(new Font("Timos New Roman", Font.BOLD, 20));
        add(tfname);
        rules = new JButton("Rules");
        rules.setBounds(775, 270, 120, 25);
        rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        back = new JButton("Back");
        back.setBounds(957, 270, 120, 25);
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new rules(name);

    } else if(ae.getSource() == back){
        setVisible(false);

    }


    }
    public static void main(String[] args){
        new Login();
    }
    
}
