package com.buzzfactory.lwapi.service;


import com.buzzfactory.lwapi.dto.WordDTO;

import java.util.List;

/**
 * Created by tetio on 17/10/15.
 */
public interface WordService {

    WordDTO create(WordDTO word);

    WordDTO delete(String id);

    List<WordDTO> findAll();

    WordDTO findById(String id);

    WordDTO update(WordDTO word);
}