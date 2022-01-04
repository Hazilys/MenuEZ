package fr.miage.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-01-03T18:24:55")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, String> cotes;
    public static volatile SingularAttribute<Commande, Boolean> commandePassee;
    public static volatile SingularAttribute<Commande, Long> idAffaire;
    public static volatile SingularAttribute<Commande, String> refCatalogue;
    public static volatile SingularAttribute<Commande, Double> montantNegocie;
    public static volatile SingularAttribute<Commande, Boolean> commandeLivree;
    public static volatile SingularAttribute<Commande, Long> idCommande;

}