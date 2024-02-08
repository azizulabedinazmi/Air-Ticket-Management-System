package AirTicketManagementSystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddNewFlight {

    JFrame F = new JFrame("Add New Flight");
    JLabel LImg;
    Icon img;

    JLabel LTitle3 = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">ADD NEW FLIGHT</font></b></html>");

    JLabel DepertureFromLabel = new JLabel("Deperture From");

    JTextField DepertureFromTextField = new JTextField();

    JLabel DeperatureToLabel = new JLabel("Deperature To");
    JTextField DeperatureToTextField = new JTextField();

    JLabel DistanceLabel = new JLabel("Flight Distence");
    JTextField DistanceField = new JTextField();

    JLabel unitLabel = new JLabel("Total Seat's");
    JTextField unitField = new JTextField();

    JButton signUpButton = new JButton("ADD");
    JButton returnButton = new JButton("RETURN");

    public AddNewFlight() {

        F.getContentPane().setBackground(Color.BLACK);

        img = new ImageIcon("img\\signup.png");
        LImg = new JLabel(img);

        DepertureFromLabel.setBounds(250, 250, 100, 30);
        DepertureFromLabel.setForeground(Color.BLUE);
        DeperatureToLabel.setBounds(250, 320, 150, 30);
        DeperatureToLabel.setForeground(Color.BLUE);
        DistanceLabel.setBounds(250, 400, 150, 30);
        DistanceLabel.setForeground(Color.BLUE);
        unitLabel.setBounds(250, 480, 150, 30);
        unitLabel.setForeground(Color.BLUE);
        DepertureFromTextField.setBounds(400, 250, 150, 30);
        DeperatureToTextField.setBounds(400, 320, 150, 30);
        DistanceField.setBounds(400, 400, 150, 30);
        unitField.setBounds(400, 480, 150, 30);
        signUpButton.setBounds(300, 550, 100, 30);
        returnButton.setBounds(450, 550, 100, 30);
        LImg.setBounds(5, 370, 880, 700);
        LTitle3.setBounds(290, 100, 700, 100);

        F.add(DepertureFromLabel);
        F.add(DeperatureToLabel);
        F.add(DistanceLabel);
        F.add(unitLabel);
        F.add(DepertureFromTextField);
        F.add(DeperatureToTextField);
        F.add(DistanceField);
        F.add(unitField);
        F.add(signUpButton);
        F.add(returnButton);
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
                    String name, topic, reg, add;
                    name = DepertureFromTextField.getText();
                    topic = DeperatureToTextField.getText();
                    reg = DistanceField.getText();
                    add = unitField.getText();

                    File FI = new File("file\\FlightList.txt");
                    BufferedWriter BF = new BufferedWriter(new FileWriter(FI, true));
                    BF.write(name + " " + topic + " " + reg + " " + add + "\n");
                    JOptionPane.showMessageDialog(null, "Add Medicine Successfully !");
                    BF.close();
                    File FI1 = new File("file\\SellFiles\\DepartureFrom.txt");
                    BufferedWriter BF1 = new BufferedWriter(new FileWriter(FI1, true));
                    BF1.write(name + "\n");
                    BF1.close();
                    // Medicine Company Save For BuyMedicine

                    String topic1;
                    topic1 = DeperatureToTextField.getText();
                    File FI2 = new File("file\\SellFiles\\ArivalIn.txt");
                    BufferedWriter BF2 = new BufferedWriter(new FileWriter(FI2, true));
                    BF2.write(topic1 + "\n");
                    BF2.close();

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                new AdminPanel();
                F.setVisible(false);
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminPanel();
                F.setVisible(false);
            }
        });
    }
}
