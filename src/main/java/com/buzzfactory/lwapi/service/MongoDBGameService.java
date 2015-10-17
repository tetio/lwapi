package com.buzzfactory.lwapi.service;

import com.buzzfactory.lwapi.dto.GameDTO;
import com.buzzfactory.lwapi.entity.Game;
import com.buzzfactory.lwapi.entity.Word;
import com.buzzfactory.lwapi.repository.GameRepository;
import com.buzzfactory.lwapi.repository.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by tetio on 17/10/15.
 */
@Service
public class MongoDBGameService implements GameService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MongoDBGameService.class);

    private final GameRepository repository;

    @Autowired
    MongoDBGameService(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public GameDTO create(GameDTO word) {
        return null;
    }

    @Override
    public GameDTO delete(String id) {
        return null;
    }

    @Override
    public List<GameDTO> findAll() {
        LOGGER.info("Finding all game");

        return repository.findAll().stream().map(g -> convertToDTO(g)).collect(Collectors.toList());
    }

    @Override
    public GameDTO findById(String id) {
        LOGGER.info("Finding game  with id: {}", id);

        Game game = findGameById(id);

        LOGGER.info("Finding game with id: {}", game);

        return convertToDTO(game);
    }

    @Override
    public GameDTO update(GameDTO word) {
        return null;
    }


    private Game findGameById(String id) {
        Optional<Game> result = repository.findOne(id);
        return result.orElseThrow(() -> new EntityNotFoundException(id));
    }


    private GameDTO convertToDTO(Game model) {
        GameDTO dto = new GameDTO(model.getId(),
                model.getLanguage(),
                model.getNum_players(),
                model.getMax_players(),
                model.getState(),
                model.getSeed(),
                model.getDoc(),
                model.getUsed_words(),
                model.getPlayers());

        return dto;
    }
}
