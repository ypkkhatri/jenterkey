package com.screen.key.jenterkey;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yougeshwar
 */
public class JEnterKey extends javax.swing.JFrame {

    private Robot robot;

    public JEnterKey() {
        initComponents();
        init();
    }

    private void init() {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(JEnterKey.class.getName()).log(Level.SEVERE, null, ex);
        }

        MouseAdapter ma = new MouseAdapter() {
            int lastX, lastY;

            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getXOnScreen();
                lastY = e.getYOnScreen();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                // Move frame by the mouse delta
                setLocation(getLocationOnScreen().x + x - lastX,
                        getLocationOnScreen().y + y - lastY);
                lastX = x;
                lastY = y;
            }
        };
        moveLabel.addMouseListener(ma);
        moveLabel.addMouseMotionListener(ma);

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        moveLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(100, 70));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(100, 70));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 70));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(380, 20));
        jPanel1.setLayout(new java.awt.BorderLayout());

        moveLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        moveLabel.setText(" Move");
        moveLabel.setToolTipText("Move");
        moveLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.add(moveLabel, java.awt.BorderLayout.CENTER);

        exitLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        exitLabel.setText(" X ");
        exitLabel.setToolTipText("Exit");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel1.add(exitLabel, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Enter");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // For mac
        toBack();
    }//GEN-LAST:event_formWindowStateChanged

    @Override
    public void toFront() {
        // For mac
        // Do nothing
        // super.toFront();
    }

    @Override
    public void requestFocus() {
        // For mac
        // Do nothing
        // super.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel moveLabel;
    // End of variables declaration//GEN-END:variables
}
