package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioDao {

    public void inserirFuncionario(FuncionarioBean funb) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql, sql2, sql3;
                sql = "insert into cad_funcionario(Nome, Sexo, CPF, Data_Nasc, RG, Foto, Observacao) values "
                        + "(?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, funb.getTxtNome());
                stm.setInt(2, funb.getSexo());
                stm.setString(3, funb.getTxtCPF());
                stm.setString(4, funb.getTxtData());
                stm.setString(5, funb.getTxtRG());
                stm.setString(6, funb.getImagem());
                stm.setString(7, funb.getTxtObs());
                stm.executeUpdate();

                //aqui começa o select para pegar o codigo do cliente e usar na tabela de telefone
                sql = "select Cod_Fun from cad_funcionario where Nome = ? and Sexo = ? and CPF = ? and Data_Nasc = ? and RG = ? and Foto = ? and Observacao = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, funb.getTxtNome());
                stm.setInt(2, funb.getSexo());
                stm.setString(3, funb.getTxtCPF());
                stm.setString(4, funb.getTxtData());
                stm.setString(5, funb.getTxtRG());
                stm.setString(6, funb.getImagem());
                stm.setString(7, funb.getTxtObs());

                stm.execute();

                ResultSet rs = stm.getResultSet();

                rs.first();

                //aqui começa a inserir na tabela telefone
                sql2 = "insert into telefones(Cod_Fun, Telefone_Res, Telefone_Com, Celular, Fax, Email)"
                        + "values (?,?,?,?,?,?)";

                PreparedStatement stm2 = con.prepareStatement(sql2);
                stm2.setInt(1, rs.getInt("Cod_Fun"));
                stm2.setString(2, funb.getTxtTelefone());
                stm2.setString(3, funb.getTxtComercial());
                stm2.setString(4, funb.getTxtCelular());
                stm2.setString(5, funb.getTxtFAX());
                stm2.setString(6, funb.getTxtEmail());
                stm2.execute();

                //aqui começa o select para pegar o codigo do cliente e usar na tabela de endereco
                sql = "select Cod_Fun from cad_funcionario where Nome = ? and Sexo = ? and CPF = ? and Data_Nasc = ? and RG = ? and Foto = ? and Observacao = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, funb.getTxtNome());
                stm.setInt(2, funb.getSexo());
                stm.setString(3, funb.getTxtCPF());
                stm.setString(4, funb.getTxtData());
                stm.setString(5, funb.getTxtRG());
                stm.setString(6, funb.getImagem());
                stm.setString(7, funb.getTxtObs());

                stm.execute();

                ResultSet rs2 = stm.getResultSet();

                rs2.first();

                //aqui começa a inserir na tabela endereço
                sql3 = "insert into endereco(Cod_Fun, Tipo_End, Endereco, UF, Complemento, Bairro, CEP, "
                        + "Numero, Cidade"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm3 = con.prepareStatement(sql3);
                stm3.setInt(1, rs2.getInt("Cod_Fun"));
                stm3.setInt(2, funb.getTipoEnd());
                stm3.setString(3, funb.getTxtEndereco());
                stm3.setInt(4, funb.getUf());
                stm3.setString(5, funb.getTxtComplemento());
                stm3.setString(6, funb.getTxtBairro());
                stm3.setString(7, funb.getTxtCEP());
                stm3.setString(8, funb.getTxtNRO());
                stm3.setString(9, funb.getTxtCidade());
                stm3.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
