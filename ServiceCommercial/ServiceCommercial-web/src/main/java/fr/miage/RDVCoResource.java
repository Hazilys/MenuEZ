/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage;

import com.google.gson.Gson;
import fr.miage.entities.RDVCommercial;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Camille
 */
@Path("RDVCo")
@RequestScoped
public class RDVCoResource {

    fr.miage.session.ServicesLocal services = lookupServicesLocal();

    @Context
    private UriInfo context;
    
    private Gson gson;

    /**
     * Creates a new instance of RDVCoResource
     */
    public RDVCoResource() {
    }

    /**
     * Retrieves representation of an instance of fr.miage.RDVCoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of RDVCoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content){
        RDVCommercial rdv = this.gson.fromJson(content, RDVCommercial.class);
        this.services.creerRDVCommercial(rdv.getIdAffaire(), rdv.getIdCommercial(), rdv.getIdClient(), rdv.getDateRDVCommercial());
    }

    private fr.miage.session.ServicesLocal lookupServicesLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (fr.miage.session.ServicesLocal) c.lookup("java:global/ServiceCommercial-ear/ServiceCommercial-ejb-1.0-SNAPSHOT/Services");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
