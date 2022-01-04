/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.Cheque;
import javax.ejb.Local;

/**
 *
 * @author Elias
 */
@Local
public interface MetierChequeLocal {
    
    public void creerCheque(int numCheque, Double montant, Long idCommande);
    
    public void encaisserCheque(Cheque cheque);
}
