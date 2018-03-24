/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jéssica
 */
public class DadosCadastrais extends javax.swing.JFrame {

    /**
     * Creates new form DadosCadastrais
     */
    public DadosCadastrais() {
        initComponents();
        setIcon();
    }

    public void limparCampos() {

        String message = " Deseja realmente limpar tudo? ";
        String title = "Limpar Dados";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            txtRede.setText("");
            txtLoja.setText("");
            txtNomeFantasia.setText("");
            txtRazaoSocial.setText("");
            txtCep.setText("");
            txtInscrEstadual.setText("");
            txtInscrMunicipal.setText("");
            txtCNPJ.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtComplemento.setText("");
            txtDDD.setText("");
            txtDDI.setText("");
            txtEmail.setText("");
            txtEndereco.setText("");
            txtInscrSuframa.setText("");
            txtNumero.setText("");
            txtSite.setText("");
            txtTelefone1.setText("");
            txtTelefone2.setText("");
            cmbUF.setSelectedIndex(0);
            lblImagem.setIcon(null);

        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtInscrEstadual = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtDDI = new javax.swing.JTextField();
        txtInscrSuframa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSite = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtInscrMunicipal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTelefone1 = new javax.swing.JTextField();
        txtTelefone2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cmbUF = new javax.swing.JComboBox();
        txtLoja = new javax.swing.JTextField();
        txtRede = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados Cadastrais");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nº de rede:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nº de loja:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome fantasia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Razão social:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Inscr. Municipal:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 191, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CEP:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Endereço:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Bairro:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Complemento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("DDI:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Insc. SUFRAMA:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 341, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("E-mail:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 341, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Site:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 367, -1, -1));

        txtNomeFantasia.setEditable(false);
        txtNomeFantasia.setText("ATENDE AR CONDICIONADO E REFRIGERACAO");
        jPanel1.add(txtNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 99, 415, -1));

        txtRazaoSocial.setEditable(false);
        txtRazaoSocial.setText("JC & R REFRIGERAÇAO COMERCIOS E SERVIÇOS LTDA");
        txtRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoSocialActionPerformed(evt);
            }
        });
        jPanel1.add(txtRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 127, 420, -1));

        txtInscrEstadual.setEditable(false);
        txtInscrEstadual.setText("206.000.324.115");
        jPanel1.add(txtInscrEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 158, 161, -1));

        txtEndereco.setEditable(false);
        txtEndereco.setText("RUA INDEPENDENCIA");
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 215, 352, -1));

        txtBairro.setEditable(false);
        txtBairro.setText("VILA BOA VISTA");
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 141, -1));

        txtComplemento.setEditable(false);
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 277, 452, -1));

        txtDDI.setEditable(false);
        txtDDI.setText("55");
        jPanel1.add(txtDDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 308, 50, -1));

        txtInscrSuframa.setEditable(false);
        jPanel1.add(txtInscrSuframa, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 339, 135, -1));

        txtEmail.setEditable(false);
        txtEmail.setText("atendimento@atendeserv.com.br");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 339, 309, -1));

        txtSite.setEditable(false);
        txtSite.setText("www.atendeserv.com.br");
        jPanel1.add(txtSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 365, 541, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("CNPJ:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Nº");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 217, 21, -1));

        txtInscrMunicipal.setEditable(false);
        txtInscrMunicipal.setText("ISENTO");
        jPanel1.add(txtInscrMunicipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 189, 156, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Inscr. Estadual:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 160, -1, -1));

        txtNumero.setEditable(false);
        txtNumero.setText("104");
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 215, 56, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Cidade:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 248, -1, -1));

        txtCidade.setEditable(false);
        txtCidade.setText("BARUERI");
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 246, 170, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("UF");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 248, 21, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("DDD:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 310, -1, -1));

        txtDDD.setEditable(false);
        txtDDD.setText("11");
        jPanel1.add(txtDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 308, 32, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Telefone:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 310, -1, -1));

        txtTelefone1.setEditable(false);
        txtTelefone1.setText("4198-2180");
        jPanel1.add(txtTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 308, 131, -1));

        txtTelefone2.setEditable(false);
        txtTelefone2.setText("7845-8138");
        jPanel1.add(txtTelefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 308, 146, -1));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Dados Cadastrais da Empresa");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 21, -1, -1));

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 100, 30));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/DadosCadastrais.PNG"))); // NOI18N
        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 11, 119, 124));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Empresa grande.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("ou");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 310, -1, -1));

        cmbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));
        cmbUF.setEnabled(false);
        jPanel1.add(cmbUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 246, 60, -1));

        txtLoja.setEditable(false);
        txtLoja.setText("001");
        jPanel1.add(txtLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 40, -1));

        txtRede.setEditable(false);
        txtRede.setText("0001");
        txtRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedeActionPerformed(evt);
            }
        });
        jPanel1.add(txtRede, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 40, -1));

        txtCep.setEditable(false);
        txtCep.setText("06419-000");
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, -1));

        txtCNPJ.setEditable(false);
        txtCNPJ.setText("12.074.187/0001-57");
        jPanel1.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 160, -1));

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair peq.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 100, 30));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar peq.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 100, 30));

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

        setSize(new java.awt.Dimension(758, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtRede.setEditable(true);
        txtLoja.setEditable(true);
        txtNomeFantasia.setEditable(true);
        txtRazaoSocial.setEditable(true);
        txtCep.setEditable(true);
        txtInscrEstadual.setEditable(true);
        txtInscrMunicipal.setEditable(true);
        txtCNPJ.setEditable(true);
        txtBairro.setEditable(true);
        txtCidade.setEditable(true);
        txtComplemento.setEditable(true);
        txtDDD.setEditable(true);
        txtDDI.setEditable(true);
        txtEmail.setEditable(true);
        txtEndereco.setEditable(true);
        txtInscrSuframa.setEditable(true);
        txtNumero.setEditable(true);
        txtSite.setEditable(true);
        txtTelefone1.setEditable(true);
        txtTelefone2.setEditable(true);
        cmbUF.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoSocialActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        DadosCadastrais LG = new DadosCadastrais();
        LG.setVisible(false);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        txtRede.setEditable(false);
        txtLoja.setEditable(false);
        txtNomeFantasia.setEditable(false);
        txtRazaoSocial.setEditable(false);
        txtCep.setEditable(false);
        txtInscrEstadual.setEditable(false);
        txtInscrMunicipal.setEditable(false);
        txtCNPJ.setEditable(false);
        txtBairro.setEditable(false);
        txtCidade.setEditable(false);
        txtComplemento.setEditable(false);
        txtDDD.setEditable(false);
        txtDDI.setEditable(false);
        txtEmail.setEditable(false);
        txtEndereco.setEditable(false);
        txtInscrSuframa.setEditable(false);
        txtNumero.setEditable(false);
        txtSite.setEditable(false);
        txtTelefone1.setEditable(false);
        txtTelefone2.setEditable(false);
        cmbUF.setEditable(false);      // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void run() {
        new DadosCadastrais().setVisible(true);

    }
    ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtDDI;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInscrEstadual;
    private javax.swing.JTextField txtInscrMunicipal;
    private javax.swing.JTextField txtInscrSuframa;
    private javax.swing.JTextField txtLoja;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtRede;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTelefone1;
    private javax.swing.JTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //To change body of generated methods, choose Tools | Templates.
    }

    private String retornacaminho() throws java.lang.NullPointerException {
        String file = "";
        JFileChooser dlg = new JFileChooser();
        int opcion = dlg.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            file += dlg.getSelectedFile().getPath();
            lblImagem.setIcon(new ImageIcon(file));
            ImageIcon icon = new ImageIcon(file);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(121, 123, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);        // TODO add your handling code here:
            lblImagem.setIcon(newIcon);
            lblImagem.setSize(104, 14);

            //   System.out.println("Caminho do arquivo : "+file);
        }
        return file;
    }

}
