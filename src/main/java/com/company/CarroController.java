package com.company;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * CarroController
 */
@Path("carro")
public class CarroController {

    @Context
    UriInfo uriInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){

        return Response
        .ok(CarroModel.listAll())
        .build();
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response post(CarroModel model){

        model.persist();

        return Response
        .created(uriInfo.getRequestUri())
        .build();
    }

    @Transactional
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response put(CarroModel model){

      model.persist();

      return Response.noContent().build();
    }
}
