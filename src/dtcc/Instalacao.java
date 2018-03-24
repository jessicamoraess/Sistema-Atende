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
@Table(name = "instalacao", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Instalacao.findAll", query = "SELECT i FROM Instalacao i"),
    @NamedQuery(name = "Instalacao.findByCodInstalacao", query = "SELECT i FROM Instalacao i WHERE i.codInstalacao = :codInstalacao"),
    @NamedQuery(name = "Instalacao.findByCodCli", query = "SELECT i FROM Instalacao i WHERE i.codCli = :codCli"),
    @NamedQuery(name = "Instalacao.findByNomeCliente", query = "SELECT i FROM Instalacao i WHERE i.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Instalacao.findByCodFun", query = "SELECT i FROM Instalacao i WHERE i.codFun = :codFun"),
    @NamedQuery(name = "Instalacao.findByNomeFuncionario", query = "SELECT i FROM Instalacao i WHERE i.nomeFuncionario = :nomeFuncionario"),
    @NamedQuery(name = "Instalacao.findByPrimeiraManutencao", query = "SELECT i FROM Instalacao i WHERE i.primeiraManutencao = :primeiraManutencao"),
    @NamedQuery(name = "Instalacao.findByDescricaoProduto", query = "SELECT i FROM Instalacao i WHERE i.descricaoProduto = :descricaoProduto"),
    @NamedQuery(name = "Instalacao.findByDataInstalacao", query = "SELECT i FROM Instalacao i WHERE i.dataInstalacao = :dataInstalacao"),
    @NamedQuery(name = "Instalacao.findByHorario", query = "SELECT i FROM Instalacao i WHERE i.horario = :horario")})
public class Instalacao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Instalacao")
    private Integer codInstalacao;
    @Column(name = "Cod_Cli")
    private Integer codCli;
    @Column(name = "Nome_Cliente")
    private String nomeCliente;
    @Column(name = "Cod_Fun")
    private Integer codFun;
    @Column(name = "Nome_Funcionario")
    private String nomeFuncionario;
    @Column(name = "Primeira_Manutencao")
    private String primeiraManutencao;
    @Column(name = "Descricao_Produto")
    private String descricaoProduto;
    @Column(name = "Data_Instalacao")
    private String dataInstalacao;
    @Column(name = "Horario")
    private String horario;

    public Instalacao() {
    }

    public Instalacao(Integer codInstalacao) {
        this.codInstalacao = codInstalacao;
    }

    public Integer getCodInstalacao() {
        return codInstalacao;
    }

    public void setCodInstalacao(Integer codInstalacao) {
        Integer oldCodInstalacao = this.codInstalacao;
        this.codInstalacao = codInstalacao;
        changeSupport.firePropertyChange("codInstalacao", oldCodInstalacao, codInstalacao);
    }

    public Integer getCodCli() {
        return codCli;
    }

    public void setCodCli(Integer codCli) {
        Integer oldCodCli = this.codCli;
        this.codCli = codCli;
        changeSupport.firePropertyChange("codCli", oldCodCli, codCli);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public Integer getCodFun() {
        return codFun;
    }

    public void setCodFun(Integer codFun) {
        Integer oldCodFun = this.codFun;
        this.codFun = codFun;
        changeSupport.firePropertyChange("codFun", oldCodFun, codFun);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        String oldNomeFuncionario = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionario, nomeFuncionario);
    }

    public String getPrimeiraManutencao() {
        return primeiraManutencao;
    }

    public void setPrimeiraManutencao(String primeiraManutencao) {
        String oldPrimeiraManutencao = this.primeiraManutencao;
        this.primeiraManutencao = primeiraManutencao;
        changeSupport.firePropertyChange("primeiraManutencao", oldPrimeiraManutencao, primeiraManutencao);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        String oldDescricaoProduto = this.descricaoProduto;
        this.descricaoProduto = descricaoProduto;
        changeSupport.firePropertyChange("descricaoProduto", oldDescricaoProduto, descricaoProduto);
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(String dataInstalacao) {
        String oldDataInstalacao = this.dataInstalacao;
        this.dataInstalacao = dataInstalacao;
        changeSupport.firePropertyChange("dataInstalacao", oldDataInstalacao, dataInstalacao);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInstalacao != null ? codInstalacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instalacao)) {
            return false;
        }
        Instalacao other = (Instalacao) object;
        if ((this.codInstalacao == null && other.codInstalacao != null) || (this.codInstalacao != null && !this.codInstalacao.equals(other.codInstalacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.Instalacao[ codInstalacao=" + codInstalacao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
