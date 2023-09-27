/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feereportjava;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author india hp
 */
@Entity
@Table(name = "stuinfo", catalog = "fee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Stuinfo.findAll", query = "SELECT s FROM Stuinfo s"),
    @NamedQuery(name = "Stuinfo.findByName", query = "SELECT s FROM Stuinfo s WHERE s.name = :name"),
    @NamedQuery(name = "Stuinfo.findByEmail", query = "SELECT s FROM Stuinfo s WHERE s.email = :email"),
    @NamedQuery(name = "Stuinfo.findByCource", query = "SELECT s FROM Stuinfo s WHERE s.cource = :cource"),
    @NamedQuery(name = "Stuinfo.findByFees", query = "SELECT s FROM Stuinfo s WHERE s.fees = :fees"),
    @NamedQuery(name = "Stuinfo.findByPaid", query = "SELECT s FROM Stuinfo s WHERE s.paid = :paid"),
    @NamedQuery(name = "Stuinfo.findByDue", query = "SELECT s FROM Stuinfo s WHERE s.due = :due"),
    @NamedQuery(name = "Stuinfo.findByAddrs", query = "SELECT s FROM Stuinfo s WHERE s.addrs = :addrs"),
    @NamedQuery(name = "Stuinfo.findByCity", query = "SELECT s FROM Stuinfo s WHERE s.city = :city"),
    @NamedQuery(name = "Stuinfo.findByState", query = "SELECT s FROM Stuinfo s WHERE s.state = :state"),
    @NamedQuery(name = "Stuinfo.findByCountry", query = "SELECT s FROM Stuinfo s WHERE s.country = :country"),
    @NamedQuery(name = "Stuinfo.findByContact", query = "SELECT s FROM Stuinfo s WHERE s.contact = :contact")})
public class Stuinfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "cource")
    private String cource;
    @Column(name = "fees")
    private String fees;
    @Column(name = "paid")
    private String paid;
    @Column(name = "due")
    private String due;
    @Column(name = "addrs")
    private String addrs;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "contact")
    private String contact;

    public Stuinfo() {
    }

    public Stuinfo(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        String oldCource = this.cource;
        this.cource = cource;
        changeSupport.firePropertyChange("cource", oldCource, cource);
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        String oldFees = this.fees;
        this.fees = fees;
        changeSupport.firePropertyChange("fees", oldFees, fees);
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        String oldPaid = this.paid;
        this.paid = paid;
        changeSupport.firePropertyChange("paid", oldPaid, paid);
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        String oldDue = this.due;
        this.due = due;
        changeSupport.firePropertyChange("due", oldDue, due);
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        String oldAddrs = this.addrs;
        this.addrs = addrs;
        changeSupport.firePropertyChange("addrs", oldAddrs, addrs);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stuinfo)) {
            return false;
        }
        Stuinfo other = (Stuinfo) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "feereportjava.Stuinfo[ email=" + email + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
