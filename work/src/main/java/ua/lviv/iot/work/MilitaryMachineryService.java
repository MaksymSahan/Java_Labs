package ua.lviv.iot.work;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
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
@SessionScoped
public class MilitaryMachineryService {
    private static Map<Integer, MilitaryMachinery> modelMap = new HashMap<Integer, MilitaryMachinery>();
    
    @Inject
    private  MilitaryMachineryDao dao;
    
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
