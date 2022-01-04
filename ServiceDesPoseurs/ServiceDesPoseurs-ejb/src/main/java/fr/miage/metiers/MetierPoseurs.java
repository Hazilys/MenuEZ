/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.Poseurs;
import fr.miage.facades.PoseursFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MartinTourancheau
 */
@Stateless
public class MetierPoseurs implements MetierPoseursLocal {

    @EJB
    private PoseursFacadeLocal poseursFacade;

    @Override
    public void creerPoseur(String nomPoseur) {
        this.poseursFacade.creerPoseur(nomPoseur);

    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Poseurs getPoseur(Long idPoseur) {
        return this.poseursFacade.find(idPoseur);
    }
}
