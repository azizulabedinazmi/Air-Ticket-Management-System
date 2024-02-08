package AirTicketManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;

public class SellTicket {
    int random(int i) {
        Random randnum = new Random();
        randnum.setSeed(123456789);
        return randnum.nextInt(i);
    }

    JFrame F = new JFrame("Sell Ticket");

    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField JB = new JTextField();
    JLabel lbl1 = new JLabel();
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();
    JLabel lbl4 = new JLabel();
    JLabel lbl5 = new JLabel();
    JLabel lbl6 = new JLabel();
    final JLabel label = new JLabel();
    private final JTextArea tout;
    private final JButton sub;

    Cursor cr = new Cursor(Cursor.HAND_CURSOR);
    JButton a = new JButton("RETURN");
    JButton b = new JButton("SELL NOW");
    JTextArea TP = new JTextArea();
    JComboBox JC = new JComboBox();
    JComboBox JC1 = new JComboBox();
    JComboBox JS = new JComboBox();
    JLabel LTitle = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">SELL TICKETS</font></b></html>");

    public SellTicket() {

        F.getContentPane().setBackground(Color.BLACK);

        a.setBounds(150, 800, 140, 30);
        b.setBounds(600, 800, 140, 30);
        LTitle.setBounds(330, 0, 700, 100);
        F.add(LTitle);
        a.setCursor(cr);
        b.setCursor(cr);

        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserPanel();
                F.setVisible(false);
            }
        });

        txt1.setBounds(220, 150, 160, 30);
        txt1.setForeground(Color.BLACK);

        txt2.setBounds(600, 150, 160, 30);
        txt2.setForeground(Color.BLACK);

        lbl1.setBounds(100, 150, 150, 25);
        lbl1.setText("CUSTOMER NAME");
        lbl1.setForeground(Color.BLUE);

        lbl6.setBounds(460, 150, 150, 25);
        lbl6.setText("Passport NUMBER");
        lbl6.setForeground(Color.BLUE);

        lbl2.setBounds(100, 250, 150, 25);
        lbl2.setText("Departure From");
        lbl2.setForeground(Color.BLUE);
        lbl2.setBackground(Color.WHITE);

        lbl3.setBounds(460, 250, 150, 25);
        lbl3.setText("Arrival TO");
        lbl3.setForeground(Color.BLUE);
        lbl3.setBackground(Color.WHITE);

        lbl4.setBounds(100, 350, 150, 25);
        lbl4.setText("Price");
        lbl4.setForeground(Color.BLUE);
        lbl4.setBackground(Color.WHITE);

        lbl5.setBounds(460, 350, 150, 25);
        lbl5.setText("Seats Needed");
        lbl5.setForeground(Color.BLUE);
        lbl5.setBackground(Color.WHITE);

        String filePath = "file\\SellFiles\\DepartureFrom.txt";
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                JC.addItem(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        String filePath1 = "file\\SellFiles\\ArivalIn.txt";
        File file1 = new File(filePath1);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file1));
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                JC1.addItem(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        String filePath3 = "file\\SellFiles\\mediunit.txt";
        File file3 = new File(filePath3);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file3));
            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                JS.addItem(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        tout = new JTextArea();
        tout.setBounds(220, 450, 450, 210);
        tout.setLineWrap(true);
        tout.setBackground(Color.BLACK);
        tout.setForeground(Color.YELLOW);
        tout.setEditable(false);
        F.add(tout);

        sub = new JButton("CHECK");
        sub.setBounds(370, 750, 140, 30);
        F.add(sub);

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == sub) {
                    String data = "\n" + "Customer Name : "
                            + txt1.getText() + "\n"
                            + "\nCustomer Number : "
                            + txt2.getText() + "\n"
                            + "\nMedicine Name : "
                            + JC.getSelectedItem() + "\n"
                            + "\nMedicine Company : "
                            + JC1.getSelectedItem() + "\n"
                            + "\nMedicine Price : "
                            + JB.getText() + "\n"
                            + "\nMedicine Unit : "
                            + JS.getSelectedItem() + "\n";

                    tout.setText(data);
                    tout.setEditable(false);
                }
            }
        });

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(F, "Sure? You want to Conform?", "Conformation",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                switch (result) {
                    case JOptionPane.YES_OPTION:
                        JFrame F1 = new JFrame("Print Slip");
                        JButton r = new JButton("RETURN");
                        r.setBounds(275, 570, 80, 20);
                        r.setCursor(cr);
                        F1.add(r);
                        F1.setBackground(Color.BLACK);
                        r.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                new SellTicket();
                                F1.setVisible(false);
                            }
                        });

                        JLabel LTitle = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"5\">Ticket BUYING SLIP</font></b></html>");
                        JLabel LFrom = new JLabel("Customar Name  :  " + txt1.getText());
                        JLabel LTo = new JLabel("Customar Number  :  " + txt2.getText());
                        JLabel LClass = new JLabel("Medicine Name  :  " + JC.getSelectedItem());
                        JLabel LBookingDate = new JLabel("Medicine Company  :  " + JC1.getSelectedItem());
                        JLabel LPrice = new JLabel("Medicine Price  :  " + JB.getText());
                        JLabel LTime = new JLabel("Total Unit  :  " + JS.getSelectedItem());

                        JLabel LBookedBy = new JLabel(
                                "<html><font color=\"#000000\">Sell By : Azmi Travel Agency Ltd.</font></html>");

                        LTitle.setBounds(220, 0, 500, 45);
                        LFrom.setBounds(20, 80, 300, 20);
                        LTo.setBounds(20, 125, 300, 20);
                        LClass.setBounds(20, 170, 300, 20);
                        LBookingDate.setBounds(20, 215, 300, 20);
                        LPrice.setBounds(20, 260, 300, 20);
                        LTime.setBounds(20, 305, 300, 20);

                        LBookedBy.setBounds(320, 125, 300, 20);

                        F1.add(LTitle);
                        F1.add(LFrom);
                        F1.add(LTo);
                        F1.add(LClass);
                        F1.add(LBookingDate);
                        F1.add(LPrice);
                        F1.add(LTime);

                        F1.add(LBookedBy);

                        F1.setSize(700, 650);
                        F1.setLayout(null);
                        F1.setVisible(true);
                        F1.setLocationRelativeTo(null);
                        F1.getContentPane().setBackground(Color.WHITE);
                        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        break;
                    case JOptionPane.NO_OPTION:
                        label.setText("You selected : No");
                        new SellTicket();
                        F.setVisible(false);
                        break;
                    default:
                        new SellTicket();
                        label.setText("None selected");
                        break;
                }
                F.setVisible(false);
            }
        });

        JC.setBounds(220, 250, 130, 30);
        JC1.setBounds(600, 250, 130, 30);
        JB.setBounds(220, 350, 130, 30);
        JS.setBounds(600, 350, 130, 30);
        F.add(a);
        F.add(b);
        F.add(JC);
        F.add(JC1);
        F.add(JB);
        F.add(JS);
        F.add(TP);
        F.add(txt1);
        F.add(txt2);
        F.add(lbl1);
        F.add(lbl2);
        F.add(lbl3);
        F.add(lbl4);
        F.add(lbl5);
        F.add(lbl6);
        F.setBounds(50, 50, 900, 900);
        F.setLayout(null);
        F.setVisible(true);
        F.setLocationRelativeTo(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
