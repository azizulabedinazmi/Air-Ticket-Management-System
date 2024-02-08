package AirTicketManagementSystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class AddNewUser {

    JFrame F = new JFrame("Add New User");
    JButton b = new JButton("RETURN");

    private final JLabel title;
    private final JLabel name;
    private final JLabel password;
    private final JTextField tpassword;
    private final JTextField tname;
    private final JLabel mno;
    private final JTextField tmno;
    private final JLabel gender;
    private final JRadioButton male;
    private final JRadioButton female;
    private final ButtonGroup gengp;
    private final JLabel dob;
    private final JComboBox date;
    private final JComboBox month;
    private final JComboBox year;
    private final JLabel add;
    private final JTextArea tadd;
    private final JCheckBox term;
    private final JButton sub;
    private final JButton reset;
    private final JTextArea tout;
    private final JLabel res;

    private final String dates[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private final String months[] = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private final String years[] = { "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022",
            "2023", "2024", "2025", "2026", };

    public AddNewUser() {

        F.getContentPane().setBackground(Color.BLACK);

        Icon img = new ImageIcon("img\\Underborder.png");
        JLabel LImg = new JLabel(img);
        LImg.setBounds(5, 370, 880, 700);
        F.add(LImg);

        title = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">ADD NEW USER FORM</font></b></html>");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        F.add(title);

        name = new JLabel("NAME");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(100, 20);
        name.setForeground(Color.BLUE);
        name.setLocation(100, 150);
        F.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 25);
        tname.setLocation(200, 150);
        F.add(tname);

        // PASSWORD
        password = new JLabel("PASSWORD");
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setSize(100, 20);
        password.setForeground(Color.BLUE);
        password.setLocation(100, 200);
        F.add(password);

        tpassword = new JTextField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(190, 25);
        tpassword.setLocation(200, 200);
        F.add(tpassword);
        // END PASSWORD

        mno = new JLabel("NUMBER");
        mno.setFont(new Font("Arial", Font.PLAIN, 15));
        mno.setSize(100, 20);
        mno.setForeground(Color.BLUE);
        mno.setLocation(100, 250);
        F.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 25);
        tmno.setLocation(200, 250);
        F.add(tmno);

        gender = new JLabel("GENDER");
        gender.setFont(new Font("Arial", Font.PLAIN, 15));
        gender.setSize(100, 20);
        gender.setForeground(Color.BLUE);
        gender.setLocation(100, 300);
        F.add(gender);

        male = new JRadioButton("MALE");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(78, 20);
        male.setLocation(200, 300);
        male.setForeground(Color.BLUE);
        male.setBackground(Color.WHITE);
        F.add(male);

        female = new JRadioButton("FEMALE");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(90, 20);
        female.setLocation(275, 300);
        female.setForeground(Color.BLUE);
        female.setBackground(Color.WHITE);
        F.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 15));
        dob.setSize(100, 20);
        dob.setForeground(Color.BLUE);
        dob.setLocation(100, 350);
        F.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 350);
        F.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 350);
        F.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 350);
        F.add(year);

        add = new JLabel("ADDRESS");
        add.setFont(new Font("Arial", Font.PLAIN, 15));
        add.setSize(100, 20);
        add.setForeground(Color.BLUE);
        add.setLocation(100, 400);
        F.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 400);
        tadd.setLineWrap(true);
        tadd.setBackground(Color.WHITE);
        F.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 500);
        term.setBackground(Color.WHITE);
        F.add(term);

        sub = new JButton("SUBMIT");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 550);
        // sub.addActionListener(this);
        F.add(sub);

        reset = new JButton("RESET");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 550);
        // reset.addActionListener(this);
        F.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setForeground(Color.YELLOW);
        tout.setBackground(Color.BLACK);
        tout.setLocation(500, 200);
        tout.setLineWrap(true);
        tout.setEditable(false);
        F.add(tout);

        res = new JLabel("");
        res.setSize(500, 25);
        res.setLocation(150, 580);
        res.setForeground(Color.RED);
        F.add(res);

        F.add(b);
        b.setBounds(350, 730, 140, 30);

        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == sub) {
                    if (term.isSelected()) {
                        String data1;
                        String data = "User Name : "
                                + tname.getText() + "\n"
                                + "\nUser Mobile : "
                                + tmno.getText() + "\n";
                        if (male.isSelected()) {
                            data1 = "\nUser Gender : Male"
                                    + "\n";
                        } else {
                            data1 = "\nUser Gender : Female"
                                    + "\n";
                        }
                        String data2 = "\nUser DOB : "
                                + (String) date.getSelectedItem()
                                + "/" + (String) month.getSelectedItem()
                                + "/" + (String) year.getSelectedItem()
                                + "\n";

                        String data3 = "\nUser Address : " + tadd.getText();
                        tout.setText(data + data1 + data2 + data3);
                        tout.setEditable(false);
                        try {
                            String name, mno, pass, add;
                            // int mno;
                            name = tname.getText();
                            mno = tmno.getText();
                            pass = tpassword.getText();
                            add = tadd.getText();

                            File FI = new File("file\\UserList.txt");
                            BufferedWriter BF = new BufferedWriter(new FileWriter(FI, true));
                            BF.write(name + " " + mno + " " + pass + " " + add + "\n");
                            JOptionPane.showMessageDialog(null, "Registration Successfully !");
                            BF.close();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }

                    } else {
                        tout.setText("");

                        res.setText(
                                "<html><b><font color=\"#FF0000\",size=\"\">Please accept the terms & conditions...</font></b></html>");
                    }
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == reset) {
                    String def = "";
                    tname.setText(def);
                    tadd.setText(def);
                    tmno.setText(def);
                    // res.setText(def);
                    tout.setText(def);
                    term.setSelected(false);
                    date.setSelectedIndex(0);
                    month.setSelectedIndex(0);
                    year.setSelectedIndex(0);

                }
            }
        });

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminPanel();
                F.setVisible(false);
            }
        });
    }
}
