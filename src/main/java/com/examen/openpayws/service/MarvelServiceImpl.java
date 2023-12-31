package com.examen.openpayws.service;


import com.examen.openpayws.commons.GenericServiceImpl;
import com.examen.openpayws.dao.RespuestaDao;
import com.jb.openpay.bean.Respuesta;
import com.jb.openpay.bean.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarvelServiceImpl extends GenericServiceImpl<com.examen.openpayws.bean.Respuesta,Long > implements MarvelService {

    @Autowired
    RespuestaDao respuestaDao;


    public List<Results> getAllCharacters() {
        System.out.println("getAllCharacters()");

        com.jb.openpay.controller.Marvel marvel = new com.jb.openpay.controller.Marvel();

        //this.save(setData(marvel.getAllCharacters()) );

        return marvel.getAllCharacters().getData().getResults();
    }

    public Results getCharacterById(Long characterId) {
        com.jb.openpay.controller.Marvel marvel = new com.jb.openpay.controller.Marvel();

        return marvel.getCharacterById(characterId).getData().getResults().get(0);
    }

    private com.examen.openpayws.bean.Respuesta  setData( Respuesta respuestaData){
        com.examen.openpayws.bean.Respuesta  respuestaResultado = new com.examen.openpayws.bean.Respuesta();

        respuestaResultado.setCode(respuestaData.getCode());
        respuestaResultado.setStatus(respuestaData.getStatus());
        respuestaResultado.setCopyright(respuestaData.getCopyright());
        respuestaResultado.setAttributionText(respuestaData.getAttributionText());
        respuestaResultado.setAttributionHTML(respuestaData.getAttributionHTML());
        respuestaResultado.setEtag(respuestaData.getEtag());

        return respuestaResultado;
    }


    @Override
    public CrudRepository<com.examen.openpayws.bean.Respuesta, Long> getDao() {
        return respuestaDao;
    }
}
