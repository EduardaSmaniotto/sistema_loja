/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoItemVenda;
import dao.DaoProduto;
import dao.DaoVenda;
import java.text.DecimalFormat;
import model.Cliente;
import model.ItemVenda;
import model.Produto;
import model.Venda;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmPagamento extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    DefaultTableModel carrinho;

    public FrmPagamento() {
        initComponents();

        txtcartao.setText("0");
        txtdinheiro.setText("0");
        txtcheque.setText("0");
        txttroco.setText("0");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcartao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcheque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttroco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnfinalizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");

        jPanel1.setBackground(new java.awt.Color(240, 171, 194));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setText("Obs.:");

        txtdinheiro.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel3.setText("CARTÃO:");

        txtcartao.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel4.setText("CHEQUE:");

        txtcheque.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setText("TROCO:");

        txttroco.setEditable(false);
        txttroco.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        txttroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrocoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel6.setText("TOTAL:");

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        btnfinalizar.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnfinalizar.setText("Finalizar Venda");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("DINHEIRO:");

        txtobs.setColumns(20);
        txtobs.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtobs.setRows(5);
        jScrollPane1.setViewportView(txtobs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttroco, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcartao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed

        double pcartao, pcheque, pdinheiro, totalpago, totalvenda, troco;

        pcartao = Double.parseDouble(txtcartao.getText());
        pcheque = Double.parseDouble(txtcheque.getText());
        pdinheiro = Double.parseDouble(txtdinheiro.getText());

        totalvenda = Double.parseDouble(txttotal.getText());

        //Calcular o total e o troco
        totalpago = pcartao + pcheque + pdinheiro;

        troco = totalpago - totalvenda;

        txttroco.setText(String.valueOf(( new DecimalFormat("#,##0.00").format(troco) )));

        Venda objv = new Venda();

        //Dados do cliente (cliente_id)
        objv.setCliente(cliente);

        //Pega a data da venda
        Date agora = new Date();
        SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
        String datamysql = dataEUA.format(agora);

        objv.setData_venda(datamysql);

        //Total da venda e obs
        objv.setTotal_venda(totalvenda);
        objv.setObs(txtobs.getText());

        DaoVenda dao_v = new DaoVenda();
        dao_v.cadastrarVenda(objv);

        //Retorna o id da ultima venda realizada
        objv.setId(dao_v.retornaUltimaVenda());

        //System.out.println("Id da ultima venda: " + objv.getId());
     
        // Cadastrando os produtos na tabela itemvendas
        for (int i = 0; i < carrinho.getRowCount(); i++) {

            int qtd_estoque , qtd_comprada, qtd_atualizada;
            Produto objp = new Produto();
            DaoProduto dao_produto = new DaoProduto();
          
            ItemVenda item = new ItemVenda();
            item.setVenda(objv);

            objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(objp);
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
                        
            //Baixa no estoque
            qtd_estoque = dao_produto.retornaEstoqueAtual(objp.getId());
            qtd_comprada = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            qtd_atualizada = qtd_estoque - qtd_comprada;
            
            dao_produto.baixaEstoque(objp.getId(), qtd_atualizada);         

            DaoItemVenda daoitem = new DaoItemVenda();
            daoitem.cadastraItem(item);

         }
       /***********************************************************************/
         
        JOptionPane.showMessageDialog(null, "Venda Registrada com Sucesso!");


    }//GEN-LAST:event_btnfinalizarActionPerformed

    private void txttrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrocoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcartao;
    private javax.swing.JTextField txtcheque;
    private javax.swing.JTextField txtdinheiro;
    private javax.swing.JTextArea txtobs;
    public javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttroco;
    // End of variables declaration//GEN-END:variables
}
