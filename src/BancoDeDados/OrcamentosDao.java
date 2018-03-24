package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OrcamentosDao {

    public void inserirOrcamentos(OrcamentosBean ob) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into orcamento(Funcionario, Cliente, Status, Ano, Inicio, Fim, Descricao, Desconto, Preco, Total, Qtde, Cod_Instalacao, Cod_Manutencao "
                        + ") values "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, ob.getTxtVendedor());
                stm.setString(2, ob.getTxtCliente());
                stm.setInt(3, ob.getStatus());
                stm.setString(4, ob.getTxtAno());
                stm.setString(5, ob.getTxtInicio());
                stm.setString(6, ob.getTxtFim());
                stm.setString(7, ob.getTxtDescricao());
                stm.setString(8, ob.getTxtDesconto());
                stm.setString(9, ob.getTxtPreco());
                stm.setString(10, ob.getTxtTotal());
                stm.setString(11, ob.getTxtQtde());
                stm.setInt(12, ob.getInstalacao());
                stm.setInt(13, ob.getManutencao());
                stm.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
