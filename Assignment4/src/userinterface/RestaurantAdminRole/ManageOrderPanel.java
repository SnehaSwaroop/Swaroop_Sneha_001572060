/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snehaswaroop
 */
public class ManageOrderPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Restaurant restaurant;

    /**
     * Creates new form ManageOrderPanel
     */
    public ManageOrderPanel(JPanel upc, Restaurant r) {
        initComponents();
        this.userProcessContainer = upc;
        this.restaurant = r;
        populateOrdersTable();
        populateDeliveryMenTable();
    }
    
    public void populateOrdersTable() {
         DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
        model.setRowCount(0);
        //int count = 1;
        //Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
        if (restaurant.getWorkQueue().getWorkRequestList() != null) {
            for(WorkRequest request : restaurant.getWorkQueue().getWorkRequestList()) {
                Object row[] = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                row[4] = request.getComments();
                model.addRow(row); 
                //count++;
            }       
        }
       
    }
    
    public void populateDeliveryMenTable() {
         DefaultTableModel model = (DefaultTableModel)tblMan.getModel();
        model.setRowCount(0);
        //int count = 1;
        //Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
        if (restaurant.getDeliveryManList() != null) {
            for(DeliveryMan man : restaurant.getDeliveryManList()) {
                Object row[] = new Object[2];
                row[0] = man;
                row[1] = man.getPhoneNumber();
                model.addRow(row); 
                //count++;
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMan = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Sender", "Status", "Date", "Comments"
            }
        ));
        jScrollPane1.setViewportView(tblOrders);

        tblMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Delivery Man Name", "Phone Number"
            }
        ));
        jScrollPane2.setViewportView(tblMan);

        btnAssign.setText("Assign Order");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedOrderRow = tblOrders.getSelectedRow();
        int selectedDeliveryManRow = tblMan.getSelectedRow();

        if (selectedOrderRow >= 0 && selectedDeliveryManRow >= 0){
            WorkRequest selectedOrder = (WorkRequest) tblOrders.getValueAt(selectedOrderRow, 0);
            DeliveryMan selectedDeliveryMan = (DeliveryMan) tblMan.getValueAt(selectedDeliveryManRow, 0);
            
             if (selectedOrder.getStatus().equals("Delivered")) {
                JOptionPane.showMessageDialog(null,"Cannot Assign delivered order to a delivery man", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                //Assigning Delivery Man now
                selectedOrder.setReceiver(selectedDeliveryMan.getUserAccount());

                JOptionPane.showMessageDialog(null, "Assigned order");
                populateOrdersTable(); //Repopulate the orders again
             }
        } else {
           JOptionPane.showMessageDialog(null,"Please select an Order and a Delivery Man", "Warning", JOptionPane.WARNING_MESSAGE); 
        } 
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMan;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
