package BancoDeDados;

public class ProdutoBean {

    String txtCodigoParte, txtQuantidade,
            txtFornecedor, txtFabricante, txtReferencia, txtModelo, txtCapacidade, txtST, txtCSOSN, txtDescricao,
            txtFaixaPreco, txtFaixaPreco2, txtGrupo, txtNCM, txtICMS;
    int status, codigo;

    private static String imagem;

    public void setImagem(String caminho) {
        ProdutoBean.imagem = caminho;
    }

    public String getImagem() {
        return ProdutoBean.imagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTxtCodigoParte() {
        return txtCodigoParte;
    }

    public void setTxtCodigoParte(String txtCodigoParte) {
        this.txtCodigoParte = txtCodigoParte;
    }

    public String getTxtQuantidade() {
        return txtQuantidade;
    }

    public void setTxtQuantidade(String txtQuantidade) {
        this.txtQuantidade = txtQuantidade;
    }

    public String getTxtFornecedor() {
        return txtFornecedor;
    }

    public void setTxtFornecedor(String txtFornecedor) {
        this.txtFornecedor = txtFornecedor;
    }

    public String getTxtFabricante() {
        return txtFabricante;
    }

    public void setTxtFabricante(String txtFabricante) {
        this.txtFabricante = txtFabricante;
    }

    public String getTxtReferencia() {
        return txtReferencia;
    }

    public void setTxtReferencia(String txtReferencia) {
        this.txtReferencia = txtReferencia;
    }

    public String getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(String txtModelo) {
        this.txtModelo = txtModelo;
    }

    public String getTxtCapacidade() {
        return txtCapacidade;
    }

    public void setTxtCapacidade(String txtCapacidade) {
        this.txtCapacidade = txtCapacidade;
    }

    public String getTxtST() {
        return txtST;
    }

    public void setTxtST(String txtST) {
        this.txtST = txtST;
    }

    public String getTxtCSOSN() {
        return txtCSOSN;
    }

    public void setTxtCSOSN(String txtCSOSN) {
        this.txtCSOSN = txtCSOSN;
    }

    public String getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(String txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public String getTxtFaixaPreco() {
        return txtFaixaPreco;
    }

    public void setTxtFaixaPreco(String txtFaixaPreco) {
        this.txtFaixaPreco = txtFaixaPreco;
    }

    public String getTxtFaixaPreco2() {
        return txtFaixaPreco2;
    }

    public void setTxtFaixaPreco2(String txtFaixaPreco2) {
        this.txtFaixaPreco2 = txtFaixaPreco2;
    }

    public String getTxtGrupo() {
        return txtGrupo;
    }

    public void setTxtGrupo(String txtGrupo) {
        this.txtGrupo = txtGrupo;
    }

    public String getTxtNCM() {
        return txtNCM;
    }

    public void setTxtNCM(String txtNCM) {
        this.txtNCM = txtNCM;
    }

    public String getTxtICMS() {
        return txtICMS;
    }

    public void setTxtICMS(String txtICMS) {
        this.txtICMS = txtICMS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
