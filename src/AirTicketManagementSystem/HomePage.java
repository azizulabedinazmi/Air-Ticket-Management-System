package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HomePage {

    JFrame F = new JFrame("Welcome Page");
    JLabel LImg;
    Icon img;

    JLabel LTitle = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"7\">WELCOME TO</font></b></html>");
    JLabel LTitle2 = new JLabel(
            "<html><b><font color=\"#0CD5D2\",size=\"11\"><i>Airline MANAGEMENT SYSTEM</i></font></b></html>");
    JButton NextButton = new JButton("NEXT");

    public HomePage() {

        F.getContentPane().setBackground(Color.BLACK);

        img = new ImageIcon("img\\welcome.gif");
        LImg = new JLabel(img);
        LImg.setBounds(1, 370, 850, 600);

        F.add(LImg);

        LTitle.setBounds(320, 230, 700, 100);
        LTitle2.setBounds(150, 300, 700, 100);
        NextButton.setBounds(350, 500, 100, 30);

        F.add(LTitle);
        F.add(LTitle2);
        F.add(NextButton);

        F.setLocationRelativeTo(null);

        F.setBackground(Color.BLACK);

        NextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPortal();
                F.setVisible(false);

            }
        });

        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
