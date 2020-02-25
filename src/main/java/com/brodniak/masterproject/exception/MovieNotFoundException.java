package com.brodniak.masterproject.exception;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String id) {
        super("Movie not found: " + id);
    }
}
