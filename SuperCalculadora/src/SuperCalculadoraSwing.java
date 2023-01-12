/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Franklin
 */
public class SuperCalculadoraSwing extends javax.swing.JFrame {

    /**
     * Creates new form SuperCalculadoraSwing
     */
    public SuperCalculadoraSwing() {
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

        txtNum = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblResto = new javax.swing.JLabel();
        lblEleCu = new javax.swing.JLabel();
        lblRaizQua = new javax.swing.JLabel();
        lblRaizCu = new javax.swing.JLabel();
        lblValAbs = new javax.swing.JLabel();
        txtResto = new javax.swing.JLabel();
        txtEleCu = new javax.swing.JLabel();
        txtRaizQua = new javax.swing.JLabel();
        txtRaizCu = new javax.swing.JLabel();
        txtValorAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNum.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        jLabel1.setText("Informe um valor:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtEleCu.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtResto)
                    .addComponent(txtRaizQua)
                    .addComponent(txtEleCu)
                    .addComponent(txtRaizCu)
                    .addComponent(txtValorAbs))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResto)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValAbs)
                                    .addComponent(lblRaizCu)
                                    .addComponent(lblRaizQua)
                                    .addComponent(lblEleCu))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnCalcular)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnCalcular))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResto)
                    .addComponent(txtResto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEleCu)
                    .addComponent(txtEleCu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaizQua)
                    .addComponent(txtRaizQua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRaizCu)
                        .addGap(18, 18, 18)
                        .addComponent(lblValAbs))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRaizCu)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorAbs)))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int numerador = Integer.parseInt( txtNum.getValue().toString());
        int restoDivisao = numerador % 2;
        float elevadoCubo = (float) Math.pow(numerador, 3);
        float raizQuadrada = (float) Math.sqrt(numerador);
        float raizCubica = (float) Math.cbrt(numerador);
        int valorAbsoluto = (int) Math.abs(numerador);
        lblResto.setText(Integer.toString(restoDivisao));
        txtResto.setText("Resto da Divisão por 2");
        lblEleCu.setText(Float.toString(elevadoCubo));
        txtEleCu.setText("Elevada ao Cubo");
        lblRaizQua.setText(Float.toString(raizQuadrada));
        txtRaizQua.setText("Raiz Quadrada");
        lblRaizCu.setText(Float.toString(raizCubica));
        txtRaizCu.setText("Raiz Cubica");
        lblValAbs.setText(Integer.toString(valorAbsoluto));
        txtValorAbs.setText("Valor Absoluto");
 
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCalculadoraSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEleCu;
    private javax.swing.JLabel lblRaizCu;
    private javax.swing.JLabel lblRaizQua;
    private javax.swing.JLabel lblResto;
    private javax.swing.JLabel lblValAbs;
    private javax.swing.JLabel txtEleCu;
    private javax.swing.JSpinner txtNum;
    private javax.swing.JLabel txtRaizCu;
    private javax.swing.JLabel txtRaizQua;
    private javax.swing.JLabel txtResto;
    private javax.swing.JLabel txtValorAbs;
    // End of variables declaration//GEN-END:variables
}