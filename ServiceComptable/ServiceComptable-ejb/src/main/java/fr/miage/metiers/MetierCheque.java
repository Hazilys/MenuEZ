/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.Cheque;
import fr.miage.facade.ChequeFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Elias
 */
@Stateless
public class MetierCheque implements MetierChequeLocal {

    @EJB
    private ChequeFacadeLocal chequeFacade;

    @Override
    public void creerCheque(int numCheque, Double montant, Long idCommande) {
        this.chequeFacade.creerCheque(numCheque, montant, idCommande);
    }

    @Override
    public void encaisserCheque(Cheque cheque) {
       
    }


  
   
}
