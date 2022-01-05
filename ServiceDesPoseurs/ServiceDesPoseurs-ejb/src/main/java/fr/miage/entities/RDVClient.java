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
    private Long idRdvClient;    
    
    @NotNull
    private Long idAffaire;
    
    @NotNull
    private Long idClient;
    
    @NotNull
    private Long idPoseur;
    
    @NotNull
    private String datePose;

    public Long getIdRdvClient() {
        return idRdvClient;
    }

    public void setIdRdvClient(Long idRdvClient) {
        this.idRdvClient = idRdvClient;
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

    public Long getIdPoseur() {
        return idPoseur;
    }

    public void setIdPoseur(Long idPoseur) {
        this.idPoseur = idPoseur;
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
        hash += (idRdvClient != null ? idRdvClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RDVClient)) {
            return false;
        }
        RDVClient other = (RDVClient) object;
        if ((this.idRdvClient == null && other.idRdvClient != null) || (this.idRdvClient != null && !this.idRdvClient.equals(other.idRdvClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.RDVClient[ id=" + idRdvClient + " ]";
    }
    
}
