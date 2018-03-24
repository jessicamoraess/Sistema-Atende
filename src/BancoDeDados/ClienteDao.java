package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDao {

    public void inserirCliente(ClienteBean cb) {
        try { //aqui começa a inserir na cad ciente
            try (Connection con = conexao.getConnection()) {
                String sql, sql2, sql3;
                sql = "insert into cad_cliente(CNPJ, Fantasia, Tipo_Cliente, "
                        + "Observacao, Foto, HP, CPF, Sexo,"
                        + "RG, Nome, Data_nasc, Profissao, fis_jur, Sms"
                        + ") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, cb.getTxtCNPJ());
                stm.setString(2, cb.getTxtFantasia());
                stm.setInt(3, cb.getTipo());
                stm.setString(4, cb.getTxtObs());
                stm.setString(5, cb.getImagem());
                stm.setString(6, cb.getTxtHP());
                stm.setString(7, cb.getTxtCPF());
                stm.setInt(8, cb.getSexo());
                stm.setString(9, cb.getTxtRG());
                stm.setString(10, cb.getTxtNome());
                stm.setString(11, cb.getData());
                stm.setString(12, cb.getTxtProfissao());
                stm.setInt(13, cb.getPessoa());
                stm.setInt(14, cb.getSms());
                stm.executeUpdate();

                //aqui começa o select para pegar o codigo do cliente e usar na tabela de telefone
                sql = "select Cod_Cli from cad_cliente where CNPJ = ? and Fantasia = ? and Tipo_Cliente = ? and Observacao = ? and Foto = ? and HP = ? and CPF = ? and Sexo = ? and  RG = ? and  Nome = ? and  Data_nasc = ? and  Profissao = ? and fis_jur = ? and Sms = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, cb.getTxtCNPJ());
                stm.setString(2, cb.getTxtFantasia());
                stm.setInt(3, cb.getTipo());
                stm.setString(4, cb.getTxtObs());
                stm.setString(5, cb.getImagem());
                stm.setString(6, cb.getTxtHP());
                stm.setString(7, cb.getTxtCPF());
                stm.setInt(8, cb.getSexo());
                stm.setString(9, cb.getTxtRG());
                stm.setString(10, cb.getTxtNome());
                stm.setString(11, cb.getData());
                stm.setString(12, cb.getTxtProfissao());
                stm.setInt(13, cb.getPessoa());
                stm.setInt(14, cb.getSms());
                stm.execute();

                ResultSet rs = stm.getResultSet();

                rs.first();

                //aqui começa a inserir na tabela telefone
                sql2 = "insert into telefones(Cod_Cli, Telefone_Res, Telefone_Com, Celular, Fax, Email)"
                        + "values (?,?,?,?,?,?)";

                PreparedStatement stm2 = con.prepareStatement(sql2);
                stm2.setInt(1, rs.getInt("Cod_Cli"));
                stm2.setString(2, cb.getTxtTelefone());
                stm2.setString(3, cb.getTxtComercial());
                stm2.setString(4, cb.getTxtCelular());
                stm2.setString(5, cb.getTxtFAX());
                stm2.setString(6, cb.getTxtEmail());
                stm2.execute();

                //aqui começa o select para pegar o codigo do cliente e usar na tabela de endereco
                sql = "select Cod_Cli from cad_cliente where CNPJ = ? and Fantasia = ? and Tipo_Cliente = ? and Observacao = ? and Foto = ? and HP = ? and CPF = ? and Sexo = ? and  RG = ? and  Nome = ? and  Data_nasc = ? and  Profissao = ? and fis_jur = ? and Sms = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, cb.getTxtCNPJ());
                stm.setString(2, cb.getTxtFantasia());
                stm.setInt(3, cb.getTipo());
                stm.setString(4, cb.getTxtObs());
                stm.setString(5, cb.getImagem());
                stm.setString(6, cb.getTxtHP());
                stm.setString(7, cb.getTxtCPF());
                stm.setInt(8, cb.getSexo());
                stm.setString(9, cb.getTxtRG());
                stm.setString(10, cb.getTxtNome());
                stm.setString(11, cb.getData());
                stm.setString(12, cb.getTxtProfissao());
                stm.setInt(13, cb.getPessoa());
                stm.setInt(14, cb.getSms());
                stm.execute();

                ResultSet rs2 = stm.getResultSet();

                rs2.first();

                //aqui começa a inserir na tabela endereço
                sql3 = "insert into endereco(Cod_Cli, Tipo_End, Endereco, UF, Complemento, Bairro, CEP, "
                        + "Numero, Cidade"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm3 = con.prepareStatement(sql3);
                stm3.setInt(1, rs2.getInt("Cod_Cli"));
                stm3.setInt(2, cb.getTipoEnd());
                stm3.setString(3, cb.getTxtEndereco());
                stm3.setInt(4, cb.getUf());
                stm3.setString(5, cb.getTxtComplemento());
                stm3.setString(6, cb.getTxtBairro());
                stm3.setString(7, cb.getTxtCEP());
                stm3.setString(8, cb.getTxtNRO());
                stm3.setString(9, cb.getTxtCidade());
                stm3.execute();

                //JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
