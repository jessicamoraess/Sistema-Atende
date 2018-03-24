/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import BD.BD;
import static BD.BD.con;
import static BD.BD.statement;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jéssica
 */
public class TrocarSenha extends javax.swing.JFrame {

    /**
     * Creates new form TrocarSenhas
     */
    BD conn = new BD();

    public TrocarSenha() {
        initComponents();
        setIcon();
        btnConfirmar.setToolTipText("Clique aqui se deseja confirmar os dados");

    }

    public void limparCampos() {

        String message = " Deseja realmente limpar tudo? ";
        String title = "Limpar Dados";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            txtUsuario.setText("");
            txtSenhaAtual.setText("");
            txtNovaSenha.setText("");
            txtConfirmarSenha.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSenhaAtual = new javax.swing.JLabel();
        lblNovaSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenhaAtual = new javax.swing.JPasswordField();
        txtNovaSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        btnConfirmar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trocar Senha");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Digite o nome de usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 25, -1, -1));

        lblSenhaAtual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSenhaAtual.setText("Senha atual:");
        jPanel1.add(lblSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 56, -1, -1));

        lblNovaSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNovaSenha.setText("Nova senha:");
        jPanel1.add(lblNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 94, -1, -1));

        lblConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConfirmarSenha.setText("Confirmar nova senha:");
        jPanel1.add(lblConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 132, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 23, 150, -1));
        jPanel1.add(txtSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 54, 150, -1));
        jPanel1.add(txtNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 92, 150, -1));
        jPanel1.add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 130, 150, -1));

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Check.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 190, -1, -1));

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair peq.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 190, -1, -1));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnLimpar.setText("Limpar tudo");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 190, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblIcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Senha.png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 0, -1, 215));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(545, 264));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        TrocarSenha LG = new TrocarSenha();
        LG.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (txtNovaSenha.getText().equals("") | txtConfirmarSenha.getText().equals("") | txtUsuario.getText().equals("") | txtSenhaAtual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar em branco", "Há campos em branco", JOptionPane.INFORMATION_MESSAGE);
        } else {

            // Arrumar isso aqui, deve sofrer essa alteração// 
            if (txtNovaSenha.getText().equals(txtConfirmarSenha.getText())) {
                try {
                    conn.conectando();
                    String sql = "select * from login_senha Where Login like '" + txtUsuario.getText() + "' and Senha like '" + txtSenhaAtual.getText() + "';";
                    BD.executaSQL(sql);
                    String nomee = "Deseja realmente fazer essa alteração ?";
                    int n = JOptionPane.showConfirmDialog(null, nomee, "Alteração de Senha", JOptionPane.YES_NO_OPTION);

                    if (n == JOptionPane.YES_OPTION) {
                        String sql2 = "update login_senha set Senha = '" + txtConfirmarSenha.getText() + "' where Login='" + txtUsuario.getText() + "';";
                        BD.salvarDados(sql2);
                        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso", "Trocar senha", JOptionPane.INFORMATION_MESSAGE);
                        txtUsuario.setText("");
                        txtNovaSenha.setText("");
                        txtSenhaAtual.setText("");
                        txtConfirmarSenha.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Alteração não realizada !", "Alteração não concluida", JOptionPane.INFORMATION_MESSAGE);
                        txtUsuario.setText("");
                        txtNovaSenha.setText("");
                        txtSenhaAtual.setText("");
                        txtConfirmarSenha.setText("");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro está aqui: " + e);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger("Erro Grave");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O que foi digitado no campo nova senha é diferente do campo confirma nova senha !", "Alteração não concluida", JOptionPane.PLAIN_MESSAGE);
                txtNovaSenha.setText("");
                txtConfirmarSenha.setText("");
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public void run() {
        new TrocarSenha().setVisible(true);

    }
    ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNovaSenha;
    private javax.swing.JLabel lblSenhaAtual;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtSenhaAtual;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //To change body of generated methods, choose Tools | Templates.
    }
}
