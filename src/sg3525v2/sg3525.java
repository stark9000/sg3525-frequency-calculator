/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg3525v2;

/**
 *
 * @author saliya
 */
public class sg3525 extends javax.swing.JFrame {

    private float RT = 0;
    private boolean SVR = false;

    /**
     * Creates new form sg3525
     */
    public sg3525() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ct = new javax.swing.JLabel();
        ct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rt = new javax.swing.JTextField();
        rd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cct = new javax.swing.JCheckBox();
        btn_reset = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        ctvr = new javax.swing.JSlider();
        vr = new javax.swing.JCheckBox();
        lbl_vr = new javax.swing.JLabel();
        lbl_f = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SG-3525 Frequency Calculator ");
        setResizable(false);

        lbl_ct.setText("Ct (in farad) :");

        ct.setText("0.0000000022");

        jLabel2.setText("Rt (in ohms) :");

        jLabel3.setText("Rd (in ohms) :");

        rt.setText("20000");

        rd.setText("22");

        jButton1.setText("calc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cct.setText("nF");
        cct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cctActionPerformed(evt);
            }
        });

        btn_reset.setText("reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_clear.setText("cler all");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        ctvr.setPaintLabels(true);
        ctvr.setValue(0);
        ctvr.setEnabled(false);
        ctvr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ctvrStateChanged(evt);
            }
        });

        vr.setText("vr");
        vr.setEnabled(false);
        vr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrActionPerformed(evt);
            }
        });

        lbl_vr.setText("::");

        lbl_f.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_f.setText("F:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_ct)
                                .addGap(14, 14, 14)
                                .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(16, 16, 16)
                                    .addComponent(rd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(15, 15, 15)
                                    .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_clear)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_vr, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ctvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_f, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(vr)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbl_ct))
                            .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cct))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_vr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(vr))
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_clear)
                    .addComponent(lbl_f, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calculate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cctActionPerformed
        if (cct.isSelected()) {
            lbl_ct.setText("Ct (in nF) :");
        } else {
            lbl_ct.setText("Ct (in farad) :");
        }
    }//GEN-LAST:event_cctActionPerformed

    private void ctvrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ctvrStateChanged
        RT = ctvr.getValue();
        lbl_vr.setText("" + ctvr.getValue() + " Ohms");
        calculate();
    }//GEN-LAST:event_ctvrStateChanged

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        ctvr.setValue(0);
        ctvr.setEnabled(false);
        SVR = false;
        vr.setEnabled(false);
        vr.setSelected(false);
        cct.setSelected(false);
        ct.setText("0.0000000022");
        rt.setText("20000");
        rd.setText("22");
        lbl_f.setText("F:");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        ctvr.setValue(0);
        ctvr.setEnabled(false);
        SVR = false;
        vr.setEnabled(false);
        vr.setSelected(false);
        cct.setSelected(false);
        ct.setText("0");
        rt.setText("0");
        rd.setText("0");
        lbl_f.setText("F:");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void vrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vrActionPerformed
        if (vr.isSelected()) {
            ctvr.setValue(Integer.valueOf(rt.getText()));
            ctvr.setEnabled(true);
        } else {
            ctvr.setValue(0);
            ctvr.setEnabled(false);
        }
    }//GEN-LAST:event_vrActionPerformed
    private float nFtoF(double x) {
        float f = (float) (x / 1000000000);
        //System.out.printf("%.9f", f);
        //String h = String.format("%.9f", f);
        return f;
    }

    private void calculate() {
        float CT = 0;
        if (cct.isSelected()) {
            CT = nFtoF(Float.valueOf(ct.getText()));
        } else {
            CT = Float.valueOf(ct.getText());
        }
        if (vr.isSelected()) {
            ctvr.setMaximum(Integer.valueOf(rt.getText()));
        } else {
            RT = Float.valueOf(rt.getText());
        }
        float RD = Float.valueOf(rd.getText());
        float F = (float) (1 / (CT * (0.7 * RT + 3 * RD)));
        ctvr.setMaximum(Integer.valueOf(rt.getText()));
        if (!SVR) {
            ctvr.setValue(Integer.valueOf(rt.getText()));
            SVR = true;
        }
        vr.setEnabled(true);
        lbl_f.setText((F / 1000) + " :: Khz");
//rt =18200 for 35khz
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sg3525.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new sg3525().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_reset;
    private javax.swing.JCheckBox cct;
    private javax.swing.JTextField ct;
    private javax.swing.JSlider ctvr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_ct;
    private javax.swing.JLabel lbl_f;
    private javax.swing.JLabel lbl_vr;
    private javax.swing.JTextField rd;
    private javax.swing.JTextField rt;
    private javax.swing.JCheckBox vr;
    // End of variables declaration//GEN-END:variables
}
