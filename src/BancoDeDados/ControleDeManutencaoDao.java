package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleDeManutencaoDao {

    public void inserirManutencao(ControleDeManutencaoBean cmb) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into manutencao(Tipo_Manutencao, Ultima_Manutencao, Descricao_Do_Produto,  Proxima_Manutencao, Descricao_Do_Problema, Nome_Funcionario,  Nome_Cliente, Cod_Cli, Cod_Fun"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setInt(1, cmb.getTipo());
                stm.setString(2, cmb.getTxtUltima());
                stm.setString(3, cmb.getTxtDescricaoProduto());
                stm.setString(4, cmb.getTxtProxima());
                stm.setString(5, cmb.getTxtDescricaoProblema());
                stm.setString(6, cmb.getTxtNomeFun());
                stm.setString(7, cmb.getTxtNomeCli());
                stm.setString(8, cmb.getTxtCodCli());
                stm.setString(9, cmb.getTxtCodFun());
                stm.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
