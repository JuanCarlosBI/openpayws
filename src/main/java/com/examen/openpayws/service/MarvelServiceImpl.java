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
    private static final String BASE_URL = "https://gateway.marvel.com:443/v1/public/characters";
    private static final String API_KEY_PUBLIC = "23edc1b6133b84ad8cb023d783166207";
    private static final String API_KEY_PRIVATE = "0dcf1291561dfec702ad8d45eee4fff122247749";
    private static final String CODIGO = "1";

    private static final String HASH = "59b3cc1af7eb6b398cbd43b8e4aa8c73";

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
