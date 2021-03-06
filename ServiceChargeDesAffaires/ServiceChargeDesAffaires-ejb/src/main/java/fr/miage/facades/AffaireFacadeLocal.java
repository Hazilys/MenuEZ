/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.Affaire;
import fr.miage.entities.Client;
import fr.miage.entities.ETAT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Camille
 */
@Local
public interface AffaireFacadeLocal {

    void create(Affaire affaire);

    void edit(Affaire affaire);

    void remove(Affaire affaire);

    Affaire find(Object id);

    List<Affaire> findAll();

    List<Affaire> findRange(int[] range);

    int count();
    
    public void creerAffaire(String geolocalisation, Long idCa, Client client);
    
}
