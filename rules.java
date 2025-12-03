import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
public class rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 60);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 38));
        heading.setForeground(Color.BLUE);
        add(heading);
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 400);
        rules.setFont(new Font("Tahoma", Font.BOLD, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "</html>"
);
add(rules);
        back = new JButton("back");
        back.setBounds(50, 500, 120, 30);
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("start");
        start.setBounds(600, 500, 120, 30);
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(300, 150);
        setVisible(true);
    

    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);

        } else {
            setVisible(false);
            new Login();
        }
        

    }
    public static void main(String[] args) {
        new rules("User");
    }
    
}
