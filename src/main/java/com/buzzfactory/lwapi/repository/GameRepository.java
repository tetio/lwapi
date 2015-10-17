package com.buzzfactory.lwapi.repository;

import com.buzzfactory.lwapi.entity.Game;
import com.buzzfactory.lwapi.entity.Word;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by tetio on 17/10/15.
 */
public interface GameRepository extends Repository<Game, String> {

    void delete(Game deleted);

    List<Game> findAll();

    Optional<Game> findOne(String id);

    Word save(Game saved);
}