/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Produtos;

import jaboc_Classes.Conta_Cliente;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author eeuar
 */
public class interface_apagarProduto extends javax.swing.JFrame {
    /**
     * Creates new form interface_apagarProduto
     */
    public interface_apagarProduto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bVoltar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        apagarProduto = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        bExcluir_Produto = new javax.swing.JButton();
        bEdiatr_Produto = new javax.swing.JButton();
        bAdicionar_Produto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verificarId_Produto = new javax.swing.JTextField();
        verificarProduto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Produto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 144, 124));

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        bVoltar.setBackground(new java.awt.Color(252, 252, 252));
        bVoltar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(79, 84, 101));
        bVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        bVoltar.setText("   Voltar");
        bVoltar.setBorderPainted(false);
        bVoltar.setFocusPainted(false);
        bVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVoltarMouseExited(evt);
            }
        });
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        apagarProduto.setBackground(new java.awt.Color(79, 84, 101));
        apagarProduto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        apagarProduto.setForeground(new java.awt.Color(255, 255, 255));
        apagarProduto.setText("Apagar");
        apagarProduto.setBorderPainted(false);
        apagarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apagarProduto.setFocusPainted(false);
        apagarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarProdutoActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(200, 182, 166));

        bExcluir_Produto.setBackground(new java.awt.Color(252, 252, 252));
        bExcluir_Produto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bExcluir_Produto.setForeground(new java.awt.Color(79, 84, 101));
        bExcluir_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_lixo.png"))); // NOI18N
        bExcluir_Produto.setText("Excluir");
        bExcluir_Produto.setBorderPainted(false);
        bExcluir_Produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bExcluir_Produto.setFocusPainted(false);
        bExcluir_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExcluir_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExcluir_ProdutoMouseExited(evt);
            }
        });
        bExcluir_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_ProdutoActionPerformed(evt);
            }
        });

        bEdiatr_Produto.setBackground(new java.awt.Color(252, 252, 252));
        bEdiatr_Produto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bEdiatr_Produto.setForeground(new java.awt.Color(79, 84, 101));
        bEdiatr_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_editar.png"))); // NOI18N
        bEdiatr_Produto.setText("Editar");
        bEdiatr_Produto.setBorderPainted(false);
        bEdiatr_Produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEdiatr_Produto.setFocusPainted(false);
        bEdiatr_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEdiatr_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEdiatr_ProdutoMouseExited(evt);
            }
        });
        bEdiatr_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdiatr_ProdutoActionPerformed(evt);
            }
        });

        bAdicionar_Produto.setBackground(new java.awt.Color(252, 252, 252));
        bAdicionar_Produto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bAdicionar_Produto.setForeground(new java.awt.Color(79, 84, 101));
        bAdicionar_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_adicionar.png"))); // NOI18N
        bAdicionar_Produto.setText("Adicionar");
        bAdicionar_Produto.setBorderPainted(false);
        bAdicionar_Produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAdicionar_Produto.setFocusPainted(false);
        bAdicionar_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bAdicionar_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bAdicionar_ProdutoMouseExited(evt);
            }
        });
        bAdicionar_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionar_ProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bEdiatr_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAdicionar_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(bExcluir_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(bAdicionar_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEdiatr_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bExcluir_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apagarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(apagarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(200, 182, 166));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 101));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID do Produto:");

        verificarId_Produto.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        verificarId_Produto.setForeground(new java.awt.Color(79, 84, 101));
        verificarId_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarId_ProdutoActionPerformed(evt);
            }
        });

        verificarProduto.setBackground(new java.awt.Color(79, 84, 101));
        verificarProduto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        verificarProduto.setForeground(new java.awt.Color(255, 255, 255));
        verificarProduto.setText("Verificar");
        verificarProduto.setBorderPainted(false);
        verificarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(verificarId_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verificarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verificarId_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(200, 182, 166));

        textArea_Produto.setColumns(20);
        textArea_Produto.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        textArea_Produto.setForeground(new java.awt.Color(79, 84, 101));
        textArea_Produto.setRows(5);
        jScrollPane1.setViewportView(textArea_Produto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_lixo2.png"))); // NOI18N
        jLabel2.setText(" APAGAR PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        interface_gerenciarProdutos i_gerenciarCardapio = new interface_gerenciarProdutos();
        i_gerenciarCardapio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void verificarId_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarId_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificarId_ProdutoActionPerformed

    private void verificarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarProdutoActionPerformed
        
    }//GEN-LAST:event_verificarProdutoActionPerformed

    private void apagarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarProdutoActionPerformed

    }//GEN-LAST:event_apagarProdutoActionPerformed

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void bExcluir_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir_ProdutoMouseEntered
        bExcluir_Produto.setBackground(new Color(255, 188, 188));
    }//GEN-LAST:event_bExcluir_ProdutoMouseEntered

    private void bExcluir_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir_ProdutoMouseExited
        bExcluir_Produto.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bExcluir_ProdutoMouseExited

    private void bExcluir_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_ProdutoActionPerformed

    }//GEN-LAST:event_bExcluir_ProdutoActionPerformed

    private void bEdiatr_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEdiatr_ProdutoMouseEntered
        bEdiatr_Produto.setBackground(new Color(210, 224, 251));
    }//GEN-LAST:event_bEdiatr_ProdutoMouseEntered

    private void bEdiatr_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEdiatr_ProdutoMouseExited
        bEdiatr_Produto.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bEdiatr_ProdutoMouseExited

    private void bEdiatr_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdiatr_ProdutoActionPerformed

    }//GEN-LAST:event_bEdiatr_ProdutoActionPerformed

    private void bAdicionar_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdicionar_ProdutoMouseEntered
        bAdicionar_Produto.setBackground(new Color(215, 229, 202));
    }//GEN-LAST:event_bAdicionar_ProdutoMouseEntered

    private void bAdicionar_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdicionar_ProdutoMouseExited
        bAdicionar_Produto.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bAdicionar_ProdutoMouseExited

    private void bAdicionar_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionar_ProdutoActionPerformed

    }//GEN-LAST:event_bAdicionar_ProdutoActionPerformed
    public void txtAreaIneditavel() {
        textArea_Produto.setEditable(false);
    }   
    /**
     * @param args the command line arguments
     */
    public static void apagarProduto(String args[]) {
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
            java.util.logging.Logger.getLogger(interface_apagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_apagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_apagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_apagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_apagarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarProduto;
    private javax.swing.JButton bAdicionar_Produto;
    private javax.swing.JButton bEdiatr_Produto;
    private javax.swing.JButton bExcluir_Produto;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea_Produto;
    private javax.swing.JTextField verificarId_Produto;
    private javax.swing.JButton verificarProduto;
    // End of variables declaration//GEN-END:variables
}
