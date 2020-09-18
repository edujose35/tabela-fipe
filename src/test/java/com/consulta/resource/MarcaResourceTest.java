package com.consulta.resource;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.hasItem;

@QuarkusTest
@TestHTTPEndpoint(MarcaResource.class)
public class MarcaResourceTest {

    @Test
    public void testMarcasEndpoint() {
        given()
          .when().get("/marcas")
          .then()
             .statusCode(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(notNullValue());
    }

    @Test
    public void testMarcaEndpoint() {
        String fiat = "{\"name\":\"FIAT\",\"fipe_name\":\"Fiat\",\"order\":2,\"key\":\"fiat-21\",\"id\":21}";
        given()
                .when().get("/marcas/fiat")
                .then()
                .statusCode(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(containsString(fiat));
    }

//    @Test
//    public void testVeiculosEndpoint() {
//        String carro = "[{"fipe_marca":";
//        given()
//                .when().get("/veiculos/fiat")
//                .then()
//                .statusCode(200)
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(hasItem(carro));
//    }
}