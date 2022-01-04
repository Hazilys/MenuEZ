/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.Poseurs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MartinTourancheau
 */
@Stateless
public class PoseursFacade extends AbstractFacade<Poseurs> implements PoseursFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_ServiceDesPoseurs-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PoseursFacade() {
        super(Poseurs.class);
    }
    
    public void creerPoseur(String nomPoseur) {
        Poseurs psr = new Poseurs();
        psr.setNomPoseur(nomPoseur);
        this.create(psr);
    }

            
}
