/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.RDVClient;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MartinTourancheau
 */
@Stateless
public class RDVClientFacade extends AbstractFacade<RDVClient> implements RDVClientFacadeLocal {

    @PersistenceContext(unitName = "fr.miage_ServiceDesPoseurs-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RDVClientFacade() {
        super(RDVClient.class);
    }
    
}
