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
@Table(name = "scs_adl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScsAdl.findAll", query = "SELECT s FROM ScsAdl s"),
    @NamedQuery(name = "ScsAdl.findByCode", query = "SELECT s FROM ScsAdl s WHERE s.code = :code")})
public class ScsAdl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Code")
    private String code;
    @Lob
    @Column(name = "Activity")
    private String activity;
    @Lob
    @Column(name = "Trails")
    private String trails;
    @Lob
    @Column(name = "Duration(Sec)")
    private String durationSec;

    public ScsAdl() {
    }

    public ScsAdl(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTrails() {
        return trails;
    }

    public void setTrails(String trails) {
        this.trails = trails;
    }

    public String getDurationSec() {
        return durationSec;
    }

    public void setDurationSec(String durationSec) {
        this.durationSec = durationSec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScsAdl)) {
            return false;
        }
        ScsAdl other = (ScsAdl) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scs.ScsAdl[ code=" + code + " ]";
    }
    
}
