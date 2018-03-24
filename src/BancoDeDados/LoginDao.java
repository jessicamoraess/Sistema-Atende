package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDao {

    public void inserirLogin(LoginBean lb) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into login_senha(Login, Senha) values "
                        + "(?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, lb.getTxtLogin());
                stm.setString(2, lb.getTxtSenha());
                stm.execute();

                JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
