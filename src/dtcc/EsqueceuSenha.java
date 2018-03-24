/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import BD.BD;
import BD.TratamentoDeEmail;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jéssica
 */
public class EsqueceuSenha extends javax.swing.JFrame {

    BD conn = new BD();
    TratamentoDeEmail enviaEmail = new TratamentoDeEmail();
    boolean v = true;

    /**
     * Creates new form EsqueceuSenha2
     */
    public EsqueceuSenha() {
        initComponents();
        setIcon();
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
        lblUsuario = new javax.swing.JLabel();
        jNomeUsuario = new javax.swing.JTextField();
        jEnviarEmail = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Esqueceu sua senha?");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Nome do Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 41, -1, -1));
        jPanel1.add(jNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 62, 227, -1));

        jEnviarEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEnviarEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Email.png"))); // NOI18N
        jEnviarEmail.setText("Mandar para o E-mail");
        jEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnviarEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jEnviarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 100, 227, -1));

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair_1.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, 30));

        lblIcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Email_1.png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 137, 179));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(416, 247));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnviarEmailActionPerformed
        jNomeUsuario.setEnabled(false);
        jEnviarEmail.setEnabled(false);
        String email;
        String nomeUsuario = jNomeUsuario.getText();
        String Senha = null;
        try {
            conn.conectando();
            String sql = "select* from login_senha where Login='" + nomeUsuario + "';";
            BD.executaSQL(sql);
            if (BD.rs.next()) {
                Senha = BD.rs.getString("Senha");
                email = BD.rs.getString("email");
                enviaEmail.enviarEmail(email, nomeUsuario, Senha);
                JOptionPane.showMessageDialog(null, "Senha enviada com sucesso", "Esqueceu a senha", JOptionPane.INFORMATION_MESSAGE);

                jNomeUsuario.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "O nome de usuario digitado é invalido", "Esqueceu a senha", JOptionPane.ERROR_MESSAGE);
                jNomeUsuario.setText("");

            }

            jEnviarEmail.setEnabled(true);

            jNomeUsuario.setEnabled(true);

        } catch (SQLException ex) {
            Logger.getLogger(EsqueceuSenha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EsqueceuSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jEnviarEmailActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        EsqueceuSenha LG = new EsqueceuSenha();
        LG.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    public void run() {
        new EsqueceuSenha().setVisible(true);

    }
    ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton jEnviarEmail;
    private javax.swing.JTextField jNomeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    //To change body of generated methods, choose Tools | Templates.
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png")));
    }
}
