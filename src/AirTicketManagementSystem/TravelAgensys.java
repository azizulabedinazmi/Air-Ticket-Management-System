package AirTicketManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TravelAgensys {

        JFrame F = new JFrame("Travel Agency's");
        JButton returnButton = new JButton("RETURN");

        public TravelAgensys() {

                F.add(returnButton);
                returnButton.setBounds(380, 800, 100, 30);

                JLabel LTitle = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">Travel Agency's</font></b></html>");
                LTitle.setBounds(300, 0, 700, 100);
                F.add(LTitle);

                JLabel LTitle1 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">Global Milage Management .</font></b></html>");
                LTitle1.setBounds(50, 80, 700, 100);
                F.add(LTitle1);
                JTextArea area = new JTextArea(
                                "Address: 5th Floor, The Emporium Bhaban, \n14/1 Shyamoli, Office No- C-5/2, Mirpur Rd, \nDhaka 1207"
                                                + "\nContact : +8801762-202021");
                area.setForeground(Color.BLUE);
                area.setBackground(Color.BLACK);
                F.add(area);
                area.setFont(new Font(null, Font.PLAIN, 17));
                area.setBounds(50, 170, 350, 90);

                JLabel LTitle2 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">Talon Corporation</font></b></html>");
                LTitle2.setBounds(50, 250, 700, 100);
                F.add(LTitle2);
                JTextArea area1 = new JTextArea("Address: House 11/B \n4th Floor, Rd 130, Dhaka 1212"
                                + "\nContact : +8801909-112568");
                area1.setForeground(Color.BLUE);
                area1.setBackground(Color.BLACK);
                F.add(area1);
                area1.setFont(new Font(null, Font.PLAIN, 17));
                area1.setBounds(50, 340, 350, 90);

                JLabel LTitle3 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">Haji Air Travels</font></b></html>");
                LTitle3.setBounds(50, 420, 700, 100);
                F.add(LTitle3);
                JTextArea area2 = new JTextArea(
                                "Address: City Heart (8th floor), Suit No: 9/4, \nToynbee Circular Road, Dhaka 1000."
                                                + "\nContact : +8802-9348021");
                area2.setForeground(Color.BLUE);
                area2.setBackground(Color.BLACK);
                F.add(area2);
                area2.setFont(new Font(null, Font.PLAIN, 17));
                area2.setBounds(50, 510, 350, 90);

                JLabel LTitle4 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">Dynamic Travels</font></b></html>");
                LTitle4.setBounds(50, 600, 700, 100);
                F.add(LTitle4);
                JTextArea area3 = new JTextArea(
                                "Address: Bashati Horizon, 7th Floor, APT # A-7, \nPlot #21, Road #17, Block # C, Banani C/A, \nDhaka-1213, Bangladesh."
                                                + "\nContact : +8802222274217");
                area3.setForeground(Color.BLUE);
                area3.setBackground(Color.BLACK);
                F.add(area3);
                area3.setFont(new Font(null, Font.PLAIN, 17));
                area3.setBounds(50, 690, 350, 90);

                JLabel LTitle5 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">International Travel Corporation</font></b></html>");
                LTitle5.setBounds(450, 80, 700, 100);
                F.add(LTitle5);
                JTextArea area4 = new JTextArea(
                                "Address: Landmark Tower 10th floor 10 ~ 12, \nGulshan North Ave, Dhaka 1212"
                                                + "\nContact : +8801766-194500");
                area4.setForeground(Color.BLUE);
                area4.setBackground(Color.BLACK);
                F.add(area4);
                area4.setFont(new Font(null, Font.PLAIN, 17));
                area4.setBounds(450, 170, 350, 90);

                JLabel LTitle6 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">ShareTrip Ltd.</font></b></html>");
                LTitle6.setBounds(450, 250, 700, 100);
                F.add(LTitle6);
                JTextArea area5 = new JTextArea("Address: Tower, 4th Floor, House, Rangs Pearl, \n76 Rd 12, Dhaka 1213"
                                + "\nContact : +8809617-617617");
                area5.setForeground(Color.BLUE);
                area5.setBackground(Color.BLACK);
                F.add(area5);
                area5.setFont(new Font(null, Font.PLAIN, 17));
                area5.setBounds(450, 340, 350, 90);

                JLabel LTitle7 = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">GoZayaan</font></b></html>");
                LTitle7.setBounds(450, 420, 700, 100);
                F.add(LTitle7);
                JTextArea area7 = new JTextArea("Address: Level 5, House 1/A Road No. 16/A, \nDhaka 1212"
                                + "\nContact : +8809678-332211");
                area7.setForeground(Color.BLUE);
                area7.setBackground(Color.BLACK);
                F.add(area7);
                area7.setFont(new Font(null, Font.PLAIN, 17));
                area7.setBounds(450, 510, 350, 90);

                JLabel LTitle8 = new JLabel(
                                "<html><b><font color=\"#0CD5D2\",size=\"6\">Galaxy Travel International</font></b></html>");
                LTitle8.setBounds(450, 600, 700, 100);
                F.add(LTitle8);
                JTextArea area8 = new JTextArea("Address: 02nd Floor, Taj Cassilina, 25 Gulshan Avenue, Dhaka 1212"
                                + "\nContact : +8802222-262238");
                area8.setForeground(Color.BLUE);
                area8.setBackground(Color.BLACK);
                F.add(area8);
                area8.setFont(new Font(null, Font.PLAIN, 17));
                area8.setBounds(450, 690, 350, 90);

                F.setBounds(50, 50, 900, 900);
                F.setLayout(null);
                F.setVisible(true);
                F.setLocationRelativeTo(null);
                F.getContentPane().setBackground(Color.BLACK);
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                returnButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new UserPanel();
                                F.setVisible(false);
                        }
                });
        }
}
