/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.RDVClient;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MartinTourancheau
 */
@Local
public interface RDVClientFacadeLocal {

    void create(RDVClient rDVClient);

    void edit(RDVClient rDVClient);

    void remove(RDVClient rDVClient);

    RDVClient find(Object id);

    List<RDVClient> findAll();

    List<RDVClient> findRange(int[] range);

    int count();

    public void creerRDVClient(Long idAffaire, Long idClient, Long idPoseur, String datePose);
    
}
