/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.RDVClient;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MartinTourancheau
 */
@Stateless
public class RDVClientFacade extends AbstractFacade<RDVClient> implements RDVClientFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_ServiceDesPoseurs-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RDVClientFacade() {
        super(RDVClient.class);
    }

    @Override
    public RDVClient creerRDVClient(Long idAffaire, Long idClient, Long idPoseur, String datePose) {
        RDVClient rdv = new RDVClient();
        rdv.setIdAffaire(idAffaire);
        rdv.setIdClient(idClient);
        rdv.setIdPoseur(idPoseur);
        rdv.setDatePose(datePose);
        this.create(rdv);
        return rdv;
    }

    @Override
    public List<RDVClient> getRDVClient() {
        return this.findAll();
    }
    
}
