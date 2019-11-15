package at.htl.formula1.boundary;

import at.htl.formula1.entity.Driver;

import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


public class ResultsEndpoint {

    @PersistenceContext
    EntityManager em;

    /**
     * @param name als QueryParam einzulesen
     * @return JsonObject
     */
    @GET
    @Path("name")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getPointsSumOfDriver(@QueryParam("name") String name) {
        try {

            return null;

        }catch (NoResultException e){
            throw new WebApplicationException(Response.Status.BAD_GATEWAY);
        }

    }

    /**
     * @param id des Rennens
     * @return
     */
    public Response findWinnerOfRace(long id) {
        return null;
    }


    // Ergänzen Sie Ihre eigenen Methoden ...

}
