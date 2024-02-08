package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginPortal {

    JFrame F = new JFrame("Login Portal");
    JLabel LImg;
    Icon img;

    JLabel LTitle = new JLabel(
            "<html><b><font color=\"#0CD5D2\",size=\"4\">Please select the \"admin\" section if you are an administrator otherwise,select the \"user\" section.</font></b></html>");
    JLabel LTitle2 = new JLabel(
            "<html><b><font color=\"#0CD5D2\",size=\"6\">SIGN IN TO YOUR ACCOUNT</font></b></html>");
    JButton AdminButton = new JButton("ADMIN LOGIN");
    JButton UserButton = new JButton("USER LOGIN");

    public LoginPortal() {

        F.getContentPane().setBackground(Color.BLACK);

        img = new ImageIcon("img\\portalimg.gif");
        LImg = new JLabel(img);
        LImg.setBounds(5, 370, 880, 700);
        F.add(LImg);

        LTitle.setBounds(100, 250, 700, 100);
        LTitle2.setBounds(250, 370, 700, 100);
        AdminButton.setBounds(150, 500, 120, 30);
        UserButton.setBounds(550, 500, 120, 30);

        F.add(AdminButton);
        F.add(UserButton);
        F.setSize(400, 400);
        F.setLayout(null);
        F.setVisible(true);

        F.add(LTitle);
        F.add(LTitle2);

        F.setLocationRelativeTo(null);
        F.setBackground(Color.BLACK);

        AdminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginAdmin();
                F.setVisible(false);
            }
        });

        UserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginUser();
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
