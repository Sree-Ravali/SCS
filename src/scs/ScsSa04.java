/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "scs_sa04")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScsSa04.findAll", query = "SELECT s FROM ScsSa04 s"),
    @NamedQuery(name = "ScsSa04.findByAx", query = "SELECT s FROM ScsSa04 s WHERE s.ax = :ax"),
    @NamedQuery(name = "ScsSa04.findByAy", query = "SELECT s FROM ScsSa04 s WHERE s.ay = :ay"),
    @NamedQuery(name = "ScsSa04.findByAz", query = "SELECT s FROM ScsSa04 s WHERE s.az = :az"),
    @NamedQuery(name = "ScsSa04.findByGx", query = "SELECT s FROM ScsSa04 s WHERE s.gx = :gx"),
    @NamedQuery(name = "ScsSa04.findByGy", query = "SELECT s FROM ScsSa04 s WHERE s.gy = :gy"),
    @NamedQuery(name = "ScsSa04.findByGz", query = "SELECT s FROM ScsSa04 s WHERE s.gz = :gz"),
    @NamedQuery(name = "ScsSa04.findByAx1", query = "SELECT s FROM ScsSa04 s WHERE s.ax1 = :ax1"),
    @NamedQuery(name = "ScsSa04.findByAy1", query = "SELECT s FROM ScsSa04 s WHERE s.ay1 = :ay1"),
    @NamedQuery(name = "ScsSa04.findByAz1", query = "SELECT s FROM ScsSa04 s WHERE s.az1 = :az1"),
    @NamedQuery(name = "ScsSa04.findByPrimaryKey", query = "SELECT s FROM ScsSa04 s WHERE s.primaryKey = :primaryKey")})
public class ScsSa04 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "Subject")
    private String subject;
    @Column(name = "Ax")
    private Integer ax;
    @Column(name = "Ay")
    private Integer ay;
    @Column(name = "Az")
    private Integer az;
    @Column(name = "Gx")
    private Integer gx;
    @Column(name = "Gy")
    private Integer gy;
    @Column(name = "Gz")
    private Integer gz;
    @Column(name = "Ax1")
    private Integer ax1;
    @Column(name = "Ay1")
    private Integer ay1;
    @Column(name = "Az1")
    private Integer az1;
    @Lob
    @Column(name = "Adl")
    private String adl;
    @Id
    @Basic(optional = false)
    @Column(name = "PrimaryKey")
    private Integer primaryKey;

    public ScsSa04() {
    }

    public ScsSa04(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getAx() {
        return ax;
    }

    public void setAx(Integer ax) {
        this.ax = ax;
    }

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public Integer getAz() {
        return az;
    }

    public void setAz(Integer az) {
        this.az = az;
    }

    public Integer getGx() {
        return gx;
    }

    public void setGx(Integer gx) {
        this.gx = gx;
    }

    public Integer getGy() {
        return gy;
    }

    public void setGy(Integer gy) {
        this.gy = gy;
    }

    public Integer getGz() {
        return gz;
    }

    public void setGz(Integer gz) {
        this.gz = gz;
    }

    public Integer getAx1() {
        return ax1;
    }

    public void setAx1(Integer ax1) {
        this.ax1 = ax1;
    }

    public Integer getAy1() {
        return ay1;
    }

    public void setAy1(Integer ay1) {
        this.ay1 = ay1;
    }

    public Integer getAz1() {
        return az1;
    }

    public void setAz1(Integer az1) {
        this.az1 = az1;
    }

    public String getAdl() {
        return adl;
    }

    public void setAdl(String adl) {
        this.adl = adl;
    }

    public Integer getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (primaryKey != null ? primaryKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScsSa04)) {
            return false;
        }
        ScsSa04 other = (ScsSa04) object;
        if ((this.primaryKey == null && other.primaryKey != null) || (this.primaryKey != null && !this.primaryKey.equals(other.primaryKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scs.ScsSa04[ primaryKey=" + primaryKey + " ]";
    }
    
}
