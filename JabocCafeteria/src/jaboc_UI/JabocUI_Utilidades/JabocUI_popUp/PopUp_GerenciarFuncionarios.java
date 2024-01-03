/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jaboc_UI.JabocUI_Utilidades.JabocUI_popUp;

import jaboc_Biblioteca.glasspanepopup.GlassPanePopup;
import jaboc_Classes.Conta_Funcionario;
import jaboc_UI.Administrador.interface_admApagarFuncionario;
import jaboc_UI.Administrador.interface_admEditarFuncionario;
import jaboc_UI.Funcionarios.interface_exibirFuncionarios;
import java.awt.Color;

/**
 *
 * @author guilh
 */
public class PopUp_GerenciarFuncionarios extends javax.swing.JPanel{
    private Conta_Funcionario funcionarioGerenciavel;
    private final interface_exibirFuncionarios EXIBIR_FUNCIONARIOS;
    /**
     * Creates new form PopUp_GerenciarFuncionarios
     * @param funcionarioGerenciavel
     */
    
    public PopUp_GerenciarFuncionarios(Conta_Funcionario funcionarioGerenciavel, interface_exibirFuncionarios exibirFuncionarios){
        this.funcionarioGerenciavel = funcionarioGerenciavel;
        this.EXIBIR_FUNCIONARIOS = exibirFuncionarios;
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

        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        jLabel1 = new javax.swing.JLabel();
        bPopUpExit = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        bEdiatr_Funcionario = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bExcluir_Funcionario = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(79, 84, 101));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 84, 101));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("O que deseja fazer?");

        bPopUpExit.setBackground(new java.awt.Color(250, 112, 112));
        bPopUpExit.setForeground(new java.awt.Color(255, 255, 255));
        bPopUpExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/x.png"))); // NOI18N
        bPopUpExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bPopUpExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPopUpExitActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        bEdiatr_Funcionario.setBackground(new java.awt.Color(79, 84, 101));
        bEdiatr_Funcionario.setBorder(null);
        bEdiatr_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_editar3.png"))); // NOI18N
        bEdiatr_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEdiatr_FuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEdiatr_FuncionarioMouseExited(evt);
            }
        });
        bEdiatr_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdiatr_FuncionarioActionPerformed(evt);
            }
        });

        bExcluir_Funcionario.setBackground(new java.awt.Color(79, 84, 101));
        bExcluir_Funcionario.setBorder(null);
        bExcluir_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_lixo2.png"))); // NOI18N
        bExcluir_Funcionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bExcluir_Funcionario.setIconTextGap(0);
        bExcluir_Funcionario.setInheritsPopupMenu(true);
        bExcluir_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExcluir_FuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExcluir_FuncionarioMouseExited(evt);
            }
        });
        bExcluir_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_FuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bEdiatr_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bExcluir_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bExcluir_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(bEdiatr_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bPopUpExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bPopUpExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bPopUpExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPopUpExitActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_bPopUpExitActionPerformed

    private void bEdiatr_FuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEdiatr_FuncionarioMouseEntered
        bEdiatr_Funcionario.setBackground(new Color(210, 224, 251));
    }//GEN-LAST:event_bEdiatr_FuncionarioMouseEntered

    private void bEdiatr_FuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEdiatr_FuncionarioMouseExited
        bEdiatr_Funcionario.setBackground(new Color(79,84,101));
    }//GEN-LAST:event_bEdiatr_FuncionarioMouseExited

    private void bEdiatr_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdiatr_FuncionarioActionPerformed
        GlassPanePopup.closePopupLast();
        interface_admEditarFuncionario i_admEditarFuncionario = new interface_admEditarFuncionario(this.funcionarioGerenciavel, this.EXIBIR_FUNCIONARIOS);
        i_admEditarFuncionario.setVisible(true);        
    }//GEN-LAST:event_bEdiatr_FuncionarioActionPerformed

    private void bExcluir_FuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir_FuncionarioMouseEntered
        bExcluir_Funcionario.setBackground(new Color(255, 188, 188));
    }//GEN-LAST:event_bExcluir_FuncionarioMouseEntered

    private void bExcluir_FuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluir_FuncionarioMouseExited
        bExcluir_Funcionario.setBackground(new Color(79,84,101));
    }//GEN-LAST:event_bExcluir_FuncionarioMouseExited

    private void bExcluir_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_FuncionarioActionPerformed
        GlassPanePopup.closePopupLast();
        interface_admApagarFuncionario i_admApagarFuncionario = new interface_admApagarFuncionario(this.funcionarioGerenciavel, this.EXIBIR_FUNCIONARIOS);
        i_admApagarFuncionario.setVisible(true);       
    }//GEN-LAST:event_bExcluir_FuncionarioActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bEdiatr_Funcionario;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bExcluir_Funcionario;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bPopUpExit;
    private javax.swing.JLabel jLabel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
