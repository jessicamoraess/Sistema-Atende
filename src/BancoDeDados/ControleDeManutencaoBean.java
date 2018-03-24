/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

/**
 *
 * @author Jéssica
 */
public class ControleDeManutencaoBean {

    String txtCodCli, txtNomeCli, txtCodFun, txtNomeFun,
            txtUltima, txtProxima, txtDescricaoProduto, txtDescricaoProblema;

    public String getTxtCodCli() {
        return txtCodCli;
    }

    public void setTxtCodCli(String txtCodCli) {
        this.txtCodCli = txtCodCli;
    }

    public String getTxtNomeCli() {
        return txtNomeCli;
    }

    public void setTxtNomeCli(String txtNomeCli) {
        this.txtNomeCli = txtNomeCli;
    }

    public String getTxtCodFun() {
        return txtCodFun;
    }

    public void setTxtCodFun(String txtCodFun) {
        this.txtCodFun = txtCodFun;
    }

    public String getTxtNomeFun() {
        return txtNomeFun;
    }

    public void setTxtNomeFun(String txtNomeFun) {
        this.txtNomeFun = txtNomeFun;
    }

    public String getTxtUltima() {
        return txtUltima;
    }

    public void setTxtUltima(String txtUltima) {
        this.txtUltima = txtUltima;
    }

    public String getTxtProxima() {
        return txtProxima;
    }

    public void setTxtProxima(String txtProxima) {
        this.txtProxima = txtProxima;
    }

    public String getTxtDescricaoProduto() {
        return txtDescricaoProduto;
    }

    public void setTxtDescricaoProduto(String txtDescricaoProduto) {
        this.txtDescricaoProduto = txtDescricaoProduto;
    }

    public String getTxtDescricaoProblema() {
        return txtDescricaoProblema;
    }

    public void setTxtDescricaoProblema(String txtDescricaoProblema) {
        this.txtDescricaoProblema = txtDescricaoProblema;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    int Codigo, Tipo;
}
