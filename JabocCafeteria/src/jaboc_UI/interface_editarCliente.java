/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI;

import jaboc_Classes.Conta_Cliente;
import javax.swing.JOptionPane;
/**
 *
 * @author guilh
 */
public class interface_editarCliente extends javax.swing.JFrame {
    Conta_Cliente Conta_Cliente;
    /**
     * Creates new form interface_editarCliente
     */
    public interface_editarCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nomeCliente_Editar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpfCliente_Editar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enderecoCliente_Editar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneCliente_Editar = new javax.swing.JTextField();
        editarCliente = new javax.swing.JButton();
        verificarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        verificarSenha_Cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verificarCPF_Cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("Nome:");

        nomeCliente_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCliente_EditarActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        cpfCliente_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfCliente_EditarActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        editarCliente.setText("Enviar");
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });

        verificarCliente.setText("Verificar");
        verificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Informe a sua senha:");

        jLabel1.setText("Informe o seu CPF:");

        verificarCPF_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarCPF_ClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Verificar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarCliente)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addGap(369, 369, 369))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeCliente_Editar)
                        .addContainerGap())
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfCliente_Editar)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enderecoCliente_Editar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefoneCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(verificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(verificarCPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verificarSenha_Cliente)))
                        .addGap(124, 124, 124))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verificarCPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(verificarSenha_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(verificarCliente)
                .addGap(35, 35, 35)
                .addComponent(editarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(telefoneCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarCPF_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarCPF_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificarCPF_ClienteActionPerformed

    private void nomeCliente_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCliente_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCliente_EditarActionPerformed

    private void cpfCliente_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfCliente_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfCliente_EditarActionPerformed

    private void verificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarClienteActionPerformed
        
        if(Conta_Cliente != null){
            if(Conta_Cliente.verificaCPF(verificarCPF_Cliente.getText()) && Conta_Cliente.verificaSenha(verificarSenha_Cliente.getText())){
                nomeCliente_Editar.setText(Conta_Cliente.getTitular().getNomeCliente());
                cpfCliente_Editar.setText(Conta_Cliente.getTitular().getCpfCliente());
                enderecoCliente_Editar.setText(Conta_Cliente.getTitular().getEnderecoCliente());
                telefoneCliente_Editar.setText(Conta_Cliente.getTitular().getTelefoneCliente());
            }else if(!Conta_Cliente.verificaCPF(verificarCPF_Cliente.getText())){
                JOptionPane.showMessageDialog(null,"CPF inexistente!", "Erro", WIDTH);
            }else{
                JOptionPane.showMessageDialog(null,"Senha incorreta!", "Erro", WIDTH);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado!","Erro",WIDTH);
        }    
    }//GEN-LAST:event_verificarClienteActionPerformed

    private void editarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteActionPerformed
        if(Conta_Cliente == null){
            JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado!", "Erro", WIDTH);
        }     
        else if("".equals(nomeCliente_Editar.getText()) || "".equals(cpfCliente_Editar.getText()) || "".equals(enderecoCliente_Editar.getText()) || "".equals(telefoneCliente_Editar.getText())){
            JOptionPane.showMessageDialog(null,"Os campos estão vazios!","Erro",WIDTH);
        }else{
            Conta_Cliente.getTitular().setNomeCliente(nomeCliente_Editar.getText());
            Conta_Cliente.getTitular().setCpfCliente(cpfCliente_Editar.getText());
            Conta_Cliente.getTitular().setEnderecoCliente(enderecoCliente_Editar.getText());
            Conta_Cliente.getTitular().setTelefoneCliente(telefoneCliente_Editar.getText());

            nomeCliente_Editar.setText("");
            cpfCliente_Editar.setText("");
            enderecoCliente_Editar.setText("");
            telefoneCliente_Editar.setText("");
        }
    }//GEN-LAST:event_editarClienteActionPerformed
    public void recebeConta(Conta_Cliente C){
        Conta_Cliente = C;
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfCliente_Editar;
    private javax.swing.JButton editarCliente;
    private javax.swing.JTextField enderecoCliente_Editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeCliente_Editar;
    private javax.swing.JTextField telefoneCliente_Editar;
    private javax.swing.JTextField verificarCPF_Cliente;
    private javax.swing.JButton verificarCliente;
    private javax.swing.JTextField verificarSenha_Cliente;
    // End of variables declaration//GEN-END:variables
}
