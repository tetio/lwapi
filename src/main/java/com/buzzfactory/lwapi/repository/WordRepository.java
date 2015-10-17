package com.buzzfactory.lwapi.repository;

import com.buzzfactory.lwapi.entity.Word;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by tetio on 17/10/15.
 */
public interface WordRepository extends Repository<Word, String> {

    void delete(Word deleted);

    List<Word> findAll();

    Optional<Word> findOne(String id);

    Word save(Word saved);
}