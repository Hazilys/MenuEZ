/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.facades;

import fr.miage.entities.Poseurs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MartinTourancheau
 */
@Local
public interface PoseursFacadeLocal {

    void create(Poseurs poseurs);

    void edit(Poseurs poseurs);

    void remove(Poseurs poseurs);

    Poseurs find(Object id);

    List<Poseurs> findAll();

    List<Poseurs> findRange(int[] range);

    int count();
    
}
