/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Cardapio;

import jaboc_BancoDeDados.Modelo.DAO_Produto;
import jaboc_Biblioteca.outras.ModernScrollBarUI;
import jaboc_Classes.Produto;
import jaboc_UI.Clientes.interface_editarCliente;
import jaboc_UI.Clientes.interface_menuCliente;
import jaboc_UI.JabocUI_Utilidades.JabocUI_popUp.PopUp_vazio;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.DefaultOption;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author 0057138
 */
public class interface_Cardapio extends javax.swing.JFrame {

    int produto_Selecionado;
    DAO_Produto daoProduto = new DAO_Produto();
    List<Produto> carrinho = new ArrayList<Produto>();

    public interface_Cardapio() {
        initComponents();
        setLocationRelativeTo(null);
        GlassPanePopup.install(this);

        JScrollBar bar = scrollCardapio.getVerticalScrollBar();
        bar.setOpaque(false);
        bar.setForeground(new Color(223, 204, 251));
        bar.setPreferredSize(new Dimension(10, 5));
        bar.setUI(new ModernScrollBarUI());
        scrollCardapio.setViewportBorder(null);
        scrollCardapio.setBorder(null);
        
        carregarCardapio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table2 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table3 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table4 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table5 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bEditar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bCarrinho = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bVoltar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        jLabel5 = new javax.swing.JLabel();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        scrollCardapio = new javax.swing.JScrollPane();
        tabelaCardapio = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 144, 124));

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/logo4.png"))); // NOI18N

        bEditar.setBackground(new java.awt.Color(252, 252, 252));
        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_editaruser2.png"))); // NOI18N
        bEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEditarMouseExited(evt);
            }
        });
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bCarrinho.setBackground(new java.awt.Color(252, 252, 252));
        bCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_carrinho.png"))); // NOI18N
        bCarrinho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCarrinhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCarrinhoMouseExited(evt);
            }
        });
        bCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarrinhoActionPerformed(evt);
            }
        });

        bVoltar.setBackground(new java.awt.Color(252, 252, 252));
        bVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        bVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bCarrinho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_cardapio1.png"))); // NOI18N
        jLabel5.setText("  CARDÁPIO");

        panel1.setBackground(new java.awt.Color(200, 182, 166));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        scrollCardapio.setBackground(new java.awt.Color(255, 255, 255));
        scrollCardapio.setBorder(null);

        tabelaCardapio.setBackground(new java.awt.Color(255, 255, 255));
        tabelaCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Quantidade", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCardapio.setFocusable(false);
        tabelaCardapio.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaCardapio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaCardapio.setShowGrid(false);
        tabelaCardapio.getTableHeader().setReorderingAllowed(false);
        tabelaCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCardapioMousePressed(evt);
            }
        });
        scrollCardapio.setViewportView(tabelaCardapio);
        if (tabelaCardapio.getColumnModel().getColumnCount() > 0) {
            tabelaCardapio.getColumnModel().getColumn(0).setResizable(false);
            tabelaCardapio.getColumnModel().getColumn(0).setPreferredWidth(2);
            tabelaCardapio.getColumnModel().getColumn(1).setResizable(false);
            tabelaCardapio.getColumnModel().getColumn(1).setPreferredWidth(180);
            tabelaCardapio.getColumnModel().getColumn(2).setResizable(false);
            tabelaCardapio.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaCardapio.getColumnModel().getColumn(3).setResizable(false);
            tabelaCardapio.getColumnModel().getColumn(3).setPreferredWidth(35);
            tabelaCardapio.getColumnModel().getColumn(4).setResizable(false);
            tabelaCardapio.getColumnModel().getColumn(4).setPreferredWidth(35);
        }

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollCardapio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        interface_editarCliente i_editarCliente = new interface_editarCliente();
        i_editarCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseEntered
        bEditar.setBackground(new Color(210, 224, 251));
    }//GEN-LAST:event_bEditarMouseEntered

    private void bEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseExited
        bEditar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bEditarMouseExited

    private void bCarrinhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCarrinhoMouseEntered
        bCarrinho.setBackground(new Color(223, 204, 251));
    }//GEN-LAST:event_bCarrinhoMouseEntered

    private void bCarrinhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCarrinhoMouseExited
        bCarrinho.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bCarrinhoMouseExited

    private void bCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarrinhoActionPerformed
        if (!carrinho.isEmpty()) {
            interface_Carrinho i_Carrinho = new interface_Carrinho();
            GlassPanePopup.showPopup(i_Carrinho, new DefaultOption() {
                @Override
                public boolean closeWhenClickOutside() {
                    return false;
                }
            });
            
            i_Carrinho.receber(this);
            i_Carrinho.recebeCarrinho(carrinho);
            i_Carrinho.addCarrinho();
                   
        }else{
            GlassPanePopup.showPopup(new PopUp_vazio());
        }
    }//GEN-LAST:event_bCarrinhoActionPerformed

    private void tabelaCardapioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCardapioMousePressed

        produto_Selecionado = tabelaCardapio.getSelectedRow();
        int idSelecionado = Integer.parseInt(tabelaCardapio.getValueAt(produto_Selecionado, 0).toString());
        Produto produto = daoProduto.ListagemEspecifica(idSelecionado);
        carrinho.add(produto);
 }//GEN-LAST:event_tabelaCardapioMousePressed

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setBackground(new Color(210, 224, 251));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       interface_menuCliente i_menu = new interface_menuCliente();
       i_menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed
   public void carregarCardapio(){  
       tabelaCardapio.removeAll();
      
        DefaultTableModel cardapio = (DefaultTableModel) tabelaCardapio.getModel();
        for (Produto p : daoProduto.Listagem()) {
            cardapio.addRow(new Object[]{
                p.getIdProduto(),
                p.getNomeProduto(),
                p.getTipoProduto(),
                p.getQtdeProduto(),
                p.getPrecoProduto()

            });
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_Cardapio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bCarrinho;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bEditar;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bVoltar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    private javax.swing.JScrollPane scrollCardapio;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table tabelaCardapio;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table1;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table2;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table3;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table4;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table5;
    // End of variables declaration//GEN-END:variables
}
