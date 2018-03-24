package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DadosCadastraisDao {

    public void inserirDadosCadastrais(DadosCadastraisBean db) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into dados_empresa(Fantasia, Razao_Social, Inscr_Estadual, Inscr_Municipal, Inscr_Suframa, Foto "
                        + "Numero_De_Rede, Numero_De_Loja, CNPJ, Endereco, UF, Complemento"
                        + "Bairro, CEP, Numero, Cidade, E_mail, Site, Telefone_1, Telefone_2"
                        + ") values "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, db.getTxtNomeFantasia());
                stm.setString(2, db.getTxtRazaoSocial());
                stm.setString(3, db.getTxtInscrEstadual());
                stm.setString(4, db.getTxtInscrMunicipal());
                stm.setString(5, db.getTxtInscrSuframa());
                stm.setString(6, db.getImagem());
                stm.setString(7, db.getTxtRede());
                stm.setString(8, db.getTxtLoja());
                stm.setString(9, db.getTxtCNPJ());
                stm.setString(10, db.getTxtEndereco());
                stm.setInt(11, db.getUf());
                stm.setString(12, db.getTxtComplemento());
                stm.setString(13, db.getTxtBairro());
                stm.setString(14, db.getTxtCep());
                stm.setString(15, db.getTxtNumero());
                stm.setString(16, db.getTxtCidade());
                stm.setString(17, db.getTxtEmail());
                stm.setString(18, db.getTxtSite());
                stm.setString(19, db.getTxtTelefone());
                stm.setString(20, db.getTxtTelefone2());
                stm.execute();

                JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
