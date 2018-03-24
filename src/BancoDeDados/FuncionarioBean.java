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
public class FuncionarioBean {

    String txtCPF, txtRG, txtNome, txtData,
            txtTelefone, txtCelular, txtEmail, txtObs, TxtFAX, TxtComercial,
            txtCEP, txtEndereco, txtNRO, txtComplemento, txtBairro, txtCidade;

    private static String imagem;

    public void setImagem(String caminho) {
        FuncionarioBean.imagem = caminho;
    }

    public String getImagem() {
        return FuncionarioBean.imagem;
    }

    public String getTxtCEP() {
        return txtCEP;
    }

    public void setTxtCEP(String txtCEP) {
        this.txtCEP = txtCEP;
    }

    public String getTxtEndereco() {
        return txtEndereco;
    }

    public void setTxtEndereco(String txtEndereco) {
        this.txtEndereco = txtEndereco;
    }

    public String getTxtNRO() {
        return txtNRO;
    }

    public void setTxtNRO(String txtNRO) {
        this.txtNRO = txtNRO;
    }

    public String getTxtComplemento() {
        return txtComplemento;
    }

    public void setTxtComplemento(String txtComplemento) {
        this.txtComplemento = txtComplemento;
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

    public int getTipoEnd() {
        return tipoEnd;
    }

    public void setTipoEnd(int tipoEnd) {
        this.tipoEnd = tipoEnd;
    }

    public int getUf() {
        return uf;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }

    public String getTxtFAX() {
        return TxtFAX;
    }

    public void setTxtFAX(String TxtFAX) {
        this.TxtFAX = TxtFAX;
    }

    public String getTxtComercial() {
        return TxtComercial;
    }

    public void setTxtComercial(String TxtComercial) {
        this.TxtComercial = TxtComercial;
    }

    public String getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(String txtCPF) {
        this.txtCPF = txtCPF;
    }

    public String getTxtRG() {
        return txtRG;
    }

    public void setTxtRG(String txtRG) {
        this.txtRG = txtRG;
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public String getTxtData() {
        return txtData;
    }

    public void setTxtData(String txtData) {
        this.txtData = txtData;
    }

    public String getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(String txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    public String getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(String txtCelular) {
        this.txtCelular = txtCelular;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtObs() {
        return txtObs;
    }

    public void setTxtObs(String txtObs) {
        this.txtObs = txtObs;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    int codigo, sexo, tipoEnd, uf;
;
}
