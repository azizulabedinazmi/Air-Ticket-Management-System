package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdminPanel {

    JFrame F = new JFrame("Admin Panel");

    JLabel DImg, UImg, VImg, DLImg, ULImg, VLImg, MEDIImg, HOSImg, LOGImg;
    Icon dimg, uimg, vimg, dLimg, uLimg, vLimg, mimg, himg, limg;
    JLabel LTitle = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">ADMIN PANEL</font></b></html>");

    JButton AddFlightButton = new JButton("ADD Flight");
    JButton AddUserButton = new JButton("ADD NEW USER");
    JButton AddDoctorButton = new JButton("ADD Airline");

    JButton ViewUserButton = new JButton("USER LIST");
    JButton ViewDoctorButton = new JButton("AirLine LIST");

    JButton HospitalListButton = new JButton("AIRPORT LIST");
    JButton FlightListButton = new JButton("Flight LIST");

    JButton LogOutButton = new JButton("LOGOUT");

    public AdminPanel() {

        F.getContentPane().setBackground(Color.BLACK);

        vimg = new ImageIcon("img\\icons8-add.gif");
        VImg = new JLabel(vimg);
        VImg.setBounds(70, 115, 140, 80);
        F.add(VImg);

        dimg = new ImageIcon("img\\icons8-plane-48.png");
        DImg = new JLabel(dimg);
        DImg.setBounds(685, 115, 140, 80);
        F.add(DImg);

        uimg = new ImageIcon("img\\icons8-add-user-group-woman-man-skin-type-7-48.png");
        UImg = new JLabel(uimg);
        UImg.setBounds(370, 115, 140, 80);
        F.add(UImg);

        dLimg = new ImageIcon("img\\icons8-plane-48.png");
        DLImg = new JLabel(dLimg);
        DLImg.setBounds(530, 315, 140, 80);
        F.add(DLImg);

        uLimg = new ImageIcon("img\\icons8-user-groups-skin-type-7-48.png");
        ULImg = new JLabel(uLimg);
        ULImg.setBounds(220, 315, 140, 80);

        F.add(ULImg);

        mimg = new ImageIcon("img\\icons8-backlog-48.png");
        MEDIImg = new JLabel(mimg);
        MEDIImg.setBounds(530, 515, 140, 80);
        F.add(MEDIImg);

        // HOSPITAL
        himg = new ImageIcon("img\\icons8-airport-48.png");
        HOSImg = new JLabel(himg);
        HOSImg.setBounds(220, 515, 140, 80);
        F.add(HOSImg);

        // LOGOUT
        limg = new ImageIcon("img\\icons8-logout-48.png");
        LOGImg = new JLabel(limg);
        LOGImg.setBounds(375, 715, 140, 80);
        F.add(LOGImg);

        // LTitle.setBounds(100, 200, 600, 100);
        // LTitle2.setBounds(100, 250, 700, 100);
        LTitle.setBounds(350, 10, 700, 100);
        AddFlightButton.setBounds(70, 200, 140, 30);
        AddUserButton.setBounds(370, 200, 140, 30);
        AddDoctorButton.setBounds(685, 200, 140, 30);

        ViewUserButton.setBounds(220, 400, 140, 30);
        ViewDoctorButton.setBounds(530, 400, 140, 30);

        HospitalListButton.setBounds(220, 600, 140, 30);
        FlightListButton.setBounds(530, 600, 140, 30);
        LogOutButton.setBounds(375, 800, 140, 30);

        F.add(LTitle);
        F.add(AddFlightButton);
        F.add(AddUserButton);
        F.add(AddDoctorButton);

        F.add(ViewUserButton);
        F.add(ViewDoctorButton);

        F.add(HospitalListButton);
        F.add(FlightListButton);
        F.add(LogOutButton);

        F.setLocationRelativeTo(null);

        F.setBackground(Color.WHITE);

        AddFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddNewFlight();
                F.setVisible(false);

            }
        });

        AddUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddNewUser();
                F.setVisible(false);
            }

        });

        AddDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddNewAirlines();
                F.setVisible(false);
            }

        });

        ViewUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserList();
                F.setVisible(false);
            }

        });
        ViewDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AirLineList();
                F.setVisible(false);
            }

        });
        HospitalListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AirportList();
                F.setVisible(false);
            }

        });
        FlightListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FlightList();
                F.setVisible(false);
            }

        });
        LogOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPortal();
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