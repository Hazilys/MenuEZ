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
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Camille
 */
@Entity
public class Affaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAffaire;

    @NotNull
    private String geolocalisation;
    
    @NotNull
    private ETAT etat;
    
    @NotNull
    private Long idCa;
    
    @ManyToOne
    private Client client;

    public Affaire() {
    }
    
    public Long getIdAffaire() {
        return idAffaire;
    }

    public void setIdAffaire(Long idAffaire) {
        this.idAffaire = idAffaire;
    }

    public String getGeolocalisation() {
        return geolocalisation;
    }

    public void setGeolocalisation(String geolocalisation) {
        this.geolocalisation = geolocalisation;
    }

    public ETAT getEtat() {
        return etat;
    }

    public void setEtat(ETAT etat) {
        this.etat = etat;
    }

    public Long getIdCa() {
        return idCa;
    }

    public void setIdCa(Long idCa) {
        this.idCa = idCa;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAffaire != null ? idAffaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idAffaire fields are not set
        if (!(object instanceof Affaire)) {
            return false;
        }
        Affaire other = (Affaire) object;
        if ((this.idAffaire == null && other.idAffaire != null) || (this.idAffaire != null && !this.idAffaire.equals(other.idAffaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Affaire[ id=" + idAffaire + " ]";
    }
    
}
