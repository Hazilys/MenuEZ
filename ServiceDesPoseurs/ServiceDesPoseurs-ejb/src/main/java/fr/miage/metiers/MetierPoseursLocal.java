/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.Poseurs;
import javax.ejb.Local;

/**
 *
 * @author MartinTourancheau
 */
@Local
public interface MetierPoseursLocal {
    
    public void creerPoseur(String nomPoseur);
    public Poseurs getPoseur(Long idPoseur);
    
}
