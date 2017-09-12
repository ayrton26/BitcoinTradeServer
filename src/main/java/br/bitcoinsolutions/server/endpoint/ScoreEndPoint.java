/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.bitcoinsolutions.server.endpoint;

import br.bitcoinsolutions.server.model.Score;
import br.bitcoinsolutions.server.service.ScoreService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
/**
 *
 * @author Tj
 */
@Path("/score")
public class ScoreEndPoint {

    @Inject
    ScoreService service;
    
    
    @GET
    @Path("fill")
    @Produces("application/json")
    public Response fill() throws Exception {
        service.fill();
        return Response.ok().build();
    }
    
    @GET
    @Produces("application/json")
    public List<Score> list() throws Exception {
        return service.list();
    }
    
    @PUT
    @Consumes("application/json")
    public Response add(Score score) {
        service.insert(score);
        return Response.ok().build();
    }
   
    @POST
    @Consumes("application/json")
    public Response update(Score score) {
        service.update(score);
        return Response.ok().build();
    }
    
    @DELETE
    @Consumes("application/json")
    public Response delete(Score score) {
        service.delete(score);
        return Response.ok().build();
    }
   
}
