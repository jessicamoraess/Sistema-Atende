package dtcc;

import BancoDeDados.OrcamentosBean;
import BancoDeDados.OrcamentosDao;
import BancoDeDados.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class GeraRelatorioComFiltro {

    private Connection con;
    conexao conexao = new conexao();
    private Statement stm;

    GeraRelatorioComFiltro() throws JRException, Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/bd?user=root&password=1234");
        conexao.getConnection();
        con = conexao.getConnection();
        stm = con.createStatement();

        String Query = new String();
        Query = "SELECT * from orcamento where Cod_Orcamento = ?";
        ResultSet result = stm.executeQuery(Query);
        JRResultSetDataSource jrResult = new JRResultSetDataSource(result);

        Map parameters = new HashMap();
        JasperReport jr = JasperCompileManager.compileReport("./reports/RelatorioOrcamento.jrxml");
        JasperFillManager.fillReportToFile("./reports/RelatorioOrcamento.jrxml", parameters, jrResult);
        JasperViewer.viewReport("./reports/RelatorioOrcamento.jrxml", false, false);
    }
}
