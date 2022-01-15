/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

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
public class ServiceComProducer {

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
        
        public static void main(String[] args) {
            renseignerInfosCommande(destName, text, Double.MIN_NORMAL, Boolean.FALSE, Boolean.FALSE, Long.MIN_VALUE);
            deposerCheque(count, Double.NaN, Long.MIN_VALUE);
        }
        
        
        public static void renseignerInfosCommande(String refCatalogue, String cotes, Double montantNeogicie, Boolean commandePassee, Boolean commandeLivree, Long idAffaire) {
            
            try {
            // create the JNDI initial context.
            context = new InitialContext();

            // look up the ConnectionFactory
            factory = (ConnectionFactory) context.lookup(factoryName);
            destName = "ServiceChargeDesAffairesQueue";
            // look up the Destination
            dest = (Destination) context.lookup(destName);

            // create the connection
            connection = factory.createConnection();

            // create the session
            session = connection.createSession(
                false, Session.AUTO_ACKNOWLEDGE);

            // create the sender
            sender = session.createProducer(dest);

            // start the connection, to enable message sends
            connection.start();
            
            TextMessage message = session.createTextMessage();
            text = "Veuillez créer la commande suivante :" + refCatalogue + ", " + cotes + ", " + montantNeogicie + ", " + commandePassee + ", " + commandeLivree + ", " + idAffaire;
            message.setText(text);
            sender.send(message);
            
        } catch (JMSException | NamingException exception) {
            exception.printStackTrace();
        } finally {
            // close the context
            if (context != null) {
                try {
                    context.close();
                } catch (NamingException exception) {
                    exception.printStackTrace();
                }
            }

            // close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException exception) {
                    exception.printStackTrace();
                }
            }
        
        }
    
}
        
        public static void deposerCheque(int numCheque, Double montant, Long idCommande) {
            
            try {
            // create the JNDI initial context.
            context = new InitialContext();

            // look up the ConnectionFactory
            factory = (ConnectionFactory) context.lookup(factoryName);
            
            destName = "ServiceComptableQueue";
            // look up the Destination
            dest = (Destination) context.lookup(destName);

            // create the connection
            connection = factory.createConnection();

            // create the session
            session = connection.createSession(
                false, Session.AUTO_ACKNOWLEDGE);

            // create the sender
            sender = session.createProducer(dest);

            // start the connection, to enable message sends
            connection.start();
            
            TextMessage message = session.createTextMessage();
            text = "Veuillez encaisser le cheque suivant :" + numCheque + ", " + montant + ", " + idCommande;
            message.setText(text);
            sender.send(message);
            
        } catch (JMSException exception) {
            exception.printStackTrace();
        } catch (NamingException exception) {
            exception.printStackTrace();
        } finally {
            // close the context
            if (context != null) {
                try {
                    context.close();
                } catch (NamingException exception) {
                    exception.printStackTrace();
                }
            }

            // close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException exception) {
                    exception.printStackTrace();
                }
            }
        
        }
    
}
}
