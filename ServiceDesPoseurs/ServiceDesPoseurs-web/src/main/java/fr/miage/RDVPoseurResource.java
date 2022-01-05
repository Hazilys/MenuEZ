/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage;

import com.google.gson.Gson;
import fr.miage.entities.RDVClient;
import fr.miage.entities.RDVClientBeanLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Camille
 */
@Path("RDVPoseur")
public class RDVPoseurResource {

    RDVClientBeanLocal rDVClientBean = lookupRDVClientBeanLocal();

    private Gson gson;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RDVPoseurResource
     */
    public RDVPoseurResource() {
        this.gson = new Gson();
    }

    /**
     * Retrieves representation of an instance of fr.miage.RDVPoseurResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return this.gson.toJson(this.rDVClientBean.getRDVClient());
    }

    /**
     * PUT method for updating or creating an instance of RDVPoseurResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        RDVClient rdv = this.gson.fromJson(content, RDVClient.class);
        this.rDVClientBean.creerRDVClient(rdv.getIdAffaire(), rdv.getIdClient(), rdv.getIdPoseur(), rdv.getDatePose());
    }

    private RDVClientBeanLocal lookupRDVClientBeanLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (RDVClientBeanLocal) c.lookup("java:global/ServiceDesPoseurs-ear/ServiceDesPoseurs-ejb-1.0-SNAPSHOT/RDVClientBean!fr.miage.entities.RDVClientBeanLocal");
            //return (RDVClientBeanLocal) c.lookup("java:global/com.mycompany_ServiceDesPoseurs-ear_ear_1.0-SNAPSHOT/com.mycompany_ServiceDesPoseurs-ejb_ejb_1.0-SNAPSHOT/RDVClientBean!fr.miage.entities.RDVClientBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
