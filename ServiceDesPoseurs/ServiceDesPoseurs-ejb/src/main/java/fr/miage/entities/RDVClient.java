/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author MartinTourancheau
 */
@Entity
public class RDVClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private Long idAffaire;
        
    @NotNull
    private Long idClient;
    
    @NotNull
    private Long idPoseurs;
    
    @NotNull
    private String datePose;

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

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdPoseurs() {
        return idPoseurs;
    }

    public void setIdPoseurs(Long idPoseurs) {
        this.idPoseurs = idPoseurs;
    }

    public String getDatePose() {
        return datePose;
    }

    public void setDatePose(String datePose) {
        this.datePose = datePose;
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
        if (!(object instanceof RDVClient)) {
            return false;
        }
        RDVClient other = (RDVClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.RDVClient[ id=" + id + " ]";
    }
    
}
