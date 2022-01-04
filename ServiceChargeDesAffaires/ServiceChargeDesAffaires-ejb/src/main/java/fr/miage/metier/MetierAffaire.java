/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metier;

import fr.miage.entities.Affaire;
import fr.miage.entities.Client;
import fr.miage.entities.ETAT;
import fr.miage.facades.AffaireFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Camille
 */
@Stateless
public class MetierAffaire implements MetierAffaireLocal {

    @EJB
    private AffaireFacadeLocal affaireFacade;

    @Override
    public void creerAffaire(String geolocalisation, Long idCa, Client client) {
        this.affaireFacade.creerAffaire(geolocalisation, idCa, client);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
