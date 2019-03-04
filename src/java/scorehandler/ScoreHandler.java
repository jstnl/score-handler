/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorehandler;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author justinli
 */
@Path("score")
public class ScoreHandler {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ScoreHandler
     */
    public ScoreHandler() {
    }

    /**
     * PUT method for updating or creating an instance of ScoreHandler
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/x-www-form-urlencoded")
    public void putJson(
            @FormParam("p1Id") String p1Id, 
            @FormParam("p2Id") String p2Id,
            @FormParam("p1Score") int p1Score,
            @FormParam("p2Score") int p2Score) {
        int i = 1;
    }
}
