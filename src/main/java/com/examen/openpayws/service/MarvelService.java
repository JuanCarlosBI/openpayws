package com.examen.openpayws.service;


import com.examen.openpayws.commons.GenericService;
import com.jb.openpay.bean.Respuesta;
import com.jb.openpay.bean.Results;

import java.util.List;

public interface MarvelService extends GenericService<com.examen.openpayws.bean.Respuesta, Long> {
    List<Results>  getAllCharacters();
    Results getCharacterById(Long characterId);
}
