package com.consulta.client;

import com.consulta.model.Veiculo;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@RegisterRestClient
public interface VeiculoClient {

    @GET
    @Path("/veiculos/{id}.json")
    @Produces("application/json")
    List<Veiculo> getVeiculosByMarca(@PathParam Long id);
}