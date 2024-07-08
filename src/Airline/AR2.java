/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Airline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hetro
 */
public class AR2 extends javax.swing.JFrame {

    String location;
    String destination;
    String fares;

    

    /**
     * Creates new form AR2
     */
    public AR2() throws ParseException {

        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        if (temp.tempDestination != null && temp.tempLocation != null) {
            location = temp.tempLocation;
            destination = temp.tempDestination;
        }

        fares = temp.tempFares;

        box1.setSelectedItem(location);
        box2.setSelectedItem(destination);

        if (fares == "Regular Fares") {
            b1.setSelected(true);
        } else if (fares == "Armed Force Fares") {
            b2.setSelected(true);
        } else if (fares == "Student Fares") {
            b3.setSelected(true);
        } else if (fares == "Senior Citizen Fares") {
            b4.setSelected(true);
        }
        
        try{
            
        SimpleDateFormat formatter = new SimpleDateFormat("MMM d, y");
        Date d=new Date();
        
        d=formatter.parse(temp.tempDate);
        date.setDate(d);
        }
        catch(Exception e)
        {
            
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        box2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        tb = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setText("From");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 280, 120, 16);

        box1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Ahemdabad", "Mumbai", "Bengaluru", "Chennai", "Kolkata", "Goa", "Pune", " " }));
        box1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        jPanel1.add(box1);
        box1.setBounds(220, 270, 310, 140);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("To");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(890, 280, 37, 16);

        box2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahemdabad", "Delhi", "Mumbai", "Bengaluru", "Chennai", "Kolkata", "Goa", "Pune", " ", " " }));
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });
        jPanel1.add(box2);
        box2.setBounds(880, 270, 310, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Airline/images/aero 2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(670, 220, 200, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Airline/images/143-1439987_airplane-free-to-use-clip-art-airplane-front-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, -30, 880, 240);

        b2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(b2);
        b2.setText("Armed Force Fares");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(650, 540, 130, 60);

        b3.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(b3);
        b3.setText("Student Fares");
        jPanel1.add(b3);
        b3.setBounds(800, 540, 110, 60);

        b4.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(b4);
        b4.setText("Senior Citizen Fares");
        jPanel1.add(b4);
        b4.setBounds(930, 540, 140, 60);

        b1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(b1);
        b1.setSelected(true);
        b1.setText("Regular Fares");
        jPanel1.add(b1);
        b1.setBounds(510, 540, 120, 60);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Select A Fare Type :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 540, 400, 80);

        tb.setBackground(new java.awt.Color(102, 255, 102));
        tb.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        tb.setText("Search");
        tb.setOpaque(true);
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jPanel1.add(tb);
        tb.setBounds(750, 630, 190, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Airline/images/button-removebg-preview.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 50, 50, 70);

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 530, 600, 80);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Select Date :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 460, 170, 28);
        jPanel1.add(date);
        date.setBounds(490, 460, 220, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Airline/images/aero 1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 310, 240, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 1380, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Account p1 = new Account();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked

        b1.setActionCommand("Regular Fares");
        b2.setActionCommand("Armed Force Fares");
        b3.setActionCommand("Student Fares");
        b4.setActionCommand("Senior Citizen Fares");

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
        

        fares = buttonGroup1.getSelection().getActionCommand();
        location = (String) box1.getSelectedItem();
        destination = (String) box2.getSelectedItem();

        try {
            date.getDate();
            if (!box1.getSelectedItem().equals(box2.getSelectedItem())) {
                if (d.compareTo(date.getDate()) < 0) {
                   
                    
                    try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "");
            Statement s = con.createStatement();

            String u = location;
            String p = destination;
            String dt = ((JTextField) date.getDateEditor().getUiComponent()).getText();
            
     
            
            ResultSet rs = s.executeQuery("SELECT * FROM flight WHERE Location='" + u + "' AND Destination='" + p + "' AND Date='" + dt + "'");
            
            
            if(rs.next()!=false)
            {
                temp.tempLocation = location;
                temp.tempDestination = destination;
                temp.tempFares = fares;
                temp.tempDate = ((JTextField) date.getDateEditor().getUiComponent()).getText();
                    
                    AvailFlight pt = new AvailFlight();
                    pt.setVisible(true);
                    dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "No Any Flight are Available");
            }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
                    
           } else {
                    JOptionPane.showMessageDialog(this, "Please Select Valid Date");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Your Location and Destination is same");

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please Select A Date");
        }


    }//GEN-LAST:event_tbMouseClicked

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                
                try {
                    new AR2().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(AR2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton tb;
    // End of variables declaration//GEN-END:variables
}
