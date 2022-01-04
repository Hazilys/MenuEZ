/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Camille
 */
@Path("RDVPo")
public class RDVPoResource {

    fr.miage.session.ServicesLocal services = lookupServicesLocal();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RDVPoResource
     */
    public RDVPoResource() {
    }

    /**
     * Retrieves representation of an instance of fr.miage.RDVPoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of RDVPoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }

    private fr.miage.session.ServicesLocal lookupServicesLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (fr.miage.session.ServicesLocal) c.lookup("java:global/ServiceDesPoseurs-ear/ServiceDesPoseurs-ejb-1.0-SNAPSHOT/Services");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
