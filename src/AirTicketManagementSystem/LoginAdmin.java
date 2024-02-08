package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class LoginAdmin {

    JFrame F = new JFrame("Admin Login");
    JLabel LImg;
    Icon img;

    JLabel LTitle3 = new JLabel(
            "<html><b><font color=\"#0CD5D2\",size=\"6\">SIGN IN TO YOUR ADMIN ACCOUNT</font></b></html>");

    JLabel userLabel = new JLabel("<html><font color=\"#0CD5D2\",size=\"4\">USERNAME</font></html>");
    JTextField userTextField = new JTextField();

    JLabel passwordLabel = new JLabel("<html><font color=\"#0CD5D2\",size=\"4\">PASSWORD</font></html>");
    JPasswordField passwordField = new JPasswordField();

    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");

    JCheckBox showPassword = new JCheckBox("<html><font color=\"#FFFFF\",size=\"4\">Show Password</font></html>");
    JButton returnButton = new JButton("RETURN");

    public LoginAdmin() {

        F.getContentPane().setBackground(Color.BLACK);

        img = new ImageIcon("img\\admin.gif");
        LImg = new JLabel(img);

        userLabel.setBounds(300, 250, 100, 30);
        passwordLabel.setBounds(300, 320, 100, 30);
        userTextField.setBounds(400, 250, 150, 30);
        passwordField.setBounds(400, 320, 150, 30);
        showPassword.setBounds(400, 350, 150, 30);
        loginButton.setBounds(300, 400, 100, 30);
        resetButton.setBounds(450, 400, 100, 30);
        returnButton.setBounds(375, 480, 100, 30);
        LImg.setBounds(5, 370, 880, 700);
        LTitle3.setBounds(235, 100, 700, 100);
        showPassword.setBackground(Color.BLACK);

        F.add(userLabel);
        F.add(passwordLabel);
        F.add(userTextField);
        F.add(passwordField);
        F.add(showPassword);
        F.add(loginButton);
        F.add(resetButton);
        F.add(returnButton);
        F.add(LImg);
        F.add(LTitle3);

        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                File file = new File("file\\AdminPassword.txt");
                if (e.getSource() == loginButton) {
                    String userText;
                    String pwdText;
                    userText = userTextField.getText();
                    char[] passwordChars = passwordField.getPassword();
                    pwdText = new String(passwordChars);
                    Scanner input = null;
                    try {
                        input = new Scanner(file);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String user = input.nextLine();
                    String pass = input.nextLine();
                    if (userText.equalsIgnoreCase(user) && pwdText.equalsIgnoreCase(pass)) {
                        UIManager.put("OptionPane.background", Color.BLACK);
                        UIManager.put("OptionPane.messageForeground", Color.GREEN);
                        JOptionPane.showMessageDialog(null, "Login Successful !");
                        new AdminPanel();
                        F.setVisible(false);

                    } else {
                        UIManager.put("OptionPane.background", Color.BLACK);
                        UIManager.put("OptionPane.messageForeground", Color.RED);
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password !");
                    }
                }
            }
        });

        showPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == showPassword) {
                    if (showPassword.isSelected()) {
                        passwordField.setEchoChar((char) 0);
                    } else {
                        passwordField.setEchoChar('#');
                    }
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coding Part of RESET button
                if (e.getSource() == resetButton) {
                    userTextField.setText("");
                    passwordField.setText("");
                }
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPortal();
                F.setVisible(false);
            }
        });
    }
}
