package com.buzzfactory.lwapi.service;

import com.buzzfactory.lwapi.repository.EntityNotFoundException;
import com.buzzfactory.lwapi.repository.WordRepository;
import com.buzzfactory.lwapi.dto.WordDTO;
import com.buzzfactory.lwapi.entity.Word;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by tetio on 17/10/15.
 */
@Service
public class MongoDBWordService implements WordService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MongoDBWordService.class);

    private final WordRepository repository;

    @Autowired
    MongoDBWordService(WordRepository repository) {
        this.repository = repository;
    }



    @Override
    public WordDTO create(WordDTO word) {
        return null;
    }

    @Override
    public WordDTO delete(String id) {
        return null;
    }

    @Override
    public List<WordDTO> findAll() {
        return null;
    }

    @Override
    public WordDTO findById(String id) throws EntityNotFoundException {
        LOGGER.info("Finding with entry with id: {}", id);

        Word word = findWordById(id);

        LOGGER.info("Finding with entry with id: {}", word);

        return convertToDTO(word);
    }


    private Word findWordById(String id) {
        Optional<Word> result = repository.findOne(id);
        return result.orElseThrow(() -> new EntityNotFoundException(id));
    }

    @Override
    public WordDTO update(WordDTO word) {
        return null;
    }

    private WordDTO convertToDTO(Word model) {
        WordDTO dto = new WordDTO();

        dto.setId(model.getId());
        dto.setWord(model.getWord());

        return dto;
    }
}
