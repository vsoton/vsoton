package org.vsoton.app.controlhogar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class LedController {
    
@PostMapping("/cambiarEstadoLED")
public String postMethodName(@RequestBody String entity) {
    return entity;
}

@GetMapping("holamundo")
public String getMethodName() {
    return new String("Hola Mundo");
}


}
