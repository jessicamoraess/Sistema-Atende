package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FornecedorDao {

    public void inserirFornecedor(FornecedorBean fb) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql, sql2, sql3;
                sql = "insert into cad_fornecedores(Fantasia, CNPJ, Nome, HP,"
                        + "Observacao, Tipo_Fornecedor, Foto) values "
                        + "(?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, fb.getTxtFantasia());
                stm.setString(2, fb.getTxtCNPJ());
                stm.setString(3, fb.getTxtNome());
                stm.setString(4, fb.getTxtHP());
                stm.setString(5, fb.getTxtObs());
                stm.setInt(6, fb.getTipo());
                stm.setString(7, fb.getImagem());
                stm.executeUpdate();

                //aqui começa o select para pegar o codigo do cliente e usar na tabela de telefone
                sql = "select Cod_Forn from cad_fornecedores where Fantasia = ? and CNPJ = ? and Nome = ? and HP = ? and Observacao = ? and Tipo_Fornecedor = ? and Foto = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, fb.getTxtFantasia());
                stm.setString(2, fb.getTxtCNPJ());
                stm.setString(3, fb.getTxtNome());
                stm.setString(4, fb.getTxtHP());
                stm.setString(5, fb.getTxtObs());
                stm.setInt(6, fb.getTipo());
                stm.setString(7, fb.getImagem());
                stm.execute();

                ResultSet rs = stm.getResultSet();

                rs.first();

                //aqui começa a inserir na tabela telefone
                sql2 = "insert into telefones(Cod_Forn, Telefone_Res, Telefone_Com, Celular, Fax, Email)"
                        + "values (?,?,?,?,?,?)";

                PreparedStatement stm2 = con.prepareStatement(sql2);
                stm2.setInt(1, rs.getInt("Cod_Forn"));
                stm2.setString(2, fb.getTxtTelefone());
                stm2.setString(3, fb.getTxtComercial());
                stm2.setString(4, fb.getTxtCelular());
                stm2.setString(5, fb.getTxtFAX());
                stm2.setString(6, fb.getTxtEmail());
                stm2.execute();

                //aqui começa o select para pegar o codigo do cliente e usar na tabela de endereco
                sql = "select Cod_Forn from cad_fornecedores where Fantasia = ? and CNPJ = ? and Nome = ? and HP = ? and Observacao = ? and Tipo_Fornecedor = ? and Foto = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, fb.getTxtFantasia());
                stm.setString(2, fb.getTxtCNPJ());
                stm.setString(3, fb.getTxtNome());
                stm.setString(4, fb.getTxtHP());
                stm.setString(5, fb.getTxtObs());
                stm.setInt(6, fb.getTipo());
                stm.setString(7, fb.getImagem());
                stm.execute();

                ResultSet rs2 = stm.getResultSet();

                rs2.first();

                //aqui começa a inserir na tabela endereço
                sql3 = "insert into endereco(Cod_Forn, Tipo_End, Endereco, UF, Complemento, Bairro, CEP, "
                        + "Numero, Cidade"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm3 = con.prepareStatement(sql3);
                stm3.setInt(1, rs2.getInt("Cod_Forn"));
                stm3.setInt(2, fb.getTipoEnd());
                stm3.setString(3, fb.getTxtEndereco());
                stm3.setInt(4, fb.getUf());
                stm3.setString(5, fb.getTxtComplemento());
                stm3.setString(6, fb.getTxtBairro());
                stm3.setString(7, fb.getTxtCEP());
                stm3.setString(8, fb.getTxtNRO());
                stm3.setString(9, fb.getTxtCidade());
                stm3.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
