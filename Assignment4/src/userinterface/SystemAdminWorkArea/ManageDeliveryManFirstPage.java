/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snehaswaroop
 */
public class ManageDeliveryManFirstPage extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant restaurant;
    
    public ManageDeliveryManFirstPage(JPanel userprocesscontainer, EcoSystem ecosystem) {
        this.userProcessContainer = userprocesscontainer;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        initComponents();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel table = (DefaultTableModel)tblRestaurant.getModel();
        table.setRowCount(0);
        if (ecosystem.getRestaurantDirectory().getRestaurantList() != null) {
            for(Restaurant restaurant : ecosystem.getRestaurantDirectory().getRestaurantList()) {
                Object row[] = new Object[2];
                row[0] = restaurant;
                row[1] = restaurant.getRestaurantId();
                table.addRow(row);
            }       
        }
       
    }
    public void populateDeliveryManTable(Restaurant restaurant) {
        DefaultTableModel table = (DefaultTableModel)tblDeliveryMan.getModel();
        table.setRowCount(0);
        for(DeliveryMan man : restaurant.getDeliveryManList()) {
            Object row[] = new Object[3];
            row[0] = man;
            row[1] = man.getPhoneNumber();
            row[2] = man.getAddress();
            table.addRow(row); 
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
        tblRestaurant = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnViewDeliveryMan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Delivery Man");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Restaurant Name", "Restaurant ID"
            }
        ));
        jScrollPane1.setViewportView(tblRestaurant);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel2.setText("Select Restaurant");

        btnViewDeliveryMan.setText("View Delivery Men");
        btnViewDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDeliveryManActionPerformed(evt);
            }
        });

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Phone Number", "Address"
            }
        ));
        jScrollPane2.setViewportView(tblDeliveryMan);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(137, 137, 137))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnViewDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewDeliveryMan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRestaurant.getSelectedRow();
           if (selectedRowIndex<0){
               JOptionPane.showMessageDialog(null,"Please select a restaurant", "Warning", JOptionPane.WARNING_MESSAGE); 
           }
           else {
                Restaurant restaurant = (Restaurant) tblRestaurant.getValueAt(selectedRowIndex, 0);
                AddNewDeliveryManPanel panel = new AddNewDeliveryManPanel(userProcessContainer, restaurant, ecosystem);
                userProcessContainer.add("CreateDeliveryMan", panel);
                CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
                layout.next(userProcessContainer);
           }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
          if (selectedRow<0){  
              JOptionPane.showMessageDialog(null,"Please select a DeliveryMan to Modify", "Warning", JOptionPane.WARNING_MESSAGE);
          }
          else {
            DeliveryMan selectedDeliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            ModifyDeliveryManPanel panel = new ModifyDeliveryManPanel(userProcessContainer, ecosystem, selectedDeliveryMan);
            userProcessContainer.add("ViewDeliveryMan", panel);
            CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
            layout.next(userProcessContainer);
          }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnViewDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDeliveryManActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurant.getSelectedRow();
            if (selectedRow<0){
             JOptionPane.showMessageDialog(null,"Please select a Restaurant", "Warning", JOptionPane.WARNING_MESSAGE); 
            }
            else {
                Restaurant selectedRestaurant = (Restaurant) tblRestaurant.getValueAt(selectedRow, 0);
                populateDeliveryManTable(selectedRestaurant);
            }
            
    }//GEN-LAST:event_btnViewDeliveryManActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a DeliveryMan to Delete", "Warning", JOptionPane.WARNING_MESSAGE); 
        }
        else {
            DeliveryMan selectedDeliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            Restaurant restaurant = this.ecosystem.getRestaurantDirectory().getRestaurantByDeliveryMan(selectedDeliveryMan.getUserAccount());       //Find restaurant of Delivery Man
            restaurant.getDeliveryManList().remove(selectedDeliveryMan);        //Delete deliveryman account from Restaurant
            this.ecosystem.getDeliveryManDirectory().getDeliveryManList().remove(selectedDeliveryMan);      //Delete DeliveryMan account from Ecosystem
            this.ecosystem.getUserAccountDirectory().deleteUser(selectedDeliveryMan.getUserAccount().getUsername());    //Delete User Account of Delivery man
            JOptionPane.showMessageDialog(null, "Deleted the selected Delivery Man successfully");
            populateDeliveryManTable(restaurant);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurant.getSelectedRow();
        Restaurant selectedRestaurant = (Restaurant) tblRestaurant.getValueAt(selectedRow, 0);
        populateDeliveryManTable(selectedRestaurant);
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDeliveryMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTable tblRestaurant;
    // End of variables declaration//GEN-END:variables
}
