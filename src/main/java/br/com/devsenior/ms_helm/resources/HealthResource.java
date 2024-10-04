package br.com.devsenior.ms_helm.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthResource {

    @GetMapping
    public ResponseEntity<String> health() {
        String health = "Status Ok";
        return ResponseEntity.ok(health);
    }
    
}
