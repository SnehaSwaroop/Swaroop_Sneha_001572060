/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    Restaurant restaurant;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, EcoSystem ecoSystem, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = useraccount;
        this.ecosystem = ecoSystem;
        this.restaurant = restaurant;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel table = (DefaultTableModel)tblWorkRequest.getModel();
        table.setRowCount(0);
        if (restaurant.getWorkQueue().getWorkRequestList() != null) {
            for(WorkRequest request : restaurant.getWorkQueue().getWorkRequestList()) {
                if (request.getReceiver() != null && request.getReceiver().equals(userAccount)) {
                    Object row[] = new Object[5];
                    row[0] = request;
                    row[1] = request.getSender();
                    row[2] = request.getStatus();
                    row[3] = request.getRequestDate();
                    row[4] = request.getComments();
                    table.addRow(row);
                }
            }       
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Items", "Sender", "Status", "Date", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 650, 96));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRowIndex = tblWorkRequest.getSelectedRow();
         if(selectedRowIndex >=0 ) {
            WorkRequest selectedOrder = (WorkRequest) tblWorkRequest.getValueAt(selectedRowIndex, 0);
            if(selectedOrder.getStatus().equalsIgnoreCase("Delivered")) {
                 JOptionPane.showMessageDialog(null,"Order already delivered", "Warning", JOptionPane.WARNING_MESSAGE); 
            }
            else {
                ProcessWorkRequestJPanel panel = new ProcessWorkRequestJPanel(userProcessContainer, selectedOrder);
                userProcessContainer.add("ProcessWorkRequest", panel);
                CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
         }else {
           JOptionPane.showMessageDialog(null,"Please select an order to proceed", "Warning", JOptionPane.WARNING_MESSAGE); 
        } 
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
