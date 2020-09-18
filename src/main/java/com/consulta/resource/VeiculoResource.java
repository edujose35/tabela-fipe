package com.consulta.resource;

import com.consulta.client.VeiculoClient;
import com.consulta.model.Veiculo;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/veiculos")
public class VeiculoResource {

    @Inject
    @RestClient
    VeiculoClient veiculoClient;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> veiculoPorMarca(@PathParam Long id){
        return veiculoClient.getVeiculosByMarca(id);
    }
}
