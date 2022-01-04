/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

import com.google.gson.Gson;
import fr.miage.entities.RDVCommercial;
import fr.miage.entities.RDVCommercialBeanLocal;
import fr.miage.facades.RDVCommercialFacadeLocal;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Camille
 */
@Stateless
public class Services implements ServicesLocal {

    @EJB
    private RDVCommercialBeanLocal RDVCommercialBean;    

    private Gson gson;

    public Services() {
        this.gson = new Gson();
    }

    @Override
    public String creerRDVCommercial(Long idAffaire, Long idCommercial, Long idClient, Calendar dateRDVCommercial) {
        String retourne = null;
        try {
            if (idAffaire.toString().isEmpty() || idCommercial.toString().isEmpty() || idClient.toString().isEmpty() || dateRDVCommercial.getTimeInMillis() == 0) {
                throw new InterruptedException();
            }
            RDVCommercial rdv = this.RDVCommercialBean.creerRDVCommercial(idAffaire, idCommercial, idClient, dateRDVCommercial);
            retourne = this.gson.toJson(rdv);
        } catch (InterruptedException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retourne;
    }
}
