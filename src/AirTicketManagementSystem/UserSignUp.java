package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class UserSignUp {

    JFrame F = new JFrame("User SignUp");
    JLabel LImg;
    Icon img;

    JLabel LTitle3 = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">CREATE NEW ACCOUNT</font></b></html>");

    JLabel userLabel = new JLabel("USERNAME");
    JTextField userTextField = new JTextField();

    JLabel passwordLabel = new JLabel("PASSWORD");
    JPasswordField passwordField = new JPasswordField();

    JLabel apasswordLabel = new JLabel("AGAIN PASSWORD");
    JPasswordField apasswordField = new JPasswordField();

    JButton signUpButton = new JButton("SIGNUP");
    JButton resetButton = new JButton("RESET");

    public UserSignUp() {

        F.getContentPane().setBackground(Color.BLACK);

        img = new ImageIcon("img\\signup.png");
        LImg = new JLabel(img);

        userLabel.setBounds(250, 250, 100, 30);
        userLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(250, 320, 100, 30);
        passwordLabel.setForeground(Color.WHITE);
        apasswordLabel.setBounds(250, 400, 150, 30);
        userTextField.setBounds(400, 250, 150, 30);
        passwordField.setBounds(400, 320, 150, 30);
        apasswordField.setBounds(400, 400, 150, 30);
        signUpButton.setBounds(300, 500, 100, 30);
        resetButton.setBounds(450, 500, 100, 30);
        LImg.setBounds(5, 370, 880, 700);
        LTitle3.setBounds(290, 100, 700, 100);

        F.add(userLabel);
        F.add(passwordLabel);
        F.add(apasswordLabel);
        F.add(userTextField);
        F.add(passwordField);
        F.add(apasswordField);
        F.add(signUpButton);
        F.add(resetButton);
        F.add(LImg);
        F.add(LTitle3);

        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String user, password;
                    user = userTextField.getText();
                    password = passwordField.getText();
                    File FI = new File("file\\UserPassword.txt");
                    BufferedWriter BF = new BufferedWriter(new FileWriter(FI, true));
                    BF.write(user + " " + password + "\n");
                    JOptionPane.showMessageDialog(null, "SignUp Sucessfully !");
                    BF.close();

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                new LoginUser();
                F.setVisible(false);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coding Part of RESET button
                if (e.getSource() == resetButton) {
                    userTextField.setText("");
                    passwordField.setText("");
                    apasswordField.setText("");
                }
            }
        });
    }
}
