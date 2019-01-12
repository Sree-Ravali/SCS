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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "scs_sa01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScsSa01.findAll", query = "SELECT s FROM ScsSa01 s"),
    @NamedQuery(name = "ScsSa01.findBySubject", query = "SELECT s FROM ScsSa01 s WHERE s.subject = :subject"),
    @NamedQuery(name = "ScsSa01.findByAx", query = "SELECT s FROM ScsSa01 s WHERE s.ax = :ax"),
    @NamedQuery(name = "ScsSa01.findByAy", query = "SELECT s FROM ScsSa01 s WHERE s.ay = :ay"),
    @NamedQuery(name = "ScsSa01.findByAz", query = "SELECT s FROM ScsSa01 s WHERE s.az = :az"),
    @NamedQuery(name = "ScsSa01.findByGx", query = "SELECT s FROM ScsSa01 s WHERE s.gx = :gx"),
    @NamedQuery(name = "ScsSa01.findByGy", query = "SELECT s FROM ScsSa01 s WHERE s.gy = :gy"),
    @NamedQuery(name = "ScsSa01.findByGz", query = "SELECT s FROM ScsSa01 s WHERE s.gz = :gz"),
    @NamedQuery(name = "ScsSa01.findByAx1", query = "SELECT s FROM ScsSa01 s WHERE s.ax1 = :ax1"),
    @NamedQuery(name = "ScsSa01.findByAy1", query = "SELECT s FROM ScsSa01 s WHERE s.ay1 = :ay1"),
    @NamedQuery(name = "ScsSa01.findByAz1", query = "SELECT s FROM ScsSa01 s WHERE s.az1 = :az1"),
    @NamedQuery(name = "ScsSa01.findByAdl", query = "SELECT s FROM ScsSa01 s WHERE s.adl = :adl"),
    @NamedQuery(name = "ScsSa01.findByPrimaryId", query = "SELECT s FROM ScsSa01 s WHERE s.primaryId = :primaryId")})
public class ScsSa01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
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
    @Column(name = "Adl")
    private String adl;
    @Id
    @Basic(optional = false)
    @Column(name = "PrimaryId")
    private Integer primaryId;

    public ScsSa01() {
    }

    public ScsSa01(Integer primaryId) {
        this.primaryId = primaryId;
    }

    public ScsSa01(Integer primaryId, String subject) {
        this.primaryId = primaryId;
        this.subject = subject;
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

    public Integer getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Integer primaryId) {
        this.primaryId = primaryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (primaryId != null ? primaryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScsSa01)) {
            return false;
        }
        ScsSa01 other = (ScsSa01) object;
        if ((this.primaryId == null && other.primaryId != null) || (this.primaryId != null && !this.primaryId.equals(other.primaryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scs.ScsSa01[ primaryId=" + primaryId + " ]";
    }
    
}
