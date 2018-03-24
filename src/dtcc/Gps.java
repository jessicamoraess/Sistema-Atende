package dtcc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

//Classe criada com o exemplo fornecida
public class Gps {

    private URL url;
    private static String tempo;

//Método não implementado para traçar o tempo da rota
    public void setTempo(String t) {
        this.tempo = t;
    }

    public String getTempo() {
        return this.tempo;
    }
    private static ArrayList<String> rota = new ArrayList<>();

    public ArrayList<String> getRota() {
        return this.rota;
    }

    //Chave gerada que pega o documento fornecido do método getDocumento
    public static String calcular(String origem, String destino) {

        URL url;
        try {
            url = new URL(
                    "http://maps.google.com.br/maps/api/directions/xml?origin=" + origem + "&destination=" + destino + "&sensor=false");

            Document document = getDocumento(url);

            return analisaXml(document);
        } catch (MalformedURLException | DocumentException e) {
            e.printStackTrace();
        }
        return "";
    }

    //Analisa e seleciona do documento retornado um bloco de instruções em html do google maps
    @SuppressWarnings("rawtypes")
    public static String analisaXml(Document document) {
        List list = document
                .selectNodes("//DirectionsResponse//step//html_instructions");

        // Da o resultado num arraylist que é exibido no formulario com as variaveis de origem e destino
        ArrayList<String> recebe = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            Element element = (Element) list.get(i);
            recebe.add(element.getText());

        }
        String x;

        return recebe.toString();
    }

    //Método que le e pega o documento
    public static Document getDocumento(URL url) throws DocumentException {
        SAXReader reader = new SAXReader(); //Faz a instancia do documento
        Document document = reader.read(url); // Le o documento
        return document; // Retorna o documento
    }

}
