package com.buzzfactory.lwapi.controller;

import com.buzzfactory.lwapi.dto.GameDTO;
import com.buzzfactory.lwapi.service.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tetio on 17/10/15.
 */
@RestController
@RequestMapping("/api/game")
public class GameController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);

    private final GameService service;

    @Autowired
    GameController(GameService service) {
        this.service = service;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    GameDTO findById(@PathVariable("id") String id) {
        LOGGER.info("Finding word entry with id: {}", id);

        GameDTO todoEntry = service.findById(id);
        LOGGER.info("Found word entry with information: {}", todoEntry);

        return todoEntry;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<GameDTO> findAll() {
        LOGGER.info("Finding all words");

        List<GameDTO> games = service.findAll();
        LOGGER.info("Found games #{}", games.size());

        return games;
    }
}
