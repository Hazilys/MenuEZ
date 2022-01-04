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
public class Poseurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPoseur;
    
    @NotNull
    private String nomPoseur;

    public Long getIdPoseur() {
        return idPoseur;
    }

    public void setIdPoseur(Long idPoseur) {
        this.idPoseur = idPoseur;
    }

    public String getNomPoseur() {
        return nomPoseur;
    }

    public void setNomPoseur(String nomPoseur) {
        this.nomPoseur = nomPoseur;
    }
    



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPoseur != null ? idPoseur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poseurs)) {
            return false;
        }
        Poseurs other = (Poseurs) object;
        if ((this.idPoseur == null && other.idPoseur != null) || (this.idPoseur != null && !this.idPoseur.equals(other.idPoseur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Poseurs[ id=" + idPoseur + " ]";
    }
    
}
