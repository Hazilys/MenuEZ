/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.entities;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Camille
 */
@Local
public interface RDVClientBeanLocal {
 
    public RDVClient creerRDVClient(Long idAffaire, Long idClient, Long idPoseur, String datePose);
    
    public List<RDVClient> getRDVClient();
}
