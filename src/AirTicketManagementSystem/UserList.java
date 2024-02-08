package AirTicketManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class UserList {

    JLabel label = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">USER LIST</font></b></html>", JLabel.CENTER);

    JFrame F = new JFrame("User List");
    Cursor cr = new Cursor(Cursor.HAND_CURSOR);
    JButton a = new JButton("RETURN");
    JButton b = new JButton("SHOW");
    JTable A = new JTable();

    public UserList() {

        F.getContentPane().setBackground(Color.BLACK);

        b.setBounds(150, 800, 140, 30);
        a.setBounds(600, 800, 140, 30);
        label.setBounds(70, 10, 700, 100);
        a.setCursor(cr);
        b.setCursor(cr);

        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminPanel();
                F.setVisible(false);
            }
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    File FI2 = new File("file\\UserList.txt");
                    Scanner input = new Scanner(new FileReader(FI2));
                    int row = 0;
                    int col = 0;
                    while (input.hasNextLine()) {
                        String line = input.nextLine();
                        row++;
                        col = line.split(" ").length;
                    }
                    input.close();
                    String[][] d = new String[row][col];
                    input = new Scanner(new FileReader(FI2));

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            d[i][j] = input.next();
                        }
                        String column[] = { "NAME", "NUMBER", "PASSWORD", "ADDRESS" };
                        JTable T = new JTable(d, column);
                        JScrollPane JP = new JScrollPane(T);
                        JP.setBounds(5, 100, 873, 600);
                        F.add(JP);
                    }
                    input.close();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        F.add(new JScrollPane(A));
        F.add(a);
        F.add(label);
        F.add(b);
        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
