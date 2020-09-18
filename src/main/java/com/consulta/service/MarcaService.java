package com.consulta.service;

import com.consulta.model.Marca;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.logging.Logger;

@ApplicationScoped
public class MarcaService {

    @Inject
    EntityManager em;

    @Transactional
    public Boolean createMarca(Marca marca){
        try {
            em.persist(marca);

            return true;
        }catch (Exception e){
            Logger.getGlobal().info(e.toString());
        }

        return false;
    }
}
