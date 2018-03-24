package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDao {

    public void inserirProduto(ProdutoBean pb) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into Cad_Produtos(ST, CSOSN, Cod_Parte, Status_Prod, "
                        + "Quantidade, Fabricante, Referencia, Fornecedor, Modelo,"
                        + "Capacidade, Descricao, Faixa_De_Preco, Faixa_De_Preco2, Foto_Prod, Grupo,"
                        + "NCM, ICMS) values "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, pb.getTxtST());
                stm.setString(2, pb.getTxtCSOSN());
                stm.setString(3, pb.getTxtCodigoParte());
                stm.setInt(4, pb.getStatus());
                stm.setString(5, pb.getTxtQuantidade());
                stm.setString(6, pb.getTxtFabricante());
                stm.setString(7, pb.getTxtReferencia());
                stm.setString(8, pb.getTxtFornecedor());
                stm.setString(9, pb.getTxtModelo());
                stm.setString(10, pb.getTxtCapacidade());
                stm.setString(11, pb.getTxtDescricao());
                stm.setString(12, pb.getTxtFaixaPreco());
                stm.setString(13, pb.getTxtFaixaPreco2());
                stm.setString(14, pb.getImagem());
                stm.setString(15, pb.getTxtGrupo());
                stm.setString(16, pb.getTxtNCM());
                stm.setString(17, pb.getTxtICMS());
                stm.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
