package org.vsoton.app.controlhogar.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperaturaHumedad {    
    @JsonProperty
    private BigDecimal temperatura;

    @JsonProperty
    private Integer humedad;

    
    public BigDecimal getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(BigDecimal temperatura) {
        this.temperatura = temperatura;
    }
    public Integer getHumedad() {
        return humedad;
    }
    public void setHumedad(Integer humerdad) {
        this.humedad = humerdad;
    }
}
