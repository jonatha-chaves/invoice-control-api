package br.com.idip.invoicecontrolapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jonatha@idip.com.br
 */
@RestController
@RequestMapping("/")
public class HealthyController {

    @GetMapping
    public ResponseEntity<?> healthy() throws Exception {
        return ResponseEntity.ok().body("Invoice Control API - ONLINE");
    }

}