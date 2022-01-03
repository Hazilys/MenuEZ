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
 * @author Camille
 */
@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCommande;
    
    @NotNull
    private String refCatalogue;
    
    @NotNull
    private String cotes;
    
    @NotNull
    private Double montantNegocie;
    
    @NotNull
    private Boolean commandePassee;
    
    @NotNull
    private Boolean commandeLivree;
    
    @NotNull
    private Long idAffaire;

    public Commande() {
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public String getRefCatalogue() {
        return refCatalogue;
    }

    public void setRefCatalogue(String refCatalogue) {
        this.refCatalogue = refCatalogue;
    }

    public String getCotes() {
        return cotes;
    }

    public void setCotes(String cotes) {
        this.cotes = cotes;
    }

    public Double getMontantNegocie() {
        return montantNegocie;
    }

    public void setMontantNegocie(Double montantNegocie) {
        this.montantNegocie = montantNegocie;
    }

    public Boolean getCommandePassee() {
        return commandePassee;
    }

    public void setCommandePassee(Boolean commandePassee) {
        this.commandePassee = commandePassee;
    }

    public Boolean getCommandeLivree() {
        return commandeLivree;
    }

    public void setCommandeLivree(Boolean commandeLivree) {
        this.commandeLivree = commandeLivree;
    }

    public Long getIdAffaire() {
        return idAffaire;
    }

    public void setIdAffaire(Long idAffaire) {
        this.idAffaire = idAffaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommande != null ? idCommande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idCommande fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.idCommande == null && other.idCommande != null) || (this.idCommande != null && !this.idCommande.equals(other.idCommande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Commande[ id=" + idCommande + " ]";
    }
    
}
