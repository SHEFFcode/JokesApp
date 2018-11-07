package com.sheffmachine.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImp implements ChuckNorrisJokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes; // This class will be created once, and will not be created with every request.

    public ChuckNorrisJokeServiceImp() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
