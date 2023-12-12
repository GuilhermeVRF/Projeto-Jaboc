/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Funcionarios;


import java.awt.Color;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author eeuar
 */
public class interface_criarFuncionario extends javax.swing.JFrame {
        
    private boolean activeButton = true, activeButton1 = true;
    /**
     * Creates new form NewJFrame
     */
    public interface_criarFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        GlassPanePopup.install(this);
        
        cpfFuncionario.addFormatacao("###.###.###-##");
        telefoneFuncionario.addFormatacao("(##) #####-####");
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
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        bVoltar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        criarFuncionario = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        panel4 = new jaboc_UI.jabocUI_Utilidades.Panel();
        nomeFuncionario = new jaboc_UI.jabocUI_Utilidades.TextField();
        iuser = new javax.swing.JLabel();
        panel5 = new jaboc_UI.jabocUI_Utilidades.Panel();
        cpfFuncionario = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.FormatedTextField();
        icpf = new javax.swing.JLabel();
        panel6 = new jaboc_UI.jabocUI_Utilidades.Panel();
        itel = new javax.swing.JLabel();
        telefoneFuncionario = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.FormatedTextField();
        jLabel5 = new javax.swing.JLabel();
        panel3 = new jaboc_UI.jabocUI_Utilidades.Panel();
        cargoFuncionario = new javax.swing.JComboBox<>();
        iuser2 = new javax.swing.JLabel();
        panel22 = new jaboc_UI.jabocUI_Utilidades.Panel();
        nomeFuncionario1 = new jaboc_UI.jabocUI_Utilidades.TextField();
        iuser1 = new javax.swing.JLabel();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        panel8 = new jaboc_UI.jabocUI_Utilidades.Panel();
        senhaFuncionario = new jaboc_UI.jabocUI_Utilidades.PasswordField();
        isenha = new javax.swing.JLabel();
        panel9 = new jaboc_UI.jabocUI_Utilidades.Panel();
        verificarSenhaFuncionario = new jaboc_UI.jabocUI_Utilidades.PasswordField();
        isenha2 = new javax.swing.JLabel();
        bOlho = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bOlho1 = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(164, 144, 124));
        jPanel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CRIAR FUNCIONÁRIO");

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
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

        criarFuncionario.setBackground(new java.awt.Color(79, 84, 101));
        criarFuncionario.setForeground(new java.awt.Color(252, 252, 252));
        criarFuncionario.setText("Cadastrar");
        criarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                criarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                criarFuncionarioMouseExited(evt);
            }
        });
        criarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarFuncionarioActionPerformed1(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(criarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(criarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel1.setBackground(new java.awt.Color(141, 123, 104));

        panel4.setBackground(new java.awt.Color(255, 255, 255));

        nomeFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        nomeFuncionario.setText("Nome:");
        nomeFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeFuncionarioFocusLost(evt);
            }
        });
        nomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionarioActionPerformed(evt);
            }
        });

        iuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/user.png"))); // NOI18N

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iuser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel5.setBackground(new java.awt.Color(255, 255, 255));

        cpfFuncionario.setText(" CPF:");

        icpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/cpf.png"))); // NOI18N

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(icpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel6.setBackground(new java.awt.Color(255, 255, 255));

        itel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/tel.png"))); // NOI18N

        telefoneFuncionario.setText(" Telefone:");
        telefoneFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargo:");

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        cargoFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        cargoFuncionario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        cargoFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        cargoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cozinheiro(a)", "Auxiliar de Cozinha", "Garçom", "Balconista", "Faxineiro(a)", "Administrador" }));
        cargoFuncionario.setBorder(null);
        cargoFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargoFuncionario.setFocusable(false);
        cargoFuncionario.setPreferredSize(new java.awt.Dimension(113, 30));
        cargoFuncionario.setRequestFocusEnabled(false);

        iuser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iuser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/pasta.png"))); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cargoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(iuser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panel22.setBackground(new java.awt.Color(255, 255, 255));

        nomeFuncionario1.setBackground(new java.awt.Color(255, 255, 255));
        nomeFuncionario1.setText(" Endereço:");
        nomeFuncionario1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeFuncionario1FocusLost(evt);
            }
        });
        nomeFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionario1ActionPerformed(evt);
            }
        });

        iuser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iuser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/casa.png"))); // NOI18N

        javax.swing.GroupLayout panel22Layout = new javax.swing.GroupLayout(panel22);
        panel22.setLayout(panel22Layout);
        panel22Layout.setHorizontalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nomeFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel22Layout.setVerticalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iuser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(141, 123, 104));

        panel8.setBackground(new java.awt.Color(255, 255, 255));

        senhaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        senhaFuncionario.setText(" Senha:");
        senhaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFuncionarioActionPerformed(evt);
            }
        });

        isenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/senha.png"))); // NOI18N

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(senhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(isenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panel9.setBackground(new java.awt.Color(255, 255, 255));

        verificarSenhaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        verificarSenhaFuncionario.setText(" Repita a senha:");

        isenha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isenha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/senha.png"))); // NOI18N

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(verificarSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(verificarSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(isenha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bOlho.setBackground(new java.awt.Color(252, 252, 252));
        bOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/olho.png"))); // NOI18N
        bOlho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOlhoMouseClicked(evt);
            }
        });
        bOlho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOlhoActionPerformed(evt);
            }
        });

        bOlho1.setBackground(new java.awt.Color(252, 252, 252));
        bOlho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/olho.png"))); // NOI18N
        bOlho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOlho1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bOlho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOlho1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOlho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOlho1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
      
    }//GEN-LAST:event_bVoltarActionPerformed

    private void criarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarFuncionarioMouseEntered
        criarFuncionario.setBackground(new Color(63,66,73));
    }//GEN-LAST:event_criarFuncionarioMouseEntered

    private void criarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarFuncionarioMouseExited
        criarFuncionario.setBackground(new Color(79,84,101));
    }//GEN-LAST:event_criarFuncionarioMouseExited

    private void criarFuncionarioActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarFuncionarioActionPerformed1
       
    }//GEN-LAST:event_criarFuncionarioActionPerformed1

    private void nomeFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFuncionarioFocusLost

    }//GEN-LAST:event_nomeFuncionarioFocusLost

    private void nomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionarioActionPerformed

    private void telefoneFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFuncionarioActionPerformed

    private void senhaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFuncionarioActionPerformed

    private void bOlhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bOlhoMouseClicked
        if(activeButton &&  !(senhaFuncionario.getText().equals(" Senha:"))){
            bOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/olho-cruzado.png")));
            senhaFuncionario.setEchoChar('*');
            activeButton = false;

        }else if(activeButton == false &&  !(senhaFuncionario.getText().equals(" Senha:"))){
            bOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/olho.png")));
            senhaFuncionario.setEchoChar((char) 0);
            activeButton = true;
        }
    }//GEN-LAST:event_bOlhoMouseClicked

    private void bOlhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOlhoActionPerformed

    }//GEN-LAST:event_bOlhoActionPerformed

    private void bOlho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bOlho1MouseClicked
        if(activeButton1 &&  !(verificarSenhaFuncionario.getText().equals(" Repita a senha:"))){
            bOlho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/olho-cruzado.png")));
            verificarSenhaFuncionario.setEchoChar('*');
            activeButton1 = false;

        }else if(activeButton1 == false &&  !(verificarSenhaFuncionario.getText().equals(" Repita a senha:"))){
            bOlho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLabel/olho.png")));
            verificarSenhaFuncionario.setEchoChar((char) 0);
            activeButton1 = true;
        }
    }//GEN-LAST:event_bOlho1MouseClicked

    private void nomeFuncionario1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFuncionario1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionario1FocusLost

    private void nomeFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionario1ActionPerformed
    public javax.swing.JFormattedTextField getCpfFuncionario() {
        return this.cpfFuncionario;
    }

    public javax.swing.JFormattedTextField getTelefoneFuncionario() {
        return this.telefoneFuncionario;
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
            java.util.logging.Logger.getLogger(interface_criarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_criarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_criarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_criarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new interface_criarFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bOlho;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bOlho1;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bVoltar;
    private javax.swing.JComboBox<String> cargoFuncionario;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.FormatedTextField cpfFuncionario;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo criarFuncionario;
    private javax.swing.JLabel icpf;
    private javax.swing.JLabel isenha;
    private javax.swing.JLabel isenha2;
    private javax.swing.JLabel itel;
    private javax.swing.JLabel iuser;
    private javax.swing.JLabel iuser1;
    private javax.swing.JLabel iuser2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private jaboc_UI.jabocUI_Utilidades.TextField nomeFuncionario;
    private jaboc_UI.jabocUI_Utilidades.TextField nomeFuncionario1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    private jaboc_UI.jabocUI_Utilidades.Panel panel22;
    private jaboc_UI.jabocUI_Utilidades.Panel panel3;
    private jaboc_UI.jabocUI_Utilidades.Panel panel4;
    private jaboc_UI.jabocUI_Utilidades.Panel panel5;
    private jaboc_UI.jabocUI_Utilidades.Panel panel6;
    private jaboc_UI.jabocUI_Utilidades.Panel panel8;
    private jaboc_UI.jabocUI_Utilidades.Panel panel9;
    private jaboc_UI.jabocUI_Utilidades.PasswordField senhaFuncionario;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.FormatedTextField telefoneFuncionario;
    private jaboc_UI.jabocUI_Utilidades.PasswordField verificarSenhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
