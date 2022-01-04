/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.RDVCommercial;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Camille
 */
@Local
public interface RDVCommercialFacadeLocal {

    void create(RDVCommercial rDVCommercial);

    void edit(RDVCommercial rDVCommercial);

    void remove(RDVCommercial rDVCommercial);

    RDVCommercial find(Object id);

    List<RDVCommercial> findAll();

    List<RDVCommercial> findRange(int[] range);

    int count();
    
    public RDVCommercial creerRDVCommercial(Long idAffaire, Long idCommercial, Long idClient, Calendar dateRDVCommercial);
    
}
