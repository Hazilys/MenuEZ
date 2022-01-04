/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

import com.google.gson.Gson;
import fr.miage.entities.RDVClient;
import fr.miage.entities.RDVClientBeanLocal;
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
    private RDVClientBeanLocal RDVClientBean;

    private Gson gson;

    public Services() {
        this.gson = new Gson();
    }

    @Override
    public String creerRDVPoseurs(Long idAffaire, Long idClient, Long idPoseur, String datePose) {
        String retourne = null;
        try {
            if (idAffaire.toString().isEmpty() || idClient.toString().isEmpty() || idPoseur.toString().isEmpty() || datePose.toString().isEmpty()) {
                throw new InterruptedException();
            }
            RDVClient rdv = this.RDVClientBean.creerRDVClient(idAffaire, idClient, idPoseur, datePose);
            retourne = this.gson.toJson(rdv);
        } catch (InterruptedException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retourne;
    }
}
