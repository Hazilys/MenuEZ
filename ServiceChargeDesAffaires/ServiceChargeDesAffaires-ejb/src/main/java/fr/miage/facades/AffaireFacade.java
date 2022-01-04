/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.Affaire;
import fr.miage.entities.Client;
import fr.miage.entities.ETAT;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camille
 */
@Stateless
public class AffaireFacade extends AbstractFacade<Affaire> implements AffaireFacadeLocal {

    @PersistenceContext(unitName = "ServiceChargeDesAffairesPersistenceUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AffaireFacade() {
        super(Affaire.class);
    }
    
    public void creerAffaire(String geolocalisation, Long idCa, Client client) {
        Affaire aff = new Affaire();
        aff.setGeolocalisation(geolocalisation);
        aff.setEtat(ETAT.CREEE);
        aff.setIdAffaire(idCa);
        aff.setClient(client);
        this.create(aff);
    }
    
}
