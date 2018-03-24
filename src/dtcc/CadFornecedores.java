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
@Table(name = "cad_fornecedores", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadFornecedores.findAll", query = "SELECT c FROM CadFornecedores c"),
    @NamedQuery(name = "CadFornecedores.findByCodForn", query = "SELECT c FROM CadFornecedores c WHERE c.codForn = :codForn"),
    @NamedQuery(name = "CadFornecedores.findByFantasia", query = "SELECT c FROM CadFornecedores c WHERE c.fantasia = :fantasia"),
    @NamedQuery(name = "CadFornecedores.findByCnpj", query = "SELECT c FROM CadFornecedores c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "CadFornecedores.findByNome", query = "SELECT c FROM CadFornecedores c WHERE c.nome = :nome"),
    @NamedQuery(name = "CadFornecedores.findByObservacao", query = "SELECT c FROM CadFornecedores c WHERE c.observacao = :observacao"),
    @NamedQuery(name = "CadFornecedores.findByHp", query = "SELECT c FROM CadFornecedores c WHERE c.hp = :hp"),
    @NamedQuery(name = "CadFornecedores.findByTipoFornecedor", query = "SELECT c FROM CadFornecedores c WHERE c.tipoFornecedor = :tipoFornecedor"),
    @NamedQuery(name = "CadFornecedores.findByFoto", query = "SELECT c FROM CadFornecedores c WHERE c.foto = :foto")})
public class CadFornecedores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Forn")
    private Integer codForn;
    @Column(name = "Fantasia")
    private String fantasia;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Observacao")
    private String observacao;
    @Column(name = "HP")
    private String hp;
    @Column(name = "Tipo_Fornecedor")
    private Short tipoFornecedor;
    @Column(name = "Foto")
    private String foto;

    public CadFornecedores() {
    }

    public CadFornecedores(Integer codForn) {
        this.codForn = codForn;
    }

    public Integer getCodForn() {
        return codForn;
    }

    public void setCodForn(Integer codForn) {
        Integer oldCodForn = this.codForn;
        this.codForn = codForn;
        changeSupport.firePropertyChange("codForn", oldCodForn, codForn);
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        String oldFantasia = this.fantasia;
        this.fantasia = fantasia;
        changeSupport.firePropertyChange("fantasia", oldFantasia, fantasia);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        String oldHp = this.hp;
        this.hp = hp;
        changeSupport.firePropertyChange("hp", oldHp, hp);
    }

    public Short getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(Short tipoFornecedor) {
        Short oldTipoFornecedor = this.tipoFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        changeSupport.firePropertyChange("tipoFornecedor", oldTipoFornecedor, tipoFornecedor);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codForn != null ? codForn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadFornecedores)) {
            return false;
        }
        CadFornecedores other = (CadFornecedores) object;
        if ((this.codForn == null && other.codForn != null) || (this.codForn != null && !this.codForn.equals(other.codForn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.CadFornecedores[ codForn=" + codForn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
