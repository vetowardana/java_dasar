/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import config.GlobalVar;

/**
 *
 * @author me
 */
public class CalculatorSuhu extends javax.swing.JFrame implements GlobalVar{

    /**
     * Creates new form CalculatorSuhu
     */
    public CalculatorSuhu() {
        initComponents();
    }
    
    String angka = "";
    String jenisSuhu1 = "";
    String jenisSuhu2 = "";
    double hasil,suhux = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        Awal = new javax.swing.JTextField();
        Akhir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelAwal = new javax.swing.JLabel();
        LabelAkhir = new javax.swing.JLabel();
        Angka2 = new javax.swing.JButton();
        Angka1 = new javax.swing.JButton();
        Angka3 = new javax.swing.JButton();
        Angka4 = new javax.swing.JButton();
        Angka5 = new javax.swing.JButton();
        Angka6 = new javax.swing.JButton();
        Angka7 = new javax.swing.JButton();
        Angka8 = new javax.swing.JButton();
        Angka9 = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        Angka0 = new javax.swing.JButton();
        C_F = new javax.swing.JButton();
        F_C = new javax.swing.JButton();
        C_K = new javax.swing.JButton();
        K_C = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Konversi Suhu");
        setPreferredSize(new java.awt.Dimension(450, 500));

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 500));

        Judul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("APLIKASI KONVERSI SUHU");

        Awal.setEditable(false);

        Akhir.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Suhu :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Suhu :");

        LabelAwal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelAwal.setText("Awal");

        LabelAkhir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelAkhir.setText("Akhir");

        Angka2.setBackground(new java.awt.Color(0, 204, 255));
        Angka2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka2.setForeground(new java.awt.Color(255, 255, 255));
        Angka2.setText("2");
        Angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka2ActionPerformed(evt);
            }
        });

        Angka1.setBackground(new java.awt.Color(0, 204, 255));
        Angka1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka1.setForeground(new java.awt.Color(255, 255, 255));
        Angka1.setText("1");
        Angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka1ActionPerformed(evt);
            }
        });

        Angka3.setBackground(new java.awt.Color(0, 204, 255));
        Angka3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka3.setForeground(new java.awt.Color(255, 255, 255));
        Angka3.setText("3");
        Angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka3ActionPerformed(evt);
            }
        });

        Angka4.setBackground(new java.awt.Color(0, 204, 255));
        Angka4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka4.setForeground(new java.awt.Color(255, 255, 255));
        Angka4.setText("4");
        Angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka4ActionPerformed(evt);
            }
        });

        Angka5.setBackground(new java.awt.Color(0, 204, 255));
        Angka5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka5.setForeground(new java.awt.Color(255, 255, 255));
        Angka5.setText("5");
        Angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka5ActionPerformed(evt);
            }
        });

        Angka6.setBackground(new java.awt.Color(0, 204, 255));
        Angka6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka6.setForeground(new java.awt.Color(255, 255, 255));
        Angka6.setText("6");
        Angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka6ActionPerformed(evt);
            }
        });

        Angka7.setBackground(new java.awt.Color(0, 204, 255));
        Angka7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka7.setForeground(new java.awt.Color(255, 255, 255));
        Angka7.setText("7");
        Angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka7ActionPerformed(evt);
            }
        });

        Angka8.setBackground(new java.awt.Color(0, 204, 255));
        Angka8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka8.setForeground(new java.awt.Color(255, 255, 255));
        Angka8.setText("8");
        Angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka8ActionPerformed(evt);
            }
        });

        Angka9.setBackground(new java.awt.Color(0, 204, 255));
        Angka9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka9.setForeground(new java.awt.Color(255, 255, 255));
        Angka9.setText("9");
        Angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka9ActionPerformed(evt);
            }
        });

        AC.setBackground(new java.awt.Color(255, 0, 0));
        AC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AC.setForeground(new java.awt.Color(255, 255, 255));
        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        Angka0.setBackground(new java.awt.Color(0, 204, 255));
        Angka0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Angka0.setForeground(new java.awt.Color(255, 255, 255));
        Angka0.setText("0");
        Angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka0ActionPerformed(evt);
            }
        });

        C_F.setBackground(new java.awt.Color(255, 204, 0));
        C_F.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C_F.setForeground(new java.awt.Color(255, 255, 255));
        C_F.setText("Celcius -> Fahrenheit");
        C_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_FActionPerformed(evt);
            }
        });

        F_C.setBackground(new java.awt.Color(255, 204, 0));
        F_C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        F_C.setForeground(new java.awt.Color(255, 255, 255));
        F_C.setText("Fahrenheit -> Celcius");
        F_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_CActionPerformed(evt);
            }
        });

        C_K.setBackground(new java.awt.Color(255, 204, 0));
        C_K.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C_K.setForeground(new java.awt.Color(255, 255, 255));
        C_K.setText("Celcius -> Kelvin");
        C_K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_KActionPerformed(evt);
            }
        });

        K_C.setBackground(new java.awt.Color(255, 204, 0));
        K_C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        K_C.setForeground(new java.awt.Color(255, 255, 255));
        K_C.setText("Kelvin -> Celcius");
        K_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Awal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Angka7)
                            .addComponent(Angka4)
                            .addComponent(Angka1)
                            .addComponent(AC))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Angka6)
                                    .addComponent(Angka9)
                                    .addComponent(Angka0)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Angka2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Angka3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Angka8)
                                    .addComponent(Angka5))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelAwal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Akhir)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelAkhir)
                        .addGap(104, 104, 104))
                    .addComponent(C_F, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(F_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(K_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Judul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Judul)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(LabelAwal)
                    .addComponent(LabelAkhir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Awal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Akhir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_F))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_C))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_K))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K_C))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka2ActionPerformed
        // TODO add your handling code here:
        angka += "2";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka2ActionPerformed

    private void Angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka1ActionPerformed
        // TODO add your handling code here:
        angka += "1";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka1ActionPerformed

    private void Angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka3ActionPerformed
        // TODO add your handling code here:
        angka += "3";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka3ActionPerformed

    private void Angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka4ActionPerformed
        // TODO add your handling code here:
        angka += "4";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka4ActionPerformed

    private void Angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka5ActionPerformed
        // TODO add your handling code here:
        angka += "5";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka5ActionPerformed

    private void Angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka6ActionPerformed
        // TODO add your handling code here:
        angka += "6";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka6ActionPerformed

    private void Angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka7ActionPerformed
        // TODO add your handling code here:
        angka += "7";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka7ActionPerformed

    private void Angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka8ActionPerformed
        // TODO add your handling code here:
        angka += "8";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka8ActionPerformed

    private void Angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka9ActionPerformed
        // TODO add your handling code here:
        angka += "9";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka9ActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        // TODO add your handling code here:
        Awal.setText(null);
        Akhir.setText(null);
        LabelAwal.setText("Awal");
        LabelAkhir.setText("Akhir");
        angka = "";
    }//GEN-LAST:event_ACActionPerformed

    private void Angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
        Awal.setText(angka);
    }//GEN-LAST:event_Angka0ActionPerformed

    private void C_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_FActionPerformed
        // TODO add your handling code here:
        String suhu_awal = Awal.getText();
        String jenisSuhu1 = "Celcius";
        String jenisSuhu2 = "Fahrenheit";
        suhux = Double.parseDouble(suhu_awal);
        hasil = 1.8 * suhux + 32;
        angka = Double.toString(hasil);
        
        this.celciusFahrenheit(jenisSuhu1, jenisSuhu2, angka);
        
//        Akhir.setText(angka);
//        LabelAwal.setText(jenisSuhu1);
//        LabelAkhir.setText(jenisSuhu2);
    }//GEN-LAST:event_C_FActionPerformed

    private void F_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_CActionPerformed
        // TODO add your handling code here:
        String suhu_awal = Awal.getText();
        String jenisSuhu1 = "Fahrenheit";
        String jenisSuhu2 = "Celcius";
        suhux = Double.parseDouble(suhu_awal);
        hasil = 0.556 * (suhux - 32);
        angka = Double.toString(hasil);
        
        this.FahrenheitCelcius(jenisSuhu1, jenisSuhu2, angka);
//        Akhir.setText(angka);
//        LabelAwal.setText(jenisSuhu1);
//        LabelAkhir.setText(jenisSuhu2);
    }//GEN-LAST:event_F_CActionPerformed

    private void C_KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_KActionPerformed
        // TODO add your handling code here:
        String suhu_awal = Awal.getText();
        String jenisSuhu1 = "Celcius";
        String jenisSuhu2 = "Kelvin";
        suhux = Double.parseDouble(suhu_awal);
        hasil = suhux + 273;
        angka = Double.toString(hasil);
        
        this.celciusKelvin(jenisSuhu1, jenisSuhu2, angka);
        
//        Akhir.setText(angka);
//        LabelAwal.setText(jenisSuhu1);
//        LabelAkhir.setText(jenisSuhu2);
    }//GEN-LAST:event_C_KActionPerformed

    private void K_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_CActionPerformed
        // TODO add your handling code here:
        String suhu_awal = Awal.getText();
        String jenisSuhu1 = "Kelvin";
        String jenisSuhu2 = "Celcius";
        suhux = Double.parseDouble(suhu_awal);
        hasil = suhux - 273;
        angka = Double.toString(hasil);
        
        this.KelvinCelcius(jenisSuhu1, jenisSuhu2, angka);
        
//        Akhir.setText(angka);
//        LabelAwal.setText(jenisSuhu1);
//        LabelAkhir.setText(jenisSuhu2);
    }//GEN-LAST:event_K_CActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JTextField Akhir;
    private javax.swing.JButton Angka0;
    private javax.swing.JButton Angka1;
    private javax.swing.JButton Angka2;
    private javax.swing.JButton Angka3;
    private javax.swing.JButton Angka4;
    private javax.swing.JButton Angka5;
    private javax.swing.JButton Angka6;
    private javax.swing.JButton Angka7;
    private javax.swing.JButton Angka8;
    private javax.swing.JButton Angka9;
    private javax.swing.JTextField Awal;
    private javax.swing.JButton C_F;
    private javax.swing.JButton C_K;
    private javax.swing.JButton F_C;
    private javax.swing.JLabel Judul;
    private javax.swing.JButton K_C;
    private javax.swing.JLabel LabelAkhir;
    private javax.swing.JLabel LabelAwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void celciusFahrenheit(String jenis1, String jenis2, String suhu) {
        String x = jenis1;
        String y = jenis2;
        String z = suhu;
        
        Akhir.setText(z);
        LabelAwal.setText(x);
        LabelAkhir.setText(y);
    }

    @Override
    public void FahrenheitCelcius(String jenis1, String jenis2, String suhu) {
        String x = jenis1;
        String y = jenis2;
        String z = suhu;
        
        Akhir.setText(z);
        LabelAwal.setText(x);
        LabelAkhir.setText(y);
    }

    @Override
    public void celciusKelvin(String jenis1, String jenis2, String suhu) {
        String x = jenis1;
        String y = jenis2;
        String z = suhu;
        
        Akhir.setText(z);
        LabelAwal.setText(x);
        LabelAkhir.setText(y);
    }

    @Override
    public void KelvinCelcius(String jenis1, String jenis2, String suhu) {
        String x = jenis1;
        String y = jenis2;
        String z = suhu;
        
        Akhir.setText(z);
        LabelAwal.setText(x);
        LabelAkhir.setText(y);
    }
}
