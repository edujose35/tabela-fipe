package com.consulta.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marca extends PanacheEntityBase {

    @Id
    private Long id;

    @Column
    private String name;

    @Column(name = "ValueForOrder")
    private String order;

    @Column
    private String key;

    public Marca(Long id, String name, String order, String key) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.key = key;
    }

    public Marca(){
    }

    public Marca findByName(String name){
        return find("name", name).firstResult();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
