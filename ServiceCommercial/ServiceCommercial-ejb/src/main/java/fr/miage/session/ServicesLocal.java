/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

import java.util.Calendar;
import javax.ejb.Local;

/**
 *
 * @author Camille
 */
@Local
public interface ServicesLocal {
    
    public String creerRDVCommercial(Long idAffaire, Long idCommercial, Long idClient, Calendar dateRDVCommercial);
    
}
