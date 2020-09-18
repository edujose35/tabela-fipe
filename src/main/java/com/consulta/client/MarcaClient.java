package com.consulta.client;

import com.consulta.model.Marca;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@RegisterRestClient
public interface MarcaClient {

    @GET
    @Path("/marcas.json")
    @Produces("application/json")
    List<Marca> getMarcas();
}