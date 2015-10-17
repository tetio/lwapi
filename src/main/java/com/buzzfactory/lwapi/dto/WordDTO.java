package com.buzzfactory.lwapi.dto;

/**
 * Created by tetio on 17/10/15.
 */
public class WordDTO {
    String id;
    String word;

    public WordDTO() {
    }

    public WordDTO(String id, String word) {
        this.id = id;
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WordDTO{" +
                "id='" + id + '\'' +
                ", word='" + word + '\'' +
                '}';
    }
}
