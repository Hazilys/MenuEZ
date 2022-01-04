/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.Cheque;
import javax.ejb.Stateless;

/**
 *
 * @author Elias
 */
@Stateless
public class MetierCheque implements MetierChequeLocal {

    @Override
    public void creerCheque(int numCheque, Double montant, Long idCommande) {
        
    }

    @Override
    public void encaisserCheque(Cheque cheque) {
       
    }


  
   
}
