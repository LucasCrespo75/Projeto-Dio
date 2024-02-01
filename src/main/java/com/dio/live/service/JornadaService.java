package com.dio.live.service;


import com.dio.live.joranadaRepository.JornadaRepository;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    final JornadaRepository jornadaRepository;


    public JornadaService(JornadaRepository jornadaRepository ) {
        this.jornadaRepository = jornadaRepository;

    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
            Optional<JornadaTrabalho> jogarnadaLista = jornadaRepository.findById(jornadaTrabalho.getId());
            if (jornadaRepository.existsById(jornadaTrabalho.getId())) {
                System.out.println("Usuario ja existente");
            }else {
                jornadaRepository.save(jornadaTrabalho);
            }
            //colocar uma mensagem ideal para aparecer no postman
        return jornadaTrabalho;
    }

    public List<JornadaTrabalho> listando() {
        return jornadaRepository.findAll();
    }


    public Optional< JornadaTrabalho> getId(Long id) {
         return jornadaRepository.findById(id);
    }
}
