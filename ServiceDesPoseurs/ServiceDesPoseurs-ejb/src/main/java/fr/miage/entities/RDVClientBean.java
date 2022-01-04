/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.entities;

import fr.miage.facades.RDVClientFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Camille
 */
@Stateless
public class RDVClientBean implements RDVClientBeanLocal {

    @EJB
    private RDVClientFacadeLocal RDVClientFacade;

    public RDVClient creerRDVClient(Long idAffaire, Long idClient, Long idPoseur, String datePose){
        return this.RDVClientFacade.creerRDVClient(idAffaire, idClient, idPoseur, datePose);
    }
}
