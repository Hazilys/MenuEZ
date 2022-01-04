/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facade;

import fr.miage.entities.Cheque;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Elias
 */
@Stateless
public class ChequeFacade extends AbstractFacade<Cheque> implements ChequeFacadeLocal {

    @PersistenceContext(unitName = "ServiceComptablePersistenceUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ChequeFacade() {
        super(Cheque.class);
    }

    @Override
    public void creerCheque(int numCheque, Double montant, Long idCommande) {
        Cheque chq = new Cheque();
        chq.setNumCheque(numCheque);
        chq.setMontant(montant);
        chq.setIsEncaisse(false);
        chq.setIdCommande(idCommande);
        this.create(chq);
    }

    @Override
    public void encaisserCheque(Cheque cheque) {
        Cheque chq = this.find(cheque);
        chq.setIsEncaisse(true);
    }
    
}
