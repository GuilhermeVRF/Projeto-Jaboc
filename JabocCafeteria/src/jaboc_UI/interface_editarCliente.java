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

        jLabel1 = new javax.swing.JLabel();
        verificarCPF_Cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeCliente_Editar = new javax.swing.JTextField();
        cpfCliente_Editar = new javax.swing.JTextField();
        enderecoCliente_Editar = new javax.swing.JTextField();
        telefoneCliente_Editar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        verificarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        verificarSenha_Cliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        editarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informe o seu CPF:");

        verificarCPF_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarCPF_ClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        nomeCliente_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCliente_EditarActionPerformed(evt);
            }
        });

        cpfCliente_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfCliente_EditarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome:");

        verificarCliente.setText("Verificar");
        verificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Informe a sua senha:");

        jLabel7.setText("Verificar Cliente");

        editarCliente.setText("Enviar");
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(verificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(verificarCPF_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(verificarSenha_Cliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneCliente_Editar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfCliente_Editar)
                    .addComponent(enderecoCliente_Editar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(editarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verificarCPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(verificarSenha_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(verificarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enderecoCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(editarCliente)
                .addGap(36, 36, 36))
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
        else if("".equals(nomeCliente_Editar.getText()) && "".equals(cpfCliente_Editar.getText()) && "".equals(enderecoCliente_Editar.getText()) && "".equals(telefoneCliente_Editar.getText())){
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
            java.util.logging.Logger.getLogger(interface_editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_editarCliente().setVisible(true);
            }
        });
    }

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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeCliente_Editar;
    private javax.swing.JTextField telefoneCliente_Editar;
    private javax.swing.JTextField verificarCPF_Cliente;
    private javax.swing.JButton verificarCliente;
    private javax.swing.JTextField verificarSenha_Cliente;
    // End of variables declaration//GEN-END:variables
}
