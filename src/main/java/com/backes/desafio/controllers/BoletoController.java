package com.backes.desafio.controllers;

import com.backes.desafio.dtos.NovoBoletoDto;
import com.backes.desafio.dtos.RetornoNovoBoletoDto;
import com.backes.desafio.services.BoletoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/boletos")
public class BoletoController {

    final BoletoService boletoService;

    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveBoleto(@RequestBody @Valid NovoBoletoDto novoBoletoDto) {
        RetornoNovoBoletoDto retornoNovoBoleto = boletoService.salvarBoleto(novoBoletoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(retornoNovoBoleto);
    }
}