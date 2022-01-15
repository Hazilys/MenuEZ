/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author MartinTourancheau
 */
@Stateless
@LocalBean
public class ServiceDesAchatsProducer {
    private static Context context = null;
    private static ConnectionFactory factory = null;
    private static Connection connection = null;
    private static String factoryName = "ConnectionFactory";
    private static String destName = null;
    private static Destination dest =  null;
    private static Session session =  null;
    private static MessageProducer sender = null;
    
    public static void main(String[] args){
        
        CommanderMenuiserie(1l);
        
    }
    
    public static void CommanderMenuiserie(Long idCommande) {
        
        try {
            destName = "ServiceChargeDesAffairesQueue";
            context = new InitialContext();
            
            factory = (ConnectionFactory) context.lookup(factoryName);
            
            dest = (Destination) context.lookup(destName);
            
            connection = factory.createConnection();
            
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            sender = (MessageProducer) session.createProducer(dest);
             
            connection.start();
            
            TextMessage message =  session.createTextMessage();
            message.setText("Commande Menuiserie: " + idCommande.toString());
            sender.send(message);
            
            
        } catch (NamingException | JMSException ex) {
            Logger.getLogger(ServiceDesAchatsProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public void MAJAffaire(Long idCommande) {
        
        try {
            destName = "ServiceChargeDesAffairesQueue";
            context = new InitialContext();
            
            factory = (ConnectionFactory) context.lookup(factoryName);
            
            dest = (Destination) context.lookup(destName);
            
            connection = factory.createConnection();
            
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            sender = (MessageProducer) session.createProducer(dest);
             
            connection.start();
            
            TextMessage message =  session.createTextMessage();
            message.setText("Commande Livrée: " + idCommande.toString());
            sender.send(message);
            
            
        } catch (NamingException ex) {
            Logger.getLogger(ServiceDesAchatsProducer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JMSException ex) {
            Logger.getLogger(ServiceDesAchatsProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public void EncaisserPremierChèque(Long idCommande) {
        
        try {
            destName = "ServiceChargeDesAffairesQueue";

            context = new InitialContext();
            
            factory = (ConnectionFactory) context.lookup(factoryName);
            
            dest = (Destination) context.lookup(destName);
            
            connection = factory.createConnection();
            
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            sender = (MessageProducer) session.createProducer(dest);
             
            connection.start();
            
            TextMessage message =  session.createTextMessage();
            message.setText("Encaisser Premier Chèque: "+ idCommande.toString());
            sender.send(message);
            
            
        } catch (NamingException ex) {
            Logger.getLogger(ServiceDesAchatsProducer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JMSException ex) {
            Logger.getLogger(ServiceDesAchatsProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
