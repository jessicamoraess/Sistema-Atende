package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleDeInstalacaoDao {

    public void inserirInstalacao(ControleDeInstalacaoBean cib) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into instalacao(Cod_Cli, Nome_Cliente, Cod_Fun, Nome_Funcionario,"
                        + "Primeira_Manutencao, Descricao_Produto, Data_Instalacao, Horario"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?)";

                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, cib.getTxtCodCli());
                stm.setString(2, cib.getTxtNomeCli());
                stm.setString(3, cib.getTxtCodFun());
                stm.setString(4, cib.getTxtNomeFun());
                stm.setString(5, cib.getTxtPrimeiraManutencao());
                stm.setString(6, cib.getTxtDescricaoProduto());
                stm.setString(7, cib.getTxtDataInstalacao());
                stm.setString(8, cib.getTxtHorario());
                stm.executeUpdate();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
