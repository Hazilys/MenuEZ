/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metier;

import fr.miage.entities.Client;
import fr.miage.entities.ETAT;
import javax.ejb.Stateless;

/**
 *
 * @author Camille
 */
@Stateless
public class MetierAffaire implements MetierAffaireLocal {

    @Override
    public void creerAffaire(String geolocalisation, ETAT etat, Long idCa, Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
