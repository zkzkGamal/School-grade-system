
package school1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JPanel;


public class Student extends javax.swing.JFrame {

    Student_data std = new Student_data();
    /**
     * Creates new form school
     */
    public Student(){}
    public Student(String x) {
        initComponents();
        this.setSize(655, 480); 
        this.setLocationRelativeTo(null); 
        this.getContentPane().setLayout(new GridLayout(0, 1)); 
        this.setTitle("Welcome : "+x);
        std.getData(x);
        getData();
        TOT.setVisible(false);
    }
    private void getData(){
        S_name.setText(std.getFname() + ' ' + std.getLname());
        S_id.setText(std.getId());
    }
     class jPanelGradient extends JPanel {
        @Override
        protected void paintComponent (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height= getHeight();
        Color colorl = new Color (17,84,86);
        Color color2 = new Color (2, 18, 51);
        Color color3= new Color (200,49,49);
        GradientPaint gp = new GradientPaint (width,0, colorl, width, height,color2);
        g2d.setPaint (gp) ;
        
        g2d.fillRect (0, 0, width, height);
        
        
        jButton1.setBounds(width/2-60,height-100, 120, 60);
        jButton1.setBackground(color3);
        
        }
     }
             
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ARG = new javax.swing.JLabel();
        ENG = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        SSG = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel1 = new jPanelGradient();
        l1 = new javax.swing.JLabel();
        S_name = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        S_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ARGR = new javax.swing.JLabel();
        ENGR = new javax.swing.JLabel();
        MAGR = new javax.swing.JLabel();
        SCGR = new javax.swing.JLabel();
        CPGR = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        GPAG = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        SSGR = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbox = new javax.swing.JComboBox();
        TOT = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("ARABIC");

        ARG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ARG.setText("jLabel8");

        ENG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ENG.setText("jLabel10");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("S_STADIES");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("ENGLISH");

        SSG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SSG.setText("jLabel19");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(26, 154, 158));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(26, 154, 158));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        l1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Student name");

        S_name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        S_name.setForeground(new java.awt.Color(240, 240, 240));
        S_name.setText("Name");

        jButton1.setBackground(new java.awt.Color(100, 49, 49));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setText("Log out");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");

        S_id.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        S_id.setForeground(new java.awt.Color(255, 255, 255));
        S_id.setText("ID");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Courses");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grades");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arabic");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("math");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("English");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("scince");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Computer");

        ARGR.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ARGR.setForeground(new java.awt.Color(255, 255, 255));
        ARGR.setText("N/A");

        ENGR.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ENGR.setForeground(new java.awt.Color(255, 255, 255));
        ENGR.setText("N/A");

        MAGR.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MAGR.setForeground(new java.awt.Color(255, 255, 255));
        MAGR.setText("N/A");

        SCGR.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SCGR.setForeground(new java.awt.Color(255, 255, 255));
        SCGR.setText("N/A");

        CPGR.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        CPGR.setForeground(new java.awt.Color(255, 255, 255));
        CPGR.setText("N/A");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GPA");

        GPAG.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        GPAG.setForeground(new java.awt.Color(255, 255, 255));
        GPAG.setText("N/A");

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Social Staties");

        SSGR.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SSGR.setForeground(new java.awt.Color(255, 255, 255));
        SSGR.setText("N/A");

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Chose term");

        cbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"N/A", "1", "2"}));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        TOT.setBackground(new java.awt.Color(255, 255, 255));
        TOT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TOT.setForeground(new java.awt.Color(255, 255, 255));
        TOT.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addComponent(GPAG, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(S_id)
                            .addComponent(S_name))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(TOT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(ARGR)
                                .addGap(27, 27, 27)
                                .addComponent(MAGR)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(ENGR))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(SCGR))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(CPGR)
                                    .addComponent(jLabel10))))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SSGR)
                            .addComponent(jLabel21)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(S_name))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(S_id)
                    .addComponent(jLabel23)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ARGR)
                                    .addComponent(MAGR)
                                    .addComponent(ENGR)
                                    .addComponent(SCGR)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addComponent(jLabel21)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(SSGR)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(GPAG)
                            .addComponent(TOT))
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(CPGR)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        l1.setText("Student");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setTF(){
        ARGR.setText("N/A");
        MAGR.setText("N/A");
        ENGR.setText("N/A");
        SCGR.setText("N/A");
        CPGR.setText("N/A");
        SSGR.setText("N/A");
        GPAG.setText("N/A");
        TOT.setVisible(false);
    }

    
    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
      boolean check_cbox= Boolean.parseBoolean((String) cbox.getSelectedItem());
        String NA="N/A";
        String s = cbox.getSelectedItem().toString();
        if(NA.equals(cbox.getSelectedItem()) && check_cbox==false){
            setTF();
        }else {
           Student_data.getGrades(cbox.getSelectedItem().toString());
           ARGR.setText(std.getARG());
           MAGR.setText(std.getMATHG());
           ENGR.setText(std.getENG());
           SCGR.setText(std.getScienceG());
           CPGR.setText(std.getCPG());
           SSGR.setText(std.getSSG());
          switch (s) {
              case "1":
                  GPAG.setText(std.getGPA());
                  TOT.setVisible(false);
                  break;
              case "2":
                  GPAG.setText(std.TotalGPA());
                  TOT.setVisible(true);
                  break;
              default:
                  GPAG.setText("N/A");
                  break;
          }
        }
    }//GEN-LAST:event_cboxActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Student().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ARG;
    private javax.swing.JLabel ARGR;
    private javax.swing.JLabel CPGR;
    private javax.swing.JLabel ENG;
    private javax.swing.JLabel ENGR;
    private javax.swing.JLabel GPAG;
    private javax.swing.JLabel MAGR;
    private javax.swing.JLabel SCGR;
    private javax.swing.JLabel SSG;
    private javax.swing.JLabel SSGR;
    private javax.swing.JLabel S_id;
    private javax.swing.JLabel S_name;
    private javax.swing.JLabel TOT;
    private javax.swing.JComboBox cbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
