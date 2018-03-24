package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EnderecoDao {

    public void inserirEndereco(EnderecoBean eb) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into endereco(Tipo_End, Endereco, UF, Complemento, Bairro, CEP, "
                        + "Numero, Cidade"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setInt(1, eb.getTipo());
                stm.setString(2, eb.getTxtEndereco());
                stm.setInt(3, eb.getUf());
                stm.setString(4, eb.getTxtComplemento());
                stm.setString(5, eb.getTxtBairro());
                stm.setString(6, eb.getTxtCEP());
                stm.setString(7, eb.getTxtNRO());
                stm.setString(8, eb.getTxtCidade());
                stm.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
