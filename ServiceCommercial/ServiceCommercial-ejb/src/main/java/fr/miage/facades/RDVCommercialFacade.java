/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.RDVCommercial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camille
 */
@Stateless
public class RDVCommercialFacade extends AbstractFacade<RDVCommercial> implements RDVCommercialFacadeLocal {

    @PersistenceContext(unitName = "ServiceCommercialPersistenceUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RDVCommercialFacade() {
        super(RDVCommercial.class);
    }
    
}
