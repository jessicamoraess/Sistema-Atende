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
public class ControleDeInstalacaoBean {

    String txtCodCli, txtNomeCli, txtCodFun, txtNomeFun,
            txtPrimeiraManutencao, txtDescricaoProduto, txtDataInstalacao,
            txtHorario;

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

    public String getTxtDescricaoProduto() {
        return txtDescricaoProduto;
    }

    public void setTxtDescricaoProduto(String txtDescricaoProduto) {
        this.txtDescricaoProduto = txtDescricaoProduto;
    }

    public String getTxtHorario() {
        return txtHorario;
    }

    public void setTxtHorario(String txtHorario) {
        this.txtHorario = txtHorario;
    }

    public String getTxtPrimeiraManutencao() {
        return txtPrimeiraManutencao;
    }

    public void setTxtPrimeiraManutencao(String txtPrimeiraManutencao) {
        this.txtPrimeiraManutencao = txtPrimeiraManutencao;
    }

    public String getTxtDataInstalacao() {
        return txtDataInstalacao;
    }

    public void setTxtDataInstalacao(String txtDataInstalacao) {
        this.txtDataInstalacao = txtDataInstalacao;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    int Codigo;
}
