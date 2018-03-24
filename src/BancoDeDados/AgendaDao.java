package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AgendaDao {

    public void inserirTarefa(AgendaBean ab) {
        try {
            try (Connection con = conexao.getConnection()) {
                String sql;
                sql = "insert into tarefas(Data_tarefa, Hora, Tarefa, "
                        + ") values "
                        + "(?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1, ab.getTxtData());
                stm.setString(2, ab.getTfHorario());
                stm.setString(3, ab.getTfTarefa());
                stm.execute();

                JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", "Aviso", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

}
