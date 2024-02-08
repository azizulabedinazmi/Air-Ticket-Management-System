package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

class LoginUser {

    JFrame F = new JFrame("User Login");
    JLabel LImg;
    Icon img;

    JLabel LTitle3 = new JLabel(
            "<html><b><font color=\"#0CD5D2\",size=\"6\">SIGN IN TO YOUR USER ACCOUNT</font></b></html>");
    JLabel LTitle = new JLabel(
            "<html><b><font color=\"#0CD5D2\",size=\"4\">If you do not have an account, Please make an account.</font></b></html>");

    JLabel userLabel = new JLabel("USERNAME");
    JTextField userTextField = new JTextField();

    JLabel passwordLabel = new JLabel("PASSWORD");
    JPasswordField passwordField = new JPasswordField();

    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton accCreateButton = new JButton("CREATE NEW ACCOUNT");

    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton returnButton = new JButton("RETURN");

    public LoginUser() {

        F.getContentPane().setBackground(Color.BLACK);

        img = new ImageIcon("img\\user.gif");
        LImg = new JLabel(img);

        userLabel.setBounds(300, 250, 100, 30);
        userLabel.setForeground(Color.BLUE);
        passwordLabel.setBounds(300, 320, 100, 30);
        passwordLabel.setForeground(Color.BLUE);
        userTextField.setBounds(400, 250, 150, 30);
        passwordField.setBounds(400, 320, 150, 30);
        showPassword.setBounds(400, 350, 150, 30);
        loginButton.setBounds(300, 400, 100, 30);
        resetButton.setBounds(450, 400, 100, 30);
        returnButton.setBounds(375, 580, 100, 30);
        accCreateButton.setBounds(325, 480, 200, 30);
        LImg.setBounds(5, 400, 880, 700);
        LTitle3.setBounds(235, 100, 700, 100);
        LTitle.setBounds(230, 500, 600, 100);
        showPassword.setBackground(Color.WHITE);

        F.add(userLabel);
        F.add(passwordLabel);
        F.add(userTextField);
        F.add(passwordField);
        F.add(showPassword);
        F.add(loginButton);
        F.add(resetButton);
        F.add(returnButton);
        F.add(accCreateButton);
        F.add(LImg);
        F.add(LTitle3);
        F.add(LTitle);

        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                {
                    try {
                        String user, password;
                        user = userTextField.getText();
                        password = passwordField.getText();
                        File FI = new File("file\\UserPassword.txt");
                        Scanner A = new Scanner(FI);
                        while (A.hasNextLine()) {
                            String US = A.next();
                            String PASS = A.next();
                            if (user.equals(US) && password.equals(PASS)) {
                                JOptionPane.showMessageDialog(null, "Login Successful !");
                                new UserPanel();
                                F.setVisible(false);
                                break;
                            }
                        }
                        A.close();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password !", "Message",
                                JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex.getMessage());
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
                        passwordField.setEchoChar('•');
                    }
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == resetButton) {
                    userTextField.setText("");
                    passwordField.setText("");
                }
            }
        });
        accCreateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserSignUp();
                F.setVisible(false);
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
