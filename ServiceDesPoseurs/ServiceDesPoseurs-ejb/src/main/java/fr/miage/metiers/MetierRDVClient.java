/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.RDVClient;
import fr.miage.facades.RDVClientFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author MartinTourancheau
 */
@Stateless
public class MetierRDVClient implements MetierRDVClientLocal {

    @EJB
    private RDVClientFacadeLocal rdvClientFacade;

    @Override
    public void creerRDVClient(Long idAffaire, Long idClient, Long idPoseur, String datePose) {
        this.rdvClientFacade.creerRDVClient(idAffaire, idClient, idPoseur, datePose);

    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public RDVClient getRDVClient(Long idRdvClient) {
        return this.rdvClientFacade.find(idRdvClient);
    }
}
