package BancoDeDados;

public class ClienteBean {

    String txtFantasia, txtCPF, txtCNPJ, txtRG, txtNome, data,
            txtTelefone, txtComercial, txtCelular, txtFAX, txtHP, txtEmail, txtProfissao, txtObs,
            txtCEP, txtEndereco, txtNRO, txtComplemento, txtBairro, txtCidade;
    private static String imagem;

    public void setImagem(String caminho) {
        ClienteBean.imagem = caminho;
    }

    public String getImagem() {
        return ClienteBean.imagem;
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

    int codigo, pessoa, sexo, tipo, sms, tipoEnd, uf;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTxtFantasia() {
        return txtFantasia;
    }

    public void setTxtFantasia(String txtFantasia) {
        this.txtFantasia = txtFantasia;
    }

    public String getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(String txtCPF) {
        this.txtCPF = txtCPF;
    }

    public String getTxtCNPJ() {
        return txtCNPJ;
    }

    public void setTxtCNPJ(String txtCNPJ) {
        this.txtCNPJ = txtCNPJ;
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

    public String getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(String txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    public String getTxtComercial() {
        return txtComercial;
    }

    public void setTxtComercial(String txtComercial) {
        this.txtComercial = txtComercial;
    }

    public String getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(String txtCelular) {
        this.txtCelular = txtCelular;
    }

    public String getTxtFAX() {
        return txtFAX;
    }

    public void setTxtFAX(String txtFAX) {
        this.txtFAX = txtFAX;
    }

    public String getTxtHP() {
        return txtHP;
    }

    public void setTxtHP(String txtHP) {
        this.txtHP = txtHP;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtProfissao() {
        return txtProfissao;
    }

    public void setTxtProfissao(String txtProfissao) {
        this.txtProfissao = txtProfissao;
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

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

}
