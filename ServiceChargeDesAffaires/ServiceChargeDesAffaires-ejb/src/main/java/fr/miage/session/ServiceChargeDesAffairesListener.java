/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.session;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 *
 * @author Camille
 */
@MessageDriven(mappedName = "jms/ServiceChargeDesAffairesQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ServiceChargeDesAffairesListener implements MessageListener {
    
    public ServiceChargeDesAffairesListener() {
    }
    
    @Override
    public void onMessage(Message message) {
        ObjectMessage text = (ObjectMessage) message;
        try {                
            System.out.println(text.getObject());
        } catch (JMSException ex) {
            Logger.getLogger(ServiceChargeDesAffairesListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
