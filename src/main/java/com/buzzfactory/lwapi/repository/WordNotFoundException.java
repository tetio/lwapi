package com.buzzfactory.lwapi.repository;

/**
 * Created by tetio on 17/10/15.
 */
public class WordNotFoundException extends RuntimeException {
    public WordNotFoundException(String id) {
        super(String.format("No word entry found with id: <%s>", id));
    }
}
