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
 * @author Elias
 */
@Stateless
@LocalBean
public class ServiceChargeDesAffairesProducer {
        private static Context context = null;
        private static ConnectionFactory factory = null;
        private static Connection connection = null;
        private static String factoryName = "ConnectionFactory";
        private static String destName = null;
        private static Destination dest = null;
        private static int count = 1;
        private static Session session = null;
        private static MessageProducer sender = null;
        private static String text = null;
    
        
        public static void main(String[] args){
        
        EncaisserDeuxiemeChèque(1l);
        
    }

   public static void EncaisserDeuxiemeChèque(Long idCommande) {
        
        
       
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
            message.setText("Encaisser Deuxième Chèque: "+ idCommande.toString());
            sender.send(message);
            
            
        } catch (NamingException ex) {
            Logger.getLogger(ServiceChargeDesAffairesProducer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JMSException ex) {
            Logger.getLogger(ServiceChargeDesAffairesProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
