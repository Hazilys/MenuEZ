/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Destination;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.MessageConsumer;
import javax.jms.TextMessage;

/**
 *
 * @author Elias
 */
@Stateless
@LocalBean
public class ServiceComptableConsumer {

    
    
    public static void main(String[] args) {
        
        Context context = null;
        ConnectionFactory factory = null;
        Connection connection = null;
        String factoryName = "ConnectionFactory";
        String destName = null;
        Destination dest = null;
        int count = 1;
        Session session = null;
        MessageConsumer receiver = null;
        
        try {
            // create the JNDI initial context
            context = new InitialContext();

            // look up the ConnectionFactory
            factory = (ConnectionFactory) context.lookup(factoryName);

            destName = "ServiceComptable";
            // look up the Destination
            dest = (Destination) context.lookup(destName);

            // create the connection
            connection = factory.createConnection();

            // create the session
            session = connection.createSession(
                false, Session.AUTO_ACKNOWLEDGE);

            // create the receiver
            //receiver = session.createConsumer(dest);
            
            // create the receiver avec le type
            receiver = session.createConsumer(dest, "JMSType = 'T1'");

            // start the connection, to enable message receipt
            connection.start();
            
            
            Message message = receiver.receive();
            TextMessage tm = (TextMessage) message;
            System.out.println(tm.getText());
            
                    
            
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
