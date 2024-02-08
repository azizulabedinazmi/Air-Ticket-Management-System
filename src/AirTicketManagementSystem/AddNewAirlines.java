package AirTicketManagementSystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class AddNewAirlines {

    JFrame F = new JFrame("Add New Airline");
    JButton b = new JButton("RETURN");

    private final JLabel title;
    private final JLabel name;
    private final JTextField airname;
    private final JLabel AirlineCode;
    private final JTextField tAirlineCode;
    private final JLabel reg;
    private final JTextField treg;
    private final JLabel catagory;
    private final JRadioButton passenger;
    private final JRadioButton privateplane;
    private final ButtonGroup catgp;
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
    private final String years[] = { "1983", "1984", "1985", "1986",
            "1987", "1988", "1989", "1990",
            "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022",
            "2023", "2024", "2025", "2026", };

    public AddNewAirlines() {
        F.getContentPane().setBackground(Color.BLACK);

        Icon img = new ImageIcon("img\\Underborder.png");
        JLabel LImg = new JLabel(img);
        LImg.setBounds(5, 370, 880, 700);
        F.add(LImg);

        title = new JLabel("<html><b><font color=\"#C71585\",size=\"6\">ADD NEW AIRLINE FORM</font></b></html>");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(301, 50);
        title.setLocation(300, 30);
        F.add(title);

        name = new JLabel("Airline NAME");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(100, 20);
        name.setForeground(Color.BLUE);
        name.setLocation(100, 150);
        F.add(name);

        airname = new JTextField();
        airname.setFont(new Font("Arial", Font.PLAIN, 15));
        airname.setSize(190, 25);
        airname.setLocation(200, 150);
        F.add(airname);

        AirlineCode = new JLabel("Airline Code");
        AirlineCode.setFont(new Font("Arial", Font.PLAIN, 15));
        AirlineCode.setSize(100, 20);
        AirlineCode.setForeground(Color.BLUE);
        AirlineCode.setLocation(100, 200);
        F.add(AirlineCode);

        tAirlineCode = new JTextField();
        tAirlineCode.setFont(new Font("Arial", Font.PLAIN, 15));
        tAirlineCode.setSize(190, 25);
        tAirlineCode.setForeground(Color.BLUE);
        tAirlineCode.setLocation(200, 200);
        F.add(tAirlineCode);

        reg = new JLabel("REG NO");
        reg.setFont(new Font("Arial", Font.PLAIN, 15));
        reg.setSize(100, 20);
        reg.setForeground(Color.BLUE);
        reg.setLocation(100, 250);
        F.add(reg);

        treg = new JTextField(" A");
        treg.setFont(new Font("Arial", Font.PLAIN, 15));
        treg.setSize(150, 25);
        treg.setForeground(Color.BLUE);
        treg.setLocation(200, 250);
        F.add(treg);

        catagory = new JLabel("Catagory");
        catagory.setFont(new Font("Arial", Font.PLAIN, 15));
        catagory.setSize(100, 20);
        catagory.setForeground(Color.BLUE);
        catagory.setLocation(100, 300);
        F.add(catagory);

        passenger = new JRadioButton("Passenger");
        passenger.setFont(new Font("Arial", Font.PLAIN, 15));
        passenger.setSelected(true);
        passenger.setSize(100, 20);
        passenger.setLocation(200, 300);
        passenger.setBackground(Color.WHITE);
        passenger.setForeground(Color.BLUE);
        F.add(passenger);

        privateplane = new JRadioButton("Private");
        privateplane.setFont(new Font("Arial", Font.PLAIN, 15));
        privateplane.setSelected(false);
        privateplane.setSize(100, 20);
        privateplane.setLocation(300, 300);
        privateplane.setBackground(Color.WHITE);
        privateplane.setForeground(Color.BLUE);
        F.add(privateplane);

        catgp = new ButtonGroup();
        catgp.add(passenger);
        catgp.add(privateplane);

        dob = new JLabel("FONDATION DATE");
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

        add = new JLabel("Country");
        add.setFont(new Font("Arial", Font.PLAIN, 15));
        add.setSize(100, 20);
        add.setForeground(Color.BLUE);
        add.setLocation(100, 400);
        F.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 60);
        tadd.setLocation(200, 400);
        tadd.setLineWrap(true);
        tadd.setBackground(Color.WHITE);
        tadd.setForeground(Color.BLUE);
        F.add(tadd);

        term = new JCheckBox("Confirm Input's.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 500);
        term.setBackground(Color.WHITE);
        F.add(term);

        sub = new JButton("SUBMIT");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 550);
        F.add(sub);

        reset = new JButton("RESET");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 550);
        ;
        F.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setForeground(Color.YELLOW);
        tout.setSize(300, 400);
        tout.setLocation(500, 200);
        tout.setBackground(Color.BLACK);
        tout.setLineWrap(true);
        tout.setEditable(false);
        F.add(tout);

        res = new JLabel("");
        res.setSize(500, 25);
        res.setLocation(150, 580);
        res.setForeground(Color.RED);
        res.setBackground(Color.BLACK);
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
                        String data = "Airline Name : "
                                + airname.getText() + "\n"
                                + "\nAirline Code : "
                                + tAirlineCode.getText() + "\n"
                                + "\nReg Number : "
                                + treg.getText() + "\n";
                        if (passenger.isSelected()) {
                            data1 = "\nPassenger Plane"
                                    + "\n";
                        } else {
                            data1 = "\nPrivate Jet Plane"
                                    + "\n";
                        }
                        String data2 = "\nPlane Build Date : "
                                + (String) date.getSelectedItem()
                                + "/" + (String) month.getSelectedItem()
                                + "/" + (String) year.getSelectedItem()
                                + "\n";

                        String data3 = "\nCountry : " + tadd.getText();
                        tout.setText(data + data1 + data2 + data3);
                        tout.setEditable(false);
                        try {
                            String name, AirlineCode, reg, add;
                            name = airname.getText();
                            AirlineCode = tAirlineCode.getText();
                            reg = treg.getText();
                            add = tadd.getText();

                            File FI = new File("file\\AirlineList.txt");
                            BufferedWriter BF = new BufferedWriter(new FileWriter(FI, true));
                            BF.write(name + " " + AirlineCode + reg + " " + add + "\n");
                            JOptionPane.showMessageDialog(null, "Registration Successfully !");
                            BF.close();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }

                    } else {
                        tout.setText("");

                        res.setText(
                                "<html><b><font color=\"#FF0000\",size=\"\">Please Confirm Your Inputs...</font></b></html>");
                    }
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == reset) {
                    String def = "";
                    airname.setText(def);
                    tadd.setText(def);
                    treg.setText(def);
                    res.setText(def);

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
