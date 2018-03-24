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
@Table(name = "cad_funcionario", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadFuncionario_1.findAll", query = "SELECT c FROM CadFuncionario_1 c"),
    @NamedQuery(name = "CadFuncionario_1.findByCodFun", query = "SELECT c FROM CadFuncionario_1 c WHERE c.codFun = :codFun"),
    @NamedQuery(name = "CadFuncionario_1.findByNome", query = "SELECT c FROM CadFuncionario_1 c WHERE c.nome = :nome"),
    @NamedQuery(name = "CadFuncionario_1.findBySexo", query = "SELECT c FROM CadFuncionario_1 c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "CadFuncionario_1.findByCpf", query = "SELECT c FROM CadFuncionario_1 c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "CadFuncionario_1.findByDataNasc", query = "SELECT c FROM CadFuncionario_1 c WHERE c.dataNasc = :dataNasc"),
    @NamedQuery(name = "CadFuncionario_1.findByRg", query = "SELECT c FROM CadFuncionario_1 c WHERE c.rg = :rg"),
    @NamedQuery(name = "CadFuncionario_1.findByFoto", query = "SELECT c FROM CadFuncionario_1 c WHERE c.foto = :foto"),
    @NamedQuery(name = "CadFuncionario_1.findByObservacao", query = "SELECT c FROM CadFuncionario_1 c WHERE c.observacao = :observacao")})
public class CadFuncionario_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Fun")
    private Integer codFun;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Sexo")
    private Boolean sexo;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "Data_Nasc")
    private String dataNasc;
    @Column(name = "RG")
    private String rg;
    @Column(name = "Foto")
    private String foto;
    @Column(name = "Observacao")
    private String observacao;

    public CadFuncionario_1() {
    }

    public CadFuncionario_1(Integer codFun) {
        this.codFun = codFun;
    }

    public Integer getCodFun() {
        return codFun;
    }

    public void setCodFun(Integer codFun) {
        Integer oldCodFun = this.codFun;
        this.codFun = codFun;
        changeSupport.firePropertyChange("codFun", oldCodFun, codFun);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        Boolean oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        String oldDataNasc = this.dataNasc;
        this.dataNasc = dataNasc;
        changeSupport.firePropertyChange("dataNasc", oldDataNasc, dataNasc);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFun != null ? codFun.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadFuncionario_1)) {
            return false;
        }
        CadFuncionario_1 other = (CadFuncionario_1) object;
        if ((this.codFun == null && other.codFun != null) || (this.codFun != null && !this.codFun.equals(other.codFun))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.CadFuncionario_1[ codFun=" + codFun + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
