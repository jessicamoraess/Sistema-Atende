/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author JoãoVitor
 */
@Entity
@Table(name = "cad_cliente", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadCliente_1.findAll", query = "SELECT c FROM CadCliente_1 c"),
    @NamedQuery(name = "CadCliente_1.findByCodCli", query = "SELECT c FROM CadCliente_1 c WHERE c.codCli = :codCli"),
    @NamedQuery(name = "CadCliente_1.findByCnpj", query = "SELECT c FROM CadCliente_1 c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "CadCliente_1.findByFantasia", query = "SELECT c FROM CadCliente_1 c WHERE c.fantasia = :fantasia"),
    @NamedQuery(name = "CadCliente_1.findByTipoCliente", query = "SELECT c FROM CadCliente_1 c WHERE c.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "CadCliente_1.findByObservacao", query = "SELECT c FROM CadCliente_1 c WHERE c.observacao = :observacao"),
    @NamedQuery(name = "CadCliente_1.findByFoto", query = "SELECT c FROM CadCliente_1 c WHERE c.foto = :foto"),
    @NamedQuery(name = "CadCliente_1.findByHp", query = "SELECT c FROM CadCliente_1 c WHERE c.hp = :hp"),
    @NamedQuery(name = "CadCliente_1.findByCpf", query = "SELECT c FROM CadCliente_1 c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "CadCliente_1.findBySexo", query = "SELECT c FROM CadCliente_1 c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "CadCliente_1.findByRg", query = "SELECT c FROM CadCliente_1 c WHERE c.rg = :rg"),
    @NamedQuery(name = "CadCliente_1.findByNome", query = "SELECT c FROM CadCliente_1 c WHERE c.nome = :nome"),
    @NamedQuery(name = "CadCliente_1.findByDatanasc", query = "SELECT c FROM CadCliente_1 c WHERE c.datanasc = :datanasc"),
    @NamedQuery(name = "CadCliente_1.findByProfissao", query = "SELECT c FROM CadCliente_1 c WHERE c.profissao = :profissao"),
    @NamedQuery(name = "CadCliente_1.findByFisJur", query = "SELECT c FROM CadCliente_1 c WHERE c.fisJur = :fisJur"),
    @NamedQuery(name = "CadCliente_1.findBySms", query = "SELECT c FROM CadCliente_1 c WHERE c.sms = :sms")})
public class CadCliente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Cli")
    private Integer codCli;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "Fantasia")
    private String fantasia;
    @Column(name = "Tipo_Cliente")
    private Short tipoCliente;
    @Column(name = "Observacao")
    private String observacao;
    @Column(name = "Foto")
    private String foto;
    @Column(name = "HP")
    private String hp;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "Sexo")
    private Short sexo;
    @Column(name = "RG")
    private String rg;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Data_nasc")
    private String datanasc;
    @Column(name = "Profissao")
    private String profissao;
    @Column(name = "fis_jur")
    private Short fisJur;
    @Column(name = "Sms")
    private Integer sms;

    public CadCliente_1() {
    }

    public CadCliente_1(Integer codCli) {
        this.codCli = codCli;
    }

    public Integer getCodCli() {
        return codCli;
    }

    public void setCodCli(Integer codCli) {
        Integer oldCodCli = this.codCli;
        this.codCli = codCli;
        changeSupport.firePropertyChange("codCli", oldCodCli, codCli);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        String oldFantasia = this.fantasia;
        this.fantasia = fantasia;
        changeSupport.firePropertyChange("fantasia", oldFantasia, fantasia);
    }

    public Short getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Short tipoCliente) {
        Short oldTipoCliente = this.tipoCliente;
        this.tipoCliente = tipoCliente;
        changeSupport.firePropertyChange("tipoCliente", oldTipoCliente, tipoCliente);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        String oldHp = this.hp;
        this.hp = hp;
        changeSupport.firePropertyChange("hp", oldHp, hp);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Short getSexo() {
        return sexo;
    }

    public void setSexo(Short sexo) {
        Short oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        String oldDatanasc = this.datanasc;
        this.datanasc = datanasc;
        changeSupport.firePropertyChange("datanasc", oldDatanasc, datanasc);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        String oldProfissao = this.profissao;
        this.profissao = profissao;
        changeSupport.firePropertyChange("profissao", oldProfissao, profissao);
    }

    public Short getFisJur() {
        return fisJur;
    }

    public void setFisJur(Short fisJur) {
        Short oldFisJur = this.fisJur;
        this.fisJur = fisJur;
        changeSupport.firePropertyChange("fisJur", oldFisJur, fisJur);
    }

    public Integer getSms() {
        return sms;
    }

    public void setSms(Integer sms) {
        Integer oldSms = this.sms;
        this.sms = sms;
        changeSupport.firePropertyChange("sms", oldSms, sms);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCli != null ? codCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadCliente_1)) {
            return false;
        }
        CadCliente_1 other = (CadCliente_1) object;
        if ((this.codCli == null && other.codCli != null) || (this.codCli != null && !this.codCli.equals(other.codCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.CadCliente_1[ codCli=" + codCli + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
