/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import BancoDeDados.ProdutoBean;
import BancoDeDados.ProdutoDao;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jéssica
 */
public class CadProduto extends javax.swing.JFrame {

    private DefaultTableModel DefaultTableModel;
    ProdutoDao pd = new ProdutoDao();
    ProdutoBean pb;

    public void pegaInformacoesDosCampos() {
        pb = new ProdutoBean();
        pb.setStatus(Status.getSelectedIndex());
        pb.setTxtCodigoParte(txtCodigoParte.getText());
        pb.setTxtQuantidade(txtQuantidade.getText());
        pb.setTxtFornecedor(txtFornecedor.getText());
        pb.setTxtFabricante(txtFabricante.getText());
        pb.setTxtReferencia(txtReferencia.getText());
        pb.setTxtModelo(txtModelo.getText());
        pb.setTxtCapacidade(txtCapacidade.getText());
        pb.setTxtST(txtST.getText());
        pb.setTxtCSOSN(txtCSOSN.getText());
        pb.setTxtDescricao(txtDescricao.getText());
        pb.setTxtFaixaPreco(txtFaixaPreco.getText());
        pb.setTxtFaixaPreco2(txtFaixaPreco2.getText());

        if (caminhoDaImagem == null) {
            imagemPadrao();
        } else {
            pb.setImagem(caminhoDaImagem);
        }

        pb.setTxtGrupo(txtGrupo.getText());
        pb.setTxtICMS(txtICMS.getText());
        pb.setTxtNCM(txtNCM.getText());

    }

    private void imagemPadrao() {

        String file = "./imagemPadrão/padrão.png";
        lblImagem.setIcon(new ImageIcon(file));
        ImageIcon icon = new ImageIcon(file);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(121, 123, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        lblImagem.setIcon(newIcon);
        lblImagem.setSize(104, 14);
        BancoDeDados.ProdutoBean P = new BancoDeDados.ProdutoBean();
        P.setImagem("./imagemPadrão/padrão.png");
    }

    public CadProduto() {
        initComponents();
        txtDescricao.setLineWrap(true);
        setIcon();

    }

    public void limparCampos() {

        String message = " Deseja realmente limpar tudo? ";
        String title = "Limpar Dados";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            apagarCampos();

        }
    }

    public void apagarCampos() {
        txtCodigo.setText("");
        txtCodigoParte.setText("");
        txtQuantidade.setText("");
        txtFornecedor.setText("");
        txtFabricante.setText("");
        txtReferencia.setText("");
        txtModelo.setText("");
        txtCapacidade.setText("");
        txtST.setText("");
        txtCSOSN.setText("");
        txtDescricao.setText("");
        txtFaixaPreco.setText("");
        txtFaixaPreco2.setText("");
        txtGrupo.setText("");
        txtNCM.setText("");
        txtICMS.setText("");
        Status.setSelectedIndex(0);
        lblImagem.setIcon(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnInternet = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCodigoParte = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCapacidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtST = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCSOSN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFaixaPreco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFaixaPreco2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNCM = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtICMS = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnSalvar2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pasta de foto.png"))); // NOI18N
        jButton2.setText("Selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 140, 121, -1));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/padrão.png"))); // NOI18N
        lblImagem.setText("     ");
        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagem.setMaximumSize(new java.awt.Dimension(0, 0));
        lblImagem.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 11, 121, 123));

        btnInternet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Internet.png"))); // NOI18N
        btnInternet.setText("Internet");
        btnInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternetActionPerformed(evt);
            }
        });
        jPanel1.add(btnInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 171, 121, -1));

        btnRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 203, 121, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cadastro de Produtos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, -1, 44));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produtos.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 44));

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair_1.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 100, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Código:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 65, 115, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Código Parte:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        txtCodigoParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoParteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoParte, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 96, 115, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Status:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, 25));

        Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0- Disponivel", "1- Indisponivel"}));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 125, 115, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantidade:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));
        jPanel1.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 153, 115, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fornecedor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, -1, -1));

        txtFornecedor.setColumns(10);
        jPanel1.add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 179, 115, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Fabricante:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, -1, -1));

        txtFabricante.setColumns(2);
        jPanel1.add(txtFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 210, 115, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Referência:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, -1, -1));
        jPanel1.add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 241, 115, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Modelo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, -1, -1));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 272, 115, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Capacidade:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 312, -1, -1));
        jPanel1.add(txtCapacidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 310, 115, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("ST:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 65, -1, -1));

        txtST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSTActionPerformed(evt);
            }
        });
        jPanel1.add(txtST, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 60, 120, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("CSOSN:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, 20));
        jPanel1.add(txtCSOSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 60, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Descrição:");
        jLabel7.setName("lblDescricao"); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 98, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Faixa de preço:");
        jLabel8.setName("lblFaixaPreco"); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        txtFaixaPreco.setName("txtFaixaPreco"); // NOI18N
        jPanel1.add(txtFaixaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("à");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        txtFaixaPreco2.setName("txtFaixaPreco2"); // NOI18N
        jPanel1.add(txtFaixaPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 180, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Grupo:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));
        jPanel1.add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 120, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("NCM:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 20));
        jPanel1.add(txtNCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("ICMS:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));
        jPanel1.add(txtICMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 120, -1));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnLimpar.setText("Limpar ");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 370, 100, 30));

        btnSalvar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar peq.png"))); // NOI18N
        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 100, 30));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane3.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 310, 80));

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

        setSize(new java.awt.Dimension(938, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed

        if ((txtCapacidade.getText().isEmpty()) || (txtFabricante.getText().isEmpty()) || (txtFornecedor.getText().isEmpty()) || (txtGrupo.getText().isEmpty()) || (txtModelo.getText().isEmpty()) || (txtQuantidade.getText().isEmpty() || (txtReferencia.getText().isEmpty()) || (txtFaixaPreco.getText().isEmpty()) || (txtFaixaPreco2.getText().isEmpty()))) {
            JOptionPane.showMessageDialog(null, "Alguns campos não podem retornar vazios");
        } else {
            pegaInformacoesDosCampos();
            pd.inserirProduto(pb);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso! ", "Aviso", 1);
            apagarCampos();

        }
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();       // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSTActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void txtCodigoParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoParteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoParteActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        CadProduto LG = new CadProduto();
        LG.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        lblImagem.setIcon(null);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetActionPerformed
        Desktop desk = java.awt.Desktop.getDesktop();
        try {
            desk.browse(new java.net.URI("https://www.google.com.br/imghp?hl=pt-BR&tab=wi&ei=hFvtUqmWLIjskQePxoDADQ&ved=0CAQQqi4oAg//"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInternetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BancoDeDados.ProdutoBean PO = new BancoDeDados.ProdutoBean();
        PO.setImagem(this.retornacaminho());
    }//GEN-LAST:event_jButton2ActionPerformed

    public void run() {
        new CadProduto().setVisible(true);

    }
    ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Status;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInternet;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtCSOSN;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoParte;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFaixaPreco;
    private javax.swing.JTextField txtFaixaPreco2;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtICMS;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNCM;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtST;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //To change body of generated methods, choose Tools | Templates.
    }

    String caminhoDaImagem;

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
            caminhoDaImagem = file;

            //   System.out.println("Caminho do arquivo : "+file);
        }
        return file;

    }
}
