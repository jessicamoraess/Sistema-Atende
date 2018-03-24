package dtcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class GeraRelatorio {

    public GeraRelatorio() {
        try {
            Connection con = null;
            Statement statement = null;

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/bd?user=root&password=1234");
            statement = con.createStatement();

            HashMap parameterMap = new HashMap();
            parameterMap.put("Cod_Orcamento", "2");

            JasperReport jr = JasperCompileManager.compileReport("./reports/RelatorioOrcamento.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap(), con);
            JasperViewer.viewReport(jp);

        } catch (Exception error) {
            System.out.println("erro");
        }
    }
}
