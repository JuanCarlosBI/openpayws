package com.examen.openpayws.controller;


import com.examen.openpayws.service.MarvelService;
import com.jb.openpay.bean.Respuesta;
import com.jb.openpay.bean.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/Marvels")
public class MarvelController {
    @Autowired
    MarvelService marvelService;


    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Results>> getAllUsers() {
        List<Results>  respuestas = marvelService.getAllCharacters();
        return new ResponseEntity<>(respuestas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Results> getUserById(@PathVariable Long id) {
        Results respuesta = marvelService.getCharacterById(id);
        if (respuesta != null) {
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
