/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jaboc_UI.JabocUI_Utilidades.JabocUI_popUp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author eeuar
 */
public class PopUp_GerenciaProdutos extends javax.swing.JPanel {

    /**
     * Creates new form PopUp_GerenciaProdutos
     */
    public PopUp_GerenciaProdutos() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        g2.dispose();
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        jLabel1 = new javax.swing.JLabel();
        bPopUpExit = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        bEdiatr_Produto = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bExcluir_Produto = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(79, 84, 101));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 84, 101));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("O que deseja fazer com o ProdutoX?");

        bPopUpExit.setBackground(new java.awt.Color(250, 112, 112));
        bPopUpExit.setForeground(new java.awt.Color(255, 255, 255));
        bPopUpExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/x.png"))); // NOI18N
        bPopUpExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bPopUpExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPopUpExitActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(164, 144, 124));

        bEdiatr_Produto.setBackground(new java.awt.Color(164, 144, 124));
        bEdiatr_Produto.setBorder(null);
        bEdiatr_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_editar3.png"))); // NOI18N
        bEdiatr_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEdiatr_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEdiatr_ProdutoMouseExited(evt);
            }
        });

        bExcluir_Produto.setBackground(new java.awt.Color(164, 144, 124));
        bExcluir_Produto.setBorder(null);
        bExcluir_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_lixo2.png"))); // NOI18N
        bExcluir_Produto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bExcluir_Produto.setIconTextGap(0);
        bExcluir_Produto.setInheritsPopupMenu(true);
        bExcluir_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExcluir_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExcluir_ProdutoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bEdiatr_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bExcluir_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bExcluir_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(bEdiatr_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bPopUpExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bPopUpExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bPopUpExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPopUpExitActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_bPopUpExitActionPerformed

    private void bEdiatr_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEdiatr_ProdutoMouseEntered
        bEdiatr_Produto.setBackground(new Color(210, 224, 251));
    }//GEN-LAST:event_bEdiatr_ProdutoMouseEntered

    private void bEdiatr_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEdiatr_ProdutoMouseExited
        bEdiatr_Produto.setBackground(new Color(164, 144, 124));
    }//GEN-LAST:event_bEdiatr_ProdutoMouseExited

    private void bExcluir_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir_ProdutoMouseEntered
        bExcluir_Produto.setBackground(new Color(255, 188, 188));
    }//GEN-LAST:event_bExcluir_ProdutoMouseEntered

    private void bExcluir_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir_ProdutoMouseExited
        bExcluir_Produto.setBackground(new Color(164, 144, 124));
    }//GEN-LAST:event_bExcluir_ProdutoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bEdiatr_Produto;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bExcluir_Produto;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bPopUpExit;
    private javax.swing.JLabel jLabel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
