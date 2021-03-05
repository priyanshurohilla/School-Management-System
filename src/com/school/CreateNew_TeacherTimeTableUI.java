/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author priya
 */
public class CreateNew_TeacherTimeTableUI extends javax.swing.JFrame {
private TimetableManager tm;  
    /**
     * Creates new form CreateNew_TeacherTimeTable
     */
    public CreateNew_TeacherTimeTableUI(int Flagchecker, TimetableManager t2) {
        this.tm=t2;
        initComponents();
        flags =Flagchecker;
        if(flags==1)
            jLabel2.setText("Class");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCreateTimetable2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Save2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CreateNew");

        jPanel2.setBackground(new java.awt.Color(104, 104, 104));

        lblCreateTimetable2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCreateTimetable2.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateTimetable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTimetable2.setText("CREATE NEW TIMETABLE");
        lblCreateTimetable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("TeacherID:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Monday", null, null, null, null, "R", null, null, null, null},
                {"Tuesday", null, null, null, null, "E", null, null, null, null},
                {"Wednesday", null, null, null, null, "C", null, null, null, null},
                {"Thursday", null, null, null, null, "E", null, null, null, null},
                {"Friday", null, null, null, null, "S", null, null, null, null},
                {"Saturday", null, null, null, null, "S", null, null, null, null}
            },
            new String [] {
                "", "Period 1", "Period 2", "Period 3", "Period 4", "", "Period 5", "Period 6", "Period 7", "Period 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        Save2.setText("Save");
        Save2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateTimetable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 465, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(Save2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateTimetable2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Save2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public int flags;
      
    private void Save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save2ActionPerformed
        // TODO add your handling code here:
        jTable2.getCellEditor().stopCellEditing();
        String[][] d= new String[6][10];
        if( jTextField2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(CreateNew_TeacherTimeTableUI.this, "Invalid Save");
        }
        else{
            String teacherid_Class = jTextField2.getText().trim();
            String file = ("teacher timetable.csv");
            if(flags==1)
                file= ("student timetable.csv");
            
           
                
                
                for(int i=0;i<jTable2.getRowCount();i++){
                    for(int j=0;j<jTable2.getColumnCount();j++){
                        Object filObject = jTable2.getValueAt(i, j);
                        String fil = (filObject == null) ? "" : filObject.toString();
                        d[i][j]=fil;
                        
                           
                    }
                    
                }
               Timetable t = new Timetable(d,teacherid_Class);
               
               if(tm.createnew(t, file))
               {
                   JOptionPane.showMessageDialog(CreateNew_TeacherTimeTableUI.this, "Saved Successfully");
               
               }
               else
                   JOptionPane.showMessageDialog(CreateNew_TeacherTimeTableUI.this, "Save Failed");
            }
            
    }//GEN-LAST:event_Save2ActionPerformed
private DefaultTableModel model;
    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateNew_TeacherTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNew_TeacherTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNew_TeacherTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNew_TeacherTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
         
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
                
            //    CreateNew_TeacherTimeTable c = new CreateNew_TeacherTimeTable(0);
               
            //    c.setVisible(true);
                
                       /*Object [][] data ={
                {"Monday", null, null, null, null, "R", null, null, null, null},
                {"Tuesday", null, null, null, null, "E", null, null, null, null},
                {"Wednesday", null, null, null, null, "C", null, null, null, null},
                {"Thursday", null, null, null, null, "E", null, null, null, null},
                {"Friday", null, null, null, null, "S", null, null, null, null},
                {"Saturday", null, null, null, null, "S", null, null, null, null}
            };
               String [] column={
                "", "Period 1", "Period 2", "Period 3", "Period 4", "", "Period 5", "Period 6", "Period 7", "Period 8"
            } ;
                c.model = (DefaultTableModel)c.jTable2.getModel();
                String[] lines ={"Monday", "","","",};
                c.model.addRow(lines);
                c.jTable2.setModel(c.model);
                */
          
                        
                    
         //   }
      //  });
   // }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCreateTimetable2;
    // End of variables declaration//GEN-END:variables
}