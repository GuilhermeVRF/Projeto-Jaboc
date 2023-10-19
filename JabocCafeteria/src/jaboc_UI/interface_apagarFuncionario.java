/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI;

import jaboc_Classes.listaFuncionarios;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class interface_apagarFuncionario extends javax.swing.JFrame {
    listaFuncionarios listaFuncionarios;
    int indiceFuncionario;
    /**
     * Creates new form interface_apagarFuncionario
     */
    public interface_apagarFuncionario() {
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

        verificarCPF_Funcionario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verificarFuncionario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Funcionario = new javax.swing.JTextArea();
        apagarFuncionario = new javax.swing.JButton();
        sair_ApagarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verificarCPF_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarCPF_FuncionarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Informe o CPF do funcionário:");

        verificarFuncionario.setText("Verificar");
        verificarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarFuncionarioActionPerformed(evt);
            }
        });

        txtArea_Funcionario.setColumns(20);
        txtArea_Funcionario.setRows(5);
        jScrollPane1.setViewportView(txtArea_Funcionario);

        apagarFuncionario.setText("Apagar");
        apagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarFuncionarioActionPerformed(evt);
            }
        });

        sair_ApagarFuncionario.setText("SAIR");
        sair_ApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_ApagarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(verificarCPF_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sair_ApagarFuncionario))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(apagarFuncionario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(verificarFuncionario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sair_ApagarFuncionario)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificarCPF_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(verificarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apagarFuncionario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void verificarCPF_FuncionarioActionPerformed(java.awt.event.ActionEvent evt){
         
     };
    
    
    private void apagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarFuncionarioActionPerformed
        if(listaFuncionarios != null){   
            
            if(indiceFuncionario != -1){
                JOptionPane.showMessageDialog(null, listaFuncionarios.getItem(indiceFuncionario).getIdFuncionario(), "Funcionário apagado!",WIDTH);
                System.out.println(listaFuncionarios.getItem(indiceFuncionario));
                System.out.println(listaFuncionarios.removerItem(indiceFuncionario));                
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario inexistente!", "Erro", WIDTH);
                verificarCPF_Funcionario.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Não há funcionários cadastrados!","Erro",WIDTH);
        }
    }//GEN-LAST:event_apagarFuncionarioActionPerformed

    private void verificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarFuncionarioActionPerformed
        if(listaFuncionarios != null){
            indiceFuncionario = listaFuncionarios.buscarContaFuncionario(verificarCPF_Funcionario.getText(), listaFuncionarios.getNAtualElementos(), -1);
            txtArea_Funcionario.setText(listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().toString());
        }   
    }//GEN-LAST:event_verificarFuncionarioActionPerformed

    private void sair_ApagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_ApagarFuncionarioActionPerformed
        interface_exibirFuncionarios exibirFuncionarios = new interface_exibirFuncionarios();
        exibirFuncionarios.setVisible(true);
        this.dispose();
        exibirFuncionarios.recebeListaFuncionarios(listaFuncionarios);  
    }//GEN-LAST:event_sair_ApagarFuncionarioActionPerformed
    public void txtAreaIneditavel(){
        txtArea_Funcionario.setEditable(false);
    }
    public void receberListaFuncionarios(listaFuncionarios lista){
        listaFuncionarios = lista;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sair_ApagarFuncionario;
    private javax.swing.JTextArea txtArea_Funcionario;
    private javax.swing.JTextField verificarCPF_Funcionario;
    private javax.swing.JButton verificarFuncionario;
    // End of variables declaration//GEN-END:variables
}
