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
public class EnderecoBean {

    String txtCEP, txtEndereco, txtNRO, txtComplemento, txtBairro, txtCidade;

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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getUf() {
        return uf;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }
    int tipo, uf;
}
