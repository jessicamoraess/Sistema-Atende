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
@Table(name = "orcamento", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Orcamento.findAll", query = "SELECT o FROM Orcamento o"),
    @NamedQuery(name = "Orcamento.findByCodOrcamento", query = "SELECT o FROM Orcamento o WHERE o.codOrcamento = :codOrcamento"),
    @NamedQuery(name = "Orcamento.findByFuncionario", query = "SELECT o FROM Orcamento o WHERE o.funcionario = :funcionario"),
    @NamedQuery(name = "Orcamento.findByCliente", query = "SELECT o FROM Orcamento o WHERE o.cliente = :cliente"),
    @NamedQuery(name = "Orcamento.findByStatus", query = "SELECT o FROM Orcamento o WHERE o.status = :status"),
    @NamedQuery(name = "Orcamento.findByAno", query = "SELECT o FROM Orcamento o WHERE o.ano = :ano"),
    @NamedQuery(name = "Orcamento.findByInicio", query = "SELECT o FROM Orcamento o WHERE o.inicio = :inicio"),
    @NamedQuery(name = "Orcamento.findByFim", query = "SELECT o FROM Orcamento o WHERE o.fim = :fim")})
public class Orcamento implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Orcamento")
    private Integer codOrcamento;
    @Column(name = "Funcionario")
    private String funcionario;
    @Column(name = "Cliente")
    private String cliente;
    @Column(name = "Status")
    private Short status;
    @Column(name = "Ano")
    private String ano;
    @Column(name = "Inicio")
    private String inicio;
    @Column(name = "Fim")
    private String fim;

    public Orcamento() {
    }

    public Orcamento(Integer codOrcamento) {
        this.codOrcamento = codOrcamento;
    }

    public Integer getCodOrcamento() {
        return codOrcamento;
    }

    public void setCodOrcamento(Integer codOrcamento) {
        Integer oldCodOrcamento = this.codOrcamento;
        this.codOrcamento = codOrcamento;
        changeSupport.firePropertyChange("codOrcamento", oldCodOrcamento, codOrcamento);
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        String oldFuncionario = this.funcionario;
        this.funcionario = funcionario;
        changeSupport.firePropertyChange("funcionario", oldFuncionario, funcionario);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        Short oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        String oldAno = this.ano;
        this.ano = ano;
        changeSupport.firePropertyChange("ano", oldAno, ano);
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        String oldInicio = this.inicio;
        this.inicio = inicio;
        changeSupport.firePropertyChange("inicio", oldInicio, inicio);
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        String oldFim = this.fim;
        this.fim = fim;
        changeSupport.firePropertyChange("fim", oldFim, fim);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codOrcamento != null ? codOrcamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamento)) {
            return false;
        }
        Orcamento other = (Orcamento) object;
        if ((this.codOrcamento == null && other.codOrcamento != null) || (this.codOrcamento != null && !this.codOrcamento.equals(other.codOrcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.Orcamento[ codOrcamento=" + codOrcamento + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
