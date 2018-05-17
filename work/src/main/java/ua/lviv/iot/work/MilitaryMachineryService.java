package ua.lviv.iot.work;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/models")
public class MilitaryMachineryService implements Serializable{
    private static Map<Integer, MilitaryMachinery> modelMap = new HashMap<Integer, MilitaryMachinery>();
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final MilitaryMachinery getPet(@PathParam("id") Integer id) {
        return modelMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createMilitaryMachinery(MilitaryMachinery model) {
        modelMap.put(model.getId(), model);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteMilitaryMachinery(@PathParam("id") Integer id) {
        modelMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateMilitaryMachinery(MilitaryMachinery model) {
        modelMap.put(model.getId(), model);
        return Response.status(200).entity("Good").build();
    }
}
