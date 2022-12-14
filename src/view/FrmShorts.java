/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author eduar
 */
public class FrmShorts extends javax.swing.JFrame {

    /**
     * Creates new form FrmShorts
     */
    public FrmShorts() {
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
        jLabelImgShorts1 = new javax.swing.JLabel();
        jl_NomeShorts1 = new javax.swing.JLabel();
        jLabelImgShorts2 = new javax.swing.JLabel();
        jl_NomeShorts2 = new javax.swing.JLabel();
        jLabelImgShorts3 = new javax.swing.JLabel();
        jl_NomeShorts3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitulo.setBackground(new java.awt.Color(240, 171, 194));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Shorts e Saias");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(255, 255, 255))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabelImgShorts1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shortsMenor.jpg"))); // NOI18N

        jl_NomeShorts1.setText("Shorts Jeans");

        jLabelImgShorts2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saiaMenor.jpg"))); // NOI18N

        jl_NomeShorts2.setText("Saia Pink");

        jLabelImgShorts3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saiaMenor2.jpg"))); // NOI18N

        jl_NomeShorts3.setText("Saia Green");

        javax.swing.GroupLayout jPanelImagensLayout = new javax.swing.GroupLayout(jPanelImagens);
        jPanelImagens.setLayout(jPanelImagensLayout);
        jPanelImagensLayout.setHorizontalGroup(
            jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagensLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgShorts1)
                    .addComponent(jl_NomeShorts1))
                .addGap(36, 36, 36)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgShorts2)
                    .addComponent(jl_NomeShorts2))
                .addGap(39, 39, 39)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgShorts3)
                    .addComponent(jl_NomeShorts3))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanelImagensLayout.setVerticalGroup(
            jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagensLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImagensLayout.createSequentialGroup()
                        .addComponent(jLabelImgShorts3)
                        .addGap(18, 18, 18)
                        .addComponent(jl_NomeShorts3))
                    .addGroup(jPanelImagensLayout.createSequentialGroup()
                        .addComponent(jLabelImgShorts2)
                        .addGap(18, 18, 18)
                        .addComponent(jl_NomeShorts2))
                    .addGroup(jPanelImagensLayout.createSequentialGroup()
                        .addComponent(jLabelImgShorts1)
                        .addGap(18, 18, 18)
                        .addComponent(jl_NomeShorts1)))
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
            java.util.logging.Logger.getLogger(FrmShorts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmShorts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmShorts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmShorts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmShorts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImgShorts1;
    private javax.swing.JLabel jLabelImgShorts2;
    private javax.swing.JLabel jLabelImgShorts3;
    private javax.swing.JPanel jPanelImagens;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel jl_NomeShorts1;
    private javax.swing.JLabel jl_NomeShorts2;
    private javax.swing.JLabel jl_NomeShorts3;
    // End of variables declaration//GEN-END:variables
}
