package com.buzzfactory.lwapi.controller;

import com.buzzfactory.lwapi.dto.WordDTO;
import com.buzzfactory.lwapi.service.WordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tetio on 17/10/15.
 */
@RestController
@RequestMapping("/api/word")
public class WordController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WordController.class);

    private final WordService service;

    @Autowired
    WordController(WordService service) {
        this.service = service;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    WordDTO findById(@PathVariable("id") String id) {
        LOGGER.info("Finding word entry with id: {}", id);

        WordDTO todoEntry = service.findById(id);
        LOGGER.info("Found word entry with information: {}", todoEntry);

        return todoEntry;
    }

}
