package com.dio.live.controller;


import com.dio.live.dtos.JornadaRecordDto;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class JornadaController {


    final JornadaService jornadaService;


    public JornadaController(JornadaService jornadaService) {
        this.jornadaService = jornadaService;
    }


    @PostMapping(value = "/criando")
    public ResponseEntity<JornadaTrabalho> salvarJornada(@RequestBody JornadaRecordDto jornadaRecordDto) {
        var jornadaTrabalho = new JornadaTrabalho();
        BeanUtils.copyProperties(jornadaRecordDto, jornadaTrabalho);
        return ResponseEntity.status(HttpStatus.CREATED).body(jornadaService.saveJornada(jornadaTrabalho));
    }

    @GetMapping(value = "/listando")
    public ResponseEntity<List<JornadaTrabalho>> listarJornadas() {
        return ResponseEntity.status(HttpStatus.OK).body(jornadaService.listando());

    }

    @GetMapping(value = "/procurando/id")
    public ResponseEntity <JornadaTrabalho> procurandoId(@PathVariable("id") Long id, @RequestBody JornadaRecordDto jornadaRecordDto ) {
            var jornadaTrabalho = new JornadaTrabalho();
            BeanUtils.copyProperties(jornadaRecordDto, jornadaTrabalho);

        Optional<JornadaTrabalho> listaJornada = jornadaService.getId(id);
        if(listaJornada.isPresent()){
            jornadaTrabalho = listaJornada.get();
            return ResponseEntity.ok(jornadaTrabalho);
        }else{
            throw new RuntimeException("Jornada de trabalho nao encontrada");
    }
}
    }