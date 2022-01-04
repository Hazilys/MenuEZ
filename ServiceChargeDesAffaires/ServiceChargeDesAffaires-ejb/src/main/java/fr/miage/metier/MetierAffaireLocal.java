/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metier;

import fr.miage.entities.Client;
import fr.miage.entities.ETAT;
import javax.ejb.Local;

/**
 *
 * @author Camille
 */
@Local
public interface MetierAffaireLocal {
    
    public void creerAffaire(String geolocalisation, ETAT etat, Long idCa, Client client);
}
