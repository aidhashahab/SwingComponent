public class ComboExperiment extends javax.swing.JFrame {

    Pulau[] pulaus;

    public ComboExperiment() {
        initPulau();
        initComponents();
    }

    public void initPulau() {
        Pulau sumatera = new Pulau("Sumatera", " Pulau bagian barat Indonesia");
        Pulau jawa = new Pulau("Jawa ", "Pulau selatan Indonesia");
        Pulau kalimantan = new Pulau("Kalimantan", " Pulau terbesar di Indonesia");
        Pulau irian = new Pulau("Irian", " Pulau timur di Indonesia");
        pulaus = new Pulau[]{sumatera, jawa, kalimantan, irian};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kategoriCombo = new javax.swing.JComboBox<>();
        copyTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pulauCombo = new javax.swing.JComboBox<>(pulaus);
        pulauTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kategoriCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tanaman", "hewan", "artis", "negara" }));
        kategoriCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriComboActionPerformed(evt);
            }
        });

        copyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Pilih Kategori");

        pulauCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulauComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kategoriCombo, 0, 183, Short.MAX_VALUE)
                        .addComponent(copyTextField))
                    .addComponent(pulauCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulauTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(copyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pulauCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pulauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyTextFieldActionPerformed

    private void kategoriComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriComboActionPerformed

        String terpilih = (String) kategoriCombo.getSelectedItem();
        copyTextField.setText(terpilih);

    }//GEN-LAST:event_kategoriComboActionPerformed

    private void pulauComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulauComboActionPerformed
        Pulau terpilihLagi = (Pulau) pulauCombo.getSelectedItem();
        pulauTextField.setText(terpilihLagi.getDescribtion());

    }//GEN-LAST:event_pulauComboActionPerformed

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
            java.util.logging.Logger.getLogger(ComboExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboExperiment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboExperiment().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField copyTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> kategoriCombo;
    private javax.swing.JComboBox<Pulau> pulauCombo;
    private javax.swing.JTextField pulauTextField;
    // End of variables declaration//GEN-END:variables
}
