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
public class DadosCadastraisBean {

    String txtRede, txtLoja, txtNomeFantasia, txtRazaoSocial, txtCNPJ,
            txtInscrEstadual, txtCep, txtInscrMunicipal, txtEndereco, txtNumero,
            txtBairro, txtCidade, txtComplemento, txtDDI, txtDDD, txtTelefone,
            txtTelefone2, txtInscrSuframa, txtEmail, txtSite;

    private static String imagem;

    public void setImagem(String caminho) {
        DadosCadastraisBean.imagem = caminho;
    }

    public String getImagem() {
        return DadosCadastraisBean.imagem;
    }

    public String getTxtRede() {
        return txtRede;
    }

    public void setTxtRede(String txtRede) {
        this.txtRede = txtRede;
    }

    public String getTxtLoja() {
        return txtLoja;
    }

    public void setTxtLoja(String txtLoja) {
        this.txtLoja = txtLoja;
    }

    public String getTxtNomeFantasia() {
        return txtNomeFantasia;
    }

    public void setTxtNomeFantasia(String txtNomeFantasia) {
        this.txtNomeFantasia = txtNomeFantasia;
    }

    public String getTxtRazaoSocial() {
        return txtRazaoSocial;
    }

    public void setTxtRazaoSocial(String txtRazaoSocial) {
        this.txtRazaoSocial = txtRazaoSocial;
    }

    public String getTxtCNPJ() {
        return txtCNPJ;
    }

    public void setTxtCNPJ(String txtCNPJ) {
        this.txtCNPJ = txtCNPJ;
    }

    public String getTxtInscrEstadual() {
        return txtInscrEstadual;
    }

    public void setTxtInscrEstadual(String txtInscrEstadual) {
        this.txtInscrEstadual = txtInscrEstadual;
    }

    public String getTxtCep() {
        return txtCep;
    }

    public void setTxtCep(String txtCep) {
        this.txtCep = txtCep;
    }

    public String getTxtInscrMunicipal() {
        return txtInscrMunicipal;
    }

    public void setTxtInscrMunicipal(String txtInscrMunicipal) {
        this.txtInscrMunicipal = txtInscrMunicipal;
    }

    public String getTxtEndereco() {
        return txtEndereco;
    }

    public void setTxtEndereco(String txtEndereco) {
        this.txtEndereco = txtEndereco;
    }

    public String getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(String txtNumero) {
        this.txtNumero = txtNumero;
    }

    public String getTxtBairro() {
        return txtBairro;
    }

    public void setTxtBairro(String txtBairro) {
        this.txtBairro = txtBairro;
    }

    public String getTxtCidade() {
        return txtCidade;
    }

    public void setTxtCidade(String txtCidade) {
        this.txtCidade = txtCidade;
    }

    public String getTxtComplemento() {
        return txtComplemento;
    }

    public void setTxtComplemento(String txtComplemento) {
        this.txtComplemento = txtComplemento;
    }

    public String getTxtDDI() {
        return txtDDI;
    }

    public void setTxtDDI(String txtDDI) {
        this.txtDDI = txtDDI;
    }

    public String getTxtDDD() {
        return txtDDD;
    }

    public void setTxtDDD(String txtDDD) {
        this.txtDDD = txtDDD;
    }

    public String getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(String txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    public String getTxtTelefone2() {
        return txtTelefone2;
    }

    public void setTxtTelefone2(String txtTelefone2) {
        this.txtTelefone2 = txtTelefone2;
    }

    public String getTxtInscrSuframa() {
        return txtInscrSuframa;
    }

    public void setTxtInscrSuframa(String txtInscrSuframa) {
        this.txtInscrSuframa = txtInscrSuframa;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtSite() {
        return txtSite;
    }

    public void setTxtSite(String txtSite) {
        this.txtSite = txtSite;
    }

    public int getUf() {
        return uf;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }

    int uf;
}
