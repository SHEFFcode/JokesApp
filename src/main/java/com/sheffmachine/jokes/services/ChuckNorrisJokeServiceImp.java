package com.sheffmachine.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImp {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeServiceImp(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
