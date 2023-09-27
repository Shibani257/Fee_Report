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
@Table(name = "addac", catalog = "fee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Addac.findAll", query = "SELECT a FROM Addac a"),
    @NamedQuery(name = "Addac.findByName", query = "SELECT a FROM Addac a WHERE a.name = :name"),
    @NamedQuery(name = "Addac.findByEmail", query = "SELECT a FROM Addac a WHERE a.email = :email"),
    @NamedQuery(name = "Addac.findByPass", query = "SELECT a FROM Addac a WHERE a.pass = :pass"),
    @NamedQuery(name = "Addac.findByCont", query = "SELECT a FROM Addac a WHERE a.cont = :cont")})
public class Addac implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "pass")
    private String pass;
    @Column(name = "cont")
    private String cont;

    public Addac() {
    }

    public Addac(String email) {
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        String oldPass = this.pass;
        this.pass = pass;
        changeSupport.firePropertyChange("pass", oldPass, pass);
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        String oldCont = this.cont;
        this.cont = cont;
        changeSupport.firePropertyChange("cont", oldCont, cont);
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
        if (!(object instanceof Addac)) {
            return false;
        }
        Addac other = (Addac) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "feereportjava.Addac[ email=" + email + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
