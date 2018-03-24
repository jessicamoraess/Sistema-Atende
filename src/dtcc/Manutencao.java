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
@Table(name = "manutencao", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Manutencao.findAll", query = "SELECT m FROM Manutencao m"),
    @NamedQuery(name = "Manutencao.findByCodManutencao", query = "SELECT m FROM Manutencao m WHERE m.codManutencao = :codManutencao"),
    @NamedQuery(name = "Manutencao.findByTipoManutencao", query = "SELECT m FROM Manutencao m WHERE m.tipoManutencao = :tipoManutencao"),
    @NamedQuery(name = "Manutencao.findByDescricaoDoProduto", query = "SELECT m FROM Manutencao m WHERE m.descricaoDoProduto = :descricaoDoProduto"),
    @NamedQuery(name = "Manutencao.findByUltimaManutencao", query = "SELECT m FROM Manutencao m WHERE m.ultimaManutencao = :ultimaManutencao"),
    @NamedQuery(name = "Manutencao.findByProximaManutencao", query = "SELECT m FROM Manutencao m WHERE m.proximaManutencao = :proximaManutencao"),
    @NamedQuery(name = "Manutencao.findByDescricaoDoProblema", query = "SELECT m FROM Manutencao m WHERE m.descricaoDoProblema = :descricaoDoProblema"),
    @NamedQuery(name = "Manutencao.findByNomeFuncionario", query = "SELECT m FROM Manutencao m WHERE m.nomeFuncionario = :nomeFuncionario"),
    @NamedQuery(name = "Manutencao.findByNomeCliente", query = "SELECT m FROM Manutencao m WHERE m.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Manutencao.findByCodCli", query = "SELECT m FROM Manutencao m WHERE m.codCli = :codCli"),
    @NamedQuery(name = "Manutencao.findByCodFun", query = "SELECT m FROM Manutencao m WHERE m.codFun = :codFun")})
public class Manutencao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Manutencao")
    private Integer codManutencao;
    @Column(name = "Tipo_Manutencao")
    private Short tipoManutencao;
    @Column(name = "Descricao_Do_Produto")
    private String descricaoDoProduto;
    @Column(name = "Ultima_Manutencao")
    private String ultimaManutencao;
    @Column(name = "Proxima_Manutencao")
    private String proximaManutencao;
    @Column(name = "Descricao_Do_Problema")
    private String descricaoDoProblema;
    @Column(name = "Nome_Funcionario")
    private String nomeFuncionario;
    @Column(name = "Nome_Cliente")
    private String nomeCliente;
    @Column(name = "Cod_Cli")
    private Integer codCli;
    @Column(name = "Cod_Fun")
    private Integer codFun;

    public Manutencao() {
    }

    public Manutencao(Integer codManutencao) {
        this.codManutencao = codManutencao;
    }

    public Integer getCodManutencao() {
        return codManutencao;
    }

    public void setCodManutencao(Integer codManutencao) {
        Integer oldCodManutencao = this.codManutencao;
        this.codManutencao = codManutencao;
        changeSupport.firePropertyChange("codManutencao", oldCodManutencao, codManutencao);
    }

    public Short getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(Short tipoManutencao) {
        Short oldTipoManutencao = this.tipoManutencao;
        this.tipoManutencao = tipoManutencao;
        changeSupport.firePropertyChange("tipoManutencao", oldTipoManutencao, tipoManutencao);
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        String oldDescricaoDoProduto = this.descricaoDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
        changeSupport.firePropertyChange("descricaoDoProduto", oldDescricaoDoProduto, descricaoDoProduto);
    }

    public String getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(String ultimaManutencao) {
        String oldUltimaManutencao = this.ultimaManutencao;
        this.ultimaManutencao = ultimaManutencao;
        changeSupport.firePropertyChange("ultimaManutencao", oldUltimaManutencao, ultimaManutencao);
    }

    public String getProximaManutencao() {
        return proximaManutencao;
    }

    public void setProximaManutencao(String proximaManutencao) {
        String oldProximaManutencao = this.proximaManutencao;
        this.proximaManutencao = proximaManutencao;
        changeSupport.firePropertyChange("proximaManutencao", oldProximaManutencao, proximaManutencao);
    }

    public String getDescricaoDoProblema() {
        return descricaoDoProblema;
    }

    public void setDescricaoDoProblema(String descricaoDoProblema) {
        String oldDescricaoDoProblema = this.descricaoDoProblema;
        this.descricaoDoProblema = descricaoDoProblema;
        changeSupport.firePropertyChange("descricaoDoProblema", oldDescricaoDoProblema, descricaoDoProblema);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        String oldNomeFuncionario = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionario, nomeFuncionario);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public Integer getCodCli() {
        return codCli;
    }

    public void setCodCli(Integer codCli) {
        Integer oldCodCli = this.codCli;
        this.codCli = codCli;
        changeSupport.firePropertyChange("codCli", oldCodCli, codCli);
    }

    public Integer getCodFun() {
        return codFun;
    }

    public void setCodFun(Integer codFun) {
        Integer oldCodFun = this.codFun;
        this.codFun = codFun;
        changeSupport.firePropertyChange("codFun", oldCodFun, codFun);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codManutencao != null ? codManutencao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manutencao)) {
            return false;
        }
        Manutencao other = (Manutencao) object;
        if ((this.codManutencao == null && other.codManutencao != null) || (this.codManutencao != null && !this.codManutencao.equals(other.codManutencao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.Manutencao[ codManutencao=" + codManutencao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
