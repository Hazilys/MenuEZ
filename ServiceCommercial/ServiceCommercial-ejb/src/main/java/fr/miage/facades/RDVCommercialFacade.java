/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.RDVCommercial;
import java.util.Calendar;
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
    
    public RDVCommercial creerRDVCommercial(Long idAffaire, Long idCommercial, Long idClient, Calendar dateRDVCommercial) {
        RDVCommercial rdv = new RDVCommercial();
        rdv.setIdAffaire(idAffaire);
        rdv.setIdCommercial(idCommercial);
        rdv.setIdClient(idClient);
        rdv.setDateRDVCommercial(dateRDVCommercial);
        this.create(rdv);
        return rdv;
    }
    
}
