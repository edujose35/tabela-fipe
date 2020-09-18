package com.consulta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    private Long id;

    @JsonProperty(value = "fipe_marca")
    private String fipe_marca;

    private String name;

    private String marca;

    private String key;

    @JsonProperty(value = "fipe_name")
    private String fipe_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFipeMarca() {
        return fipe_marca;
    }

    public void setFipeMarca(String fipe_marca) {
        this.fipe_marca = fipe_marca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFipeName() {
        return fipe_name;
    }

    public void setFipeName(String fipe_name) {
        this.fipe_name = fipe_name;
    }
}
