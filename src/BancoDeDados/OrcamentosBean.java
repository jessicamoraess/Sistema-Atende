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
public class OrcamentosBean {

    String txtAno, txtInicio, txtFim, txtCliente, txtVendedor, txtDescricao, txtDesconto, txtPreco, txtTotal, txtQtde;

    public String getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(String txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public String getTxtDesconto() {
        return txtDesconto;
    }

    public void setTxtDesconto(String txtDesconto) {
        this.txtDesconto = txtDesconto;
    }

    public String getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(String txtPreco) {
        this.txtPreco = txtPreco;
    }

    public String getTxtTotal() {
        return txtTotal;
    }

    public void setTxtTotal(String txtTotal) {
        this.txtTotal = txtTotal;
    }

    public String getTxtQtde() {
        return txtQtde;
    }

    public void setTxtQtde(String txtQtde) {
        this.txtQtde = txtQtde;
    }

    public String getTxtAno() {
        return txtAno;
    }

    public void setTxtAno(String txtAno) {
        this.txtAno = txtAno;
    }

    public String getTxtInicio() {
        return txtInicio;
    }

    public void setTxtInicio(String txtInicio) {
        this.txtInicio = txtInicio;
    }

    public String getTxtFim() {
        return txtFim;
    }

    public void setTxtFim(String txtFim) {
        this.txtFim = txtFim;
    }

    public String getTxtCliente() {
        return txtCliente;
    }

    public void setTxtCliente(String txtCliente) {
        this.txtCliente = txtCliente;
    }

    public String getTxtVendedor() {
        return txtVendedor;
    }

    public void setTxtVendedor(String txtVendedor) {
        this.txtVendedor = txtVendedor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;

    }

    int codigo, status, instalacao, manutencao;

    public int getInstalacao() {
        return instalacao;
    }

    public void setInstalacao(int instalacao) {
        this.instalacao = instalacao;
    }

    public int getManutencao() {
        return manutencao;
    }

    public void setManutencao(int manutencao) {
        this.manutencao = manutencao;
    }

}
