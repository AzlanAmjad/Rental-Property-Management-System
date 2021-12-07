package presentation.guicomponents;

import javax.swing.*;

/**
 * Class ManageSubscriptionsGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class ManageSubscriptionsGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JButton editButton = new javax.swing.JButton();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JLabel manageRenterSubscriptionLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JList<String> subscriptionList = new javax.swing.JList<String>();
    // End of variables declaration

    public ManageSubscriptionsGUI(Frontend view) {
        // assign view reference
        this.view = view;
        manageSubscriptionView();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void manageSubscriptionView() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(636, 412));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(190, 30, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 380, 170, 20);

        manageRenterSubscriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageRenterSubscriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageRenterSubscriptionLabel.setText("Manage Renter Subscription");
        add(manageRenterSubscriptionLabel);
        manageRenterSubscriptionLabel.setBounds(170, 110, 300, 30);

        subscriptionList.setBackground(new java.awt.Color(0, 0, 0));
        subscriptionList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(subscriptionList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 520, 120);

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(0, 0, 0));
        editButton.setText("Edit");
        /*
         * editButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(editButton);
        editButton.setBounds(260, 300, 120, 40);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        /*
         * dashboardButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(dashboardButton);
        dashboardButton.setBounds(560, 20, 50, 40);

        revalidate();
        repaint();
        view.pack();
    }
}
