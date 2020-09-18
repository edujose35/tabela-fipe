package com.consulta.resource;

import com.consulta.client.MarcaClient;
import com.consulta.model.Marca;
import com.consulta.service.MarcaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.cache.CacheResult;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/marcas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MarcaResource {

    @Inject
    @RestClient
    MarcaClient marcaClient;

    @Inject
    MarcaService marcaService;

    @GET
    @CacheResult(cacheName = "marca-cache")
    public List<Marca> listarMarcas(){
        return marcaClient.getMarcas();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Marca marca){
        Boolean success = marcaService.createMarca(marca);

        return Response.ok(success).build();
    }
}