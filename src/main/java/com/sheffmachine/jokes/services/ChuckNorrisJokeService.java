package com.sheffmachine.jokes.services;

import org.springframework.stereotype.Service;

@Service
public interface ChuckNorrisJokeService {
    String getJoke();
}
