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
@Table(name = "scs_person_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScsPersonDetails.findAll", query = "SELECT s FROM ScsPersonDetails s"),
    @NamedQuery(name = "ScsPersonDetails.findBySubject", query = "SELECT s FROM ScsPersonDetails s WHERE s.subject = :subject"),
    @NamedQuery(name = "ScsPersonDetails.findByAge", query = "SELECT s FROM ScsPersonDetails s WHERE s.age = :age"),
    @NamedQuery(name = "ScsPersonDetails.findByHeight", query = "SELECT s FROM ScsPersonDetails s WHERE s.height = :height"),
    @NamedQuery(name = "ScsPersonDetails.findByWeight", query = "SELECT s FROM ScsPersonDetails s WHERE s.weight = :weight")})
public class ScsPersonDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Subject")
    private String subject;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Height")
    private Integer height;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Weight")
    private Double weight;
    @Lob
    @Column(name = "Gender")
    private String gender;
    @Lob
    @Column(name = "DeviceConnection")
    private String deviceConnection;

    public ScsPersonDetails() {
    }

    public ScsPersonDetails(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeviceConnection() {
        return deviceConnection;
    }

    public void setDeviceConnection(String deviceConnection) {
        this.deviceConnection = deviceConnection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subject != null ? subject.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScsPersonDetails)) {
            return false;
        }
        ScsPersonDetails other = (ScsPersonDetails) object;
        if ((this.subject == null && other.subject != null) || (this.subject != null && !this.subject.equals(other.subject))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scs.ScsPersonDetails[ subject=" + subject + " ]";
    }
    
}
