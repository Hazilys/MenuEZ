/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Camille
 */
@Entity
public class RDVCommercial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private Long idAffaire;
    
    @NotNull
    private Long idCommercial;
    
    @NotNull
    private Long idClient;
    
    @NotNull
    private Calendar dateRDVCommercial;

    public RDVCommercial() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAffaire() {
        return idAffaire;
    }

    public void setIdAffaire(Long idAffaire) {
        this.idAffaire = idAffaire;
    }

    public Long getIdCommercial() {
        return idCommercial;
    }

    public void setIdCommercial(Long idCommercial) {
        this.idCommercial = idCommercial;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Calendar getDateRDVCommercial() {
        return dateRDVCommercial;
    }

    public void setDateRDVCommercial(Calendar dateRDVCommercial) {
        this.dateRDVCommercial = dateRDVCommercial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RDVCommercial)) {
            return false;
        }
        RDVCommercial other = (RDVCommercial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.RDVCommercial[ id=" + id + " ]";
    }
    
}
