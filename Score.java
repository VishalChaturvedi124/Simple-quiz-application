import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    Score(String name, int score){
        setBounds(400, 150, 750, 550
        );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("result.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 250, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(100, 200, 300, 150);
        add(image);
        
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Mind");
        heading.setBounds(70, 30, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
       

        JLabel lblscore = new JLabel("Your score is- "+score);
        lblscore.setBounds(310, 200, 300, 30);
       lblscore.setFont(new Font("Tahoma", Font.BOLD, 28));
       lblscore.setForeground(Color.RED);
        add(lblscore);
    

        JButton submit = new JButton("Play Again");
        submit.setBounds(360, 270, 120, 40);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);


        setVisible(true);



    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();

    }
    public static void main(String[] args) {
        new Score("user", 0);
        

    }
    
}
