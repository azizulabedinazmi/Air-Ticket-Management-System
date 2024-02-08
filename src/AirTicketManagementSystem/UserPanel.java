package AirTicketManagementSystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserPanel {

    JFrame F = new JFrame("User Panel");

    JLabel DImg, UImg, VImg, DLImg, ULImg, VLImg, MEDIImg, HOSImg, LOGImg, BMImg, CDImg, HIImg;
    Icon dimg, uimg, vimg, dLimg, uLimg, vLimg, mimg, himg, limg, bmimg, cdimg, hiimg;
    JLabel LTitle = new JLabel("<html><b><font color=\"#0CD5D2\",size=\"6\">USER PANEL</font></b></html>");

    JButton TravelAgencyList = new JButton("Travel Agency's");

    JButton ViewAirlineButton = new JButton("Airline LIST");
    JButton AirportListButton = new JButton("Airport LIST");

    JButton FlightViewButton = new JButton("Flight View");
    JButton BuyTicketButton = new JButton("SELL Ticket");

    JButton LogOutButton = new JButton("LOGOUT");

    public UserPanel() {
        F.getContentPane().setBackground(Color.BLACK);

        hiimg = new ImageIcon("img\\icons8-traveler-48.png");
        HIImg = new JLabel(hiimg);
        HIImg.setBounds(370, 115, 140, 80);
        F.add(HIImg);

        dLimg = new ImageIcon("img\\icons8-plane-48.png");
        DLImg = new JLabel(dLimg);
        DLImg.setBounds(530, 315, 140, 80);
        F.add(DLImg);

        mimg = new ImageIcon("img\\icons8-backlog-48.png");
        MEDIImg = new JLabel(mimg);
        MEDIImg.setBounds(530, 515, 140, 80);
        F.add(MEDIImg);

        himg = new ImageIcon("img\\icons8-airport-48.png");
        HOSImg = new JLabel(himg);
        HOSImg.setBounds(220, 315, 140, 80);
        F.add(HOSImg);

        limg = new ImageIcon("img\\icons8-logout-48.png");
        LOGImg = new JLabel(limg);
        LOGImg.setBounds(375, 715, 140, 80);
        F.add(LOGImg);

        bmimg = new ImageIcon("img\\icons8-pnr-code-48.png");
        BMImg = new JLabel(bmimg);
        BMImg.setBounds(220, 515, 140, 80);
        F.add(BMImg);

        LTitle.setBounds(370, 10, 700, 100);
        TravelAgencyList.setBounds(370, 200, 140, 30);

        ViewAirlineButton.setBounds(530, 400, 140, 30);

        AirportListButton.setBounds(220, 400, 140, 30);
        FlightViewButton.setBounds(530, 600, 140, 30);
        LogOutButton.setBounds(375, 800, 140, 30);
        BuyTicketButton.setBounds(220, 600, 140, 30);

        F.add(LTitle);
        F.add(TravelAgencyList);

        F.add(ViewAirlineButton);
        F.add(BuyTicketButton);

        F.add(AirportListButton);
        F.add(FlightViewButton);
        F.add(LogOutButton);

        F.setLocationRelativeTo(null);

        TravelAgencyList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TravelAgensys();
                F.setVisible(false);
            }

        });

        ViewAirlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserAirlineList();
                F.setVisible(false);
            }

        });
        AirportListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserAirportList();
                F.setVisible(false);
            }

        });
        FlightViewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserFlightView();
                F.setVisible(false);
            }

        });
        BuyTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SellTicket();
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
