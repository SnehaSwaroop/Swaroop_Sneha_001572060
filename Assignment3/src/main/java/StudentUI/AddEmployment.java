/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentUI;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistory;
import info5100.university.example.Persona.StudentProfile;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import LoginUI.LoginScreen;

/**
 *
 * @author snehaswaroop
 */
public class AddEmployment extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployment
     */
    EmploymentHistory employ;
    StudentProfile studentdata;
    JPanel mainWorkArea;
    Department d;
    EmploymentHistory info;
    List<CourseOffer> list;

    public AddEmployment(JPanel mainWorkArea, StudentProfile studentdata, Department d) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.studentdata = studentdata;
        this.d = d;
        this.studentdata = studentdata;
        this.employ = studentdata.getEmploymenthistory();

        this.list = studentdata.getTranscript().getCourses();
        JPanel panel = new JPanel();
        course1.setText(list.get(0).getCourseName());
        course2.setText(list.get(1).getCourseName());
        course3.setText(list.get(2).getCourseName());
        course4.setText(list.get(3).getCourseName());
        course5.setText(list.get(4).getCourseName());
        course6.setText(list.get(5).getCourseName());
        course7.setText(list.get(6).getCourseName());
        course8.setText(list.get(7).getCourseName());
        

        panel.add(course1);
        panel.add(course2);
        panel.add(course3);
        panel.add(course4);
        panel.add(course5);
        panel.add(course6);
        panel.add(course7);
        panel.add(course8);
        this.add(panel);

    }

//    AddEmployment(JPanel mainWorkArea, StudentProfile studentdata, Department d) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddEmp = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblRanking = new javax.swing.JLabel();
        txtRanking = new javax.swing.JTextField();
        lblSubject = new javax.swing.JLabel();
        course1 = new javax.swing.JCheckBox();
        course2 = new javax.swing.JCheckBox();
        course3 = new javax.swing.JCheckBox();
        course4 = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        course5 = new javax.swing.JCheckBox();
        course7 = new javax.swing.JCheckBox();
        course6 = new javax.swing.JCheckBox();
        course8 = new javax.swing.JCheckBox();

        lblAddEmp.setFont(new java.awt.Font("Lucida Grande", 2, 16)); // NOI18N
        lblAddEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddEmp.setText("Add Employment Details");

        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompany.setText("Company");

        lblPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosition.setText("Position");

        lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalary.setText("Salary");

        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRanking.setText("Company Ranking");

        lblSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubject.setText("Relevant Subjects");

        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });

        btnSave.setText("Submit");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        course6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                .addComponent(txtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(course4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(course1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(course5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(course3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(course6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCompany)
                                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPosition)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSalary)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRanking)
                                    .addComponent(txtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(course2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(course5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(course1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(course6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(course4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(course3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_course1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        ArrayList<CourseOffer> coList = new ArrayList<>();
        if (course1.isSelected()) {
            coList.add(list.get(0));
        }
        if (course2.isSelected()) {
            coList.add(list.get(1));
        }
        if (course3.isSelected()) {
            coList.add(list.get(2));
        }
        if (course4.isSelected()) {
            coList.add(list.get(3));
        }
        if (course5.isSelected()) {
            coList.add(list.get(4));
        }
        if (course6.isSelected()) {
            coList.add(list.get(5));
        }
        if (course7.isSelected()) {
            coList.add(list.get(6));
        }
        if (course8.isSelected()) {
            coList.add(list.get(7));
        }
        
        Double sal = 0d;
        try{
             sal= Double.parseDouble(txtSalary.getText());
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please enter salary in numeric");
             return;
        }
        
        int rank = 0;
        try{
             rank = Integer.parseInt(txtRanking.getText());
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please enter ranking in numeric");
             return;
        }
        studentdata.getEmploymenthistory().getEmployments().add(new Employment(coList, txtPosition.getText(), sal, new EmployerProfile(txtCompany.getText(), rank)));
        JOptionPane.showMessageDialog(this, "Employment Information Saved");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[0];
        mainWorkArea.remove(componentArray[componentArray.length - 1]);
        LoginScreen loginPanel = (LoginScreen) component;
        loginPanel.populateRoleCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void course6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course6ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[0];
        LoginScreen loginPanel = (LoginScreen) component;
        loginPanel.populateRoleCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox course1;
    private javax.swing.JCheckBox course2;
    private javax.swing.JCheckBox course3;
    private javax.swing.JCheckBox course4;
    private javax.swing.JCheckBox course5;
    private javax.swing.JCheckBox course6;
    private javax.swing.JCheckBox course7;
    private javax.swing.JCheckBox course8;
    private javax.swing.JLabel lblAddEmp;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtRanking;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
