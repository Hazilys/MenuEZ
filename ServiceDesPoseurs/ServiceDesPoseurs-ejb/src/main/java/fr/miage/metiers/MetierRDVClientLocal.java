/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.metiers;

import fr.miage.entities.RDVClient;
import javax.ejb.Local;

/**
 *
 * @author MartinTourancheau
 */
@Local
public interface MetierRDVClientLocal {
    
    public void creerRDVClient(Long idAffaire, Long idClient, Long idPoseur, String datePose);
    public RDVClient getRDVClient(Long idRdvClient);
   
}
