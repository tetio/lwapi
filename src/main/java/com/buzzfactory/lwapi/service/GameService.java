package com.buzzfactory.lwapi.service;

import com.buzzfactory.lwapi.dto.GameDTO;

import java.util.List;

/**
 * Created by tetio on 17/10/15.
 */
public interface GameService {
    GameDTO create(GameDTO word);

    GameDTO delete(String id);

    List<GameDTO> findAll();

    GameDTO findById(String id);

    GameDTO update(GameDTO word);
}
