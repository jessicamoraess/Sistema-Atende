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
@Table(name = "cad_produtos", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadProdutos.findAll", query = "SELECT c FROM CadProdutos c"),
    @NamedQuery(name = "CadProdutos.findByCodProd", query = "SELECT c FROM CadProdutos c WHERE c.codProd = :codProd"),
    @NamedQuery(name = "CadProdutos.findBySt", query = "SELECT c FROM CadProdutos c WHERE c.st = :st"),
    @NamedQuery(name = "CadProdutos.findByCsosn", query = "SELECT c FROM CadProdutos c WHERE c.csosn = :csosn"),
    @NamedQuery(name = "CadProdutos.findByCodParte", query = "SELECT c FROM CadProdutos c WHERE c.codParte = :codParte"),
    @NamedQuery(name = "CadProdutos.findByStatusProd", query = "SELECT c FROM CadProdutos c WHERE c.statusProd = :statusProd"),
    @NamedQuery(name = "CadProdutos.findByQuantidade", query = "SELECT c FROM CadProdutos c WHERE c.quantidade = :quantidade"),
    @NamedQuery(name = "CadProdutos.findByFabricante", query = "SELECT c FROM CadProdutos c WHERE c.fabricante = :fabricante"),
    @NamedQuery(name = "CadProdutos.findByReferencia", query = "SELECT c FROM CadProdutos c WHERE c.referencia = :referencia"),
    @NamedQuery(name = "CadProdutos.findByFornecedor", query = "SELECT c FROM CadProdutos c WHERE c.fornecedor = :fornecedor"),
    @NamedQuery(name = "CadProdutos.findByModelo", query = "SELECT c FROM CadProdutos c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "CadProdutos.findByCapacidade", query = "SELECT c FROM CadProdutos c WHERE c.capacidade = :capacidade"),
    @NamedQuery(name = "CadProdutos.findByDescricao", query = "SELECT c FROM CadProdutos c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "CadProdutos.findByFaixaDePreco", query = "SELECT c FROM CadProdutos c WHERE c.faixaDePreco = :faixaDePreco"),
    @NamedQuery(name = "CadProdutos.findByFaixaDePreco2", query = "SELECT c FROM CadProdutos c WHERE c.faixaDePreco2 = :faixaDePreco2"),
    @NamedQuery(name = "CadProdutos.findByGrupo", query = "SELECT c FROM CadProdutos c WHERE c.grupo = :grupo"),
    @NamedQuery(name = "CadProdutos.findByNcm", query = "SELECT c FROM CadProdutos c WHERE c.ncm = :ncm"),
    @NamedQuery(name = "CadProdutos.findByIcms", query = "SELECT c FROM CadProdutos c WHERE c.icms = :icms"),
    @NamedQuery(name = "CadProdutos.findByFotoProd", query = "SELECT c FROM CadProdutos c WHERE c.fotoProd = :fotoProd")})
public class CadProdutos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Prod")
    private Integer codProd;
    @Column(name = "ST")
    private String st;
    @Column(name = "CSOSN")
    private String csosn;
    @Column(name = "Cod_Parte")
    private Integer codParte;
    @Column(name = "Status_Prod")
    private Short statusProd;
    @Column(name = "Quantidade")
    private Integer quantidade;
    @Column(name = "Fabricante")
    private String fabricante;
    @Column(name = "Referencia")
    private String referencia;
    @Column(name = "Fornecedor")
    private String fornecedor;
    @Column(name = "Modelo")
    private String modelo;
    @Column(name = "Capacidade")
    private String capacidade;
    @Column(name = "Descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Faixa_De_Preco")
    private Float faixaDePreco;
    @Column(name = "Faixa_De_Preco2")
    private Float faixaDePreco2;
    @Column(name = "Grupo")
    private String grupo;
    @Column(name = "NCM")
    private String ncm;
    @Column(name = "ICMS")
    private Float icms;
    @Column(name = "Foto_Prod")
    private String fotoProd;

    public CadProdutos() {
    }

    public CadProdutos(Integer codProd) {
        this.codProd = codProd;
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        Integer oldCodProd = this.codProd;
        this.codProd = codProd;
        changeSupport.firePropertyChange("codProd", oldCodProd, codProd);
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        String oldSt = this.st;
        this.st = st;
        changeSupport.firePropertyChange("st", oldSt, st);
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        String oldCsosn = this.csosn;
        this.csosn = csosn;
        changeSupport.firePropertyChange("csosn", oldCsosn, csosn);
    }

    public Integer getCodParte() {
        return codParte;
    }

    public void setCodParte(Integer codParte) {
        Integer oldCodParte = this.codParte;
        this.codParte = codParte;
        changeSupport.firePropertyChange("codParte", oldCodParte, codParte);
    }

    public Short getStatusProd() {
        return statusProd;
    }

    public void setStatusProd(Short statusProd) {
        Short oldStatusProd = this.statusProd;
        this.statusProd = statusProd;
        changeSupport.firePropertyChange("statusProd", oldStatusProd, statusProd);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        String oldFabricante = this.fabricante;
        this.fabricante = fabricante;
        changeSupport.firePropertyChange("fabricante", oldFabricante, fabricante);
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        String oldReferencia = this.referencia;
        this.referencia = referencia;
        changeSupport.firePropertyChange("referencia", oldReferencia, referencia);
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        String oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        String oldCapacidade = this.capacidade;
        this.capacidade = capacidade;
        changeSupport.firePropertyChange("capacidade", oldCapacidade, capacidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Float getFaixaDePreco() {
        return faixaDePreco;
    }

    public void setFaixaDePreco(Float faixaDePreco) {
        Float oldFaixaDePreco = this.faixaDePreco;
        this.faixaDePreco = faixaDePreco;
        changeSupport.firePropertyChange("faixaDePreco", oldFaixaDePreco, faixaDePreco);
    }

    public Float getFaixaDePreco2() {
        return faixaDePreco2;
    }

    public void setFaixaDePreco2(Float faixaDePreco2) {
        Float oldFaixaDePreco2 = this.faixaDePreco2;
        this.faixaDePreco2 = faixaDePreco2;
        changeSupport.firePropertyChange("faixaDePreco2", oldFaixaDePreco2, faixaDePreco2);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        String oldGrupo = this.grupo;
        this.grupo = grupo;
        changeSupport.firePropertyChange("grupo", oldGrupo, grupo);
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        String oldNcm = this.ncm;
        this.ncm = ncm;
        changeSupport.firePropertyChange("ncm", oldNcm, ncm);
    }

    public Float getIcms() {
        return icms;
    }

    public void setIcms(Float icms) {
        Float oldIcms = this.icms;
        this.icms = icms;
        changeSupport.firePropertyChange("icms", oldIcms, icms);
    }

    public String getFotoProd() {
        return fotoProd;
    }

    public void setFotoProd(String fotoProd) {
        String oldFotoProd = this.fotoProd;
        this.fotoProd = fotoProd;
        changeSupport.firePropertyChange("fotoProd", oldFotoProd, fotoProd);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProd != null ? codProd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadProdutos)) {
            return false;
        }
        CadProdutos other = (CadProdutos) object;
        if ((this.codProd == null && other.codProd != null) || (this.codProd != null && !this.codProd.equals(other.codProd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dtcc.CadProdutos[ codProd=" + codProd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
