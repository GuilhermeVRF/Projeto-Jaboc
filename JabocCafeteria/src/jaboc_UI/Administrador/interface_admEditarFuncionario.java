/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Administrador;

import jaboc_BancoDeDados.Modelo.DAO_ContaFuncionario;
import jaboc_Classes.Conta_Funcionario;
import jaboc_UI.Funcionarios.interface_exibirFuncionarios;
import jaboc_UI.JabocUI_Utilidades.JabocUI_popUp.PopUp_EditarPessoal;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author guilh
 */
public class interface_admEditarFuncionario extends javax.swing.JFrame {
    private Conta_Funcionario FUNCIONARIO_EDITAVEL;
    private interface_exibirFuncionarios EXIBIR_FUNCIONARIOS;
    /**
     * Creates new form interface_admEditarFuncionario
     */
    public interface_admEditarFuncionario(Conta_Funcionario funcionarioEditavel, interface_exibirFuncionarios exibirFuncionarios) {
        initComponents();
        this.FUNCIONARIO_EDITAVEL = funcionarioEditavel;
        this.EXIBIR_FUNCIONARIOS = exibirFuncionarios;
        this.preencherCampos();
        
        this.setLocationRelativeTo(null);
        GlassPanePopup.install(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        panel4 = new jaboc_UI.jabocUI_Utilidades.Panel();
        nomeFuncionario_Editar = new jaboc_UI.jabocUI_Utilidades.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel3 = new jaboc_UI.jabocUI_Utilidades.Panel();
        cargoFuncionario_Editar = new javax.swing.JComboBox<>();
        iuser2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel5 = new jaboc_UI.jabocUI_Utilidades.Panel();
        iuser3 = new javax.swing.JLabel();
        salarioFuncionario_Editar = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.FormattedNumberField();
        buttonCirculo1 = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        bVoltar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(164, 144, 124));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_edFuncionario.png"))); // NOI18N
        jLabel7.setText(" EDITAR FUNCIONÁRIO");

        panel1.setBackground(new java.awt.Color(141, 123, 104));

        panel4.setBackground(new java.awt.Color(255, 255, 255));

        nomeFuncionario_Editar.setText("Nome:");
        nomeFuncionario_Editar.setEnabled(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/user.png"))); // NOI18N

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(nomeFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        cargoFuncionario_Editar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        cargoFuncionario_Editar.setForeground(new java.awt.Color(153, 153, 153));
        cargoFuncionario_Editar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cozinheiro(a)", "Auxiliar de Cozinha", "Garçom", "Balconista", "Faxineiro(a)", "Administrador" }));
        cargoFuncionario_Editar.setBorder(null);
        cargoFuncionario_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargoFuncionario_Editar.setFocusable(false);
        cargoFuncionario_Editar.setPreferredSize(new java.awt.Dimension(113, 30));
        cargoFuncionario_Editar.setRequestFocusEnabled(false);

        iuser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iuser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/pasta.png"))); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargoFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iuser2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(cargoFuncionario_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salário:");

        panel5.setBackground(new java.awt.Color(255, 255, 255));

        iuser3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iuser3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/dinheiro.png"))); // NOI18N

        salarioFuncionario_Editar.setText("formattedNumberField1");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iuser3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salarioFuncionario_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salarioFuncionario_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iuser3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        buttonCirculo1.setBackground(new java.awt.Color(79, 84, 101));
        buttonCirculo1.setForeground(new java.awt.Color(255, 255, 255));
        buttonCirculo1.setText("Atualizar");
        buttonCirculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCirculo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(buttonCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 231));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/logo4.png"))); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void buttonCirculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCirculo1ActionPerformed
        DAO_ContaFuncionario daoFuncionario = new DAO_ContaFuncionario();
        
        String novoCargo = (String) this.cargoFuncionario_Editar.getSelectedItem();
        double salario = Double.parseDouble(this.salarioFuncionario_Editar.getFormattedText());
        
        this.FUNCIONARIO_EDITAVEL.setCargoFuncionario(novoCargo);
        this.FUNCIONARIO_EDITAVEL.setSalario(salario);
        
        String mensagemPopUp;
        
        if(daoFuncionario.update_Administrador(this.FUNCIONARIO_EDITAVEL)){
            mensagemPopUp = "Edição concluída com sucesso!";  
            DefaultTableModel dadosTabela = (DefaultTableModel) this.EXIBIR_FUNCIONARIOS.getTabelaFuncionario().getModel();
            dadosTabela.setRowCount(0);
            this.EXIBIR_FUNCIONARIOS.carregarTabela();
            
        }else{
            mensagemPopUp = "Ocorreu um erro ao editar!";
        }
        
        GlassPanePopup.showPopup(new PopUp_EditarPessoal(mensagemPopUp));
    }//GEN-LAST:event_buttonCirculo1ActionPerformed

    private void preencherCampos(){
        this.nomeFuncionario_Editar.setText(this.FUNCIONARIO_EDITAVEL.getTitular().getNome());
        this.cargoFuncionario_Editar.setSelectedItem(this.FUNCIONARIO_EDITAVEL.getCargoFuncionario());
        this.salarioFuncionario_Editar.setFormattedText(String.valueOf(this.FUNCIONARIO_EDITAVEL.getSalario()));  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bVoltar;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo buttonCirculo1;
    private javax.swing.JComboBox<String> cargoFuncionario_Editar;
    private javax.swing.JLabel iuser2;
    private javax.swing.JLabel iuser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private jaboc_UI.jabocUI_Utilidades.TextField nomeFuncionario_Editar;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel3;
    private jaboc_UI.jabocUI_Utilidades.Panel panel4;
    private jaboc_UI.jabocUI_Utilidades.Panel panel5;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.FormattedNumberField salarioFuncionario_Editar;
    // End of variables declaration//GEN-END:variables
}
