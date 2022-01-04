/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.entities;

import fr.miage.facades.RDVCommercialFacadeLocal;
import java.util.Calendar;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Camille
 */
@Stateless
public class RDVCommercialBean implements RDVCommercialBeanLocal {

    @EJB
    private RDVCommercialFacadeLocal RDVCommercialFacade;

    public RDVCommercial creerRDVCommercial(Long idAffaire, Long idCommercial, Long idClient, Calendar dateRDVCommercial){
        return this.RDVCommercialFacade.creerRDVCommercial(idAffaire, idCommercial, idClient, dateRDVCommercial);
    }
    
}
