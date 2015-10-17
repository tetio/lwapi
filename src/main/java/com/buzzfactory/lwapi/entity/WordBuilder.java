package com.buzzfactory.lwapi.entity;

public class WordBuilder {
    private String id;
    private String word;

    public WordBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public WordBuilder setWord(String word) {
        this.word = word;
        return this;
    }

    public Word createWord() {
        return new Word(id, word);
    }
}