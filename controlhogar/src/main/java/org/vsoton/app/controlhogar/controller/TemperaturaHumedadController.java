package org.vsoton.app.controlhogar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.vsoton.app.controlhogar.model.TemperaturaHumedad;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController


public class TemperaturaHumedadController {

    private final Logger LOG = LoggerFactory.getLogger(TemperaturaHumedadController.class);

    @GetMapping("/clima")
    public TemperaturaHumedad getClima() {
        TemperaturaHumedad tempandhum = new TemperaturaHumedad();
        tempandhum.setHumedad(10);
        tempandhum.setTemperatura(new BigDecimal(17));
        LOG.info("consultando clima ... ");
        
        return tempandhum;
    }

    @PostMapping("/clima")
    public TemperaturaHumedad postMethodName(@RequestBody TemperaturaHumedad entity) {
        LOG.info("consultando clima ... temperatura :"+entity.getTemperatura()+" humedad "+entity.getHumedad());
        
        return entity;
    }
    
    
}
