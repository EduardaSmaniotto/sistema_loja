/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author eduar
 */
public class FrmConjuntos extends javax.swing.JFrame {

    /**
     * Creates new form FrmConjuntos
     */
    public FrmConjuntos() {
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

        jPanelTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelImagens = new javax.swing.JPanel();
        jLabelImgConj1 = new javax.swing.JLabel();
        jLabelImgConj2 = new javax.swing.JLabel();
        jLabelImgConj3 = new javax.swing.JLabel();
        jl_NomeConj1 = new javax.swing.JLabel();
        jl_NomeConj2 = new javax.swing.JLabel();
        jl_NomeConj3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitulo.setBackground(new java.awt.Color(240, 171, 194));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Conjuntos");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabelImgConj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conjuntoMenor.jpg"))); // NOI18N

        jLabelImgConj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conjuntoMenor2.jpg"))); // NOI18N

        jLabelImgConj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conjuntoMenor3.jpg"))); // NOI18N

        jl_NomeConj1.setText("Conjunto Rio");

        jl_NomeConj2.setText("Conjunto Lara");

        jl_NomeConj3.setText("Conjunto Soft");

        javax.swing.GroupLayout jPanelImagensLayout = new javax.swing.GroupLayout(jPanelImagens);
        jPanelImagens.setLayout(jPanelImagensLayout);
        jPanelImagensLayout.setHorizontalGroup(
            jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagensLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgConj1)
                    .addComponent(jl_NomeConj1))
                .addGap(49, 49, 49)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgConj2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NomeConj2))
                .addGap(50, 50, 50)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_NomeConj3)
                    .addComponent(jLabelImgConj3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanelImagensLayout.setVerticalGroup(
            jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagensLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelImgConj3)
                    .addComponent(jLabelImgConj2)
                    .addComponent(jLabelImgConj1))
                .addGap(18, 18, 18)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NomeConj1)
                    .addComponent(jl_NomeConj2)
                    .addComponent(jl_NomeConj3))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanelImagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanelImagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConjuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImgConj1;
    private javax.swing.JLabel jLabelImgConj2;
    private javax.swing.JLabel jLabelImgConj3;
    private javax.swing.JPanel jPanelImagens;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel jl_NomeConj1;
    private javax.swing.JLabel jl_NomeConj2;
    private javax.swing.JLabel jl_NomeConj3;
    // End of variables declaration//GEN-END:variables
}
