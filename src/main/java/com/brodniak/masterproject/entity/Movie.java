package com.brodniak.masterproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "movie")
public class Movie {

    @Id
    String imdbId;
    @Column(name = "ratings")
    int ratings;
    @Column(name = "votes_number")
    int votesNumber;
    @Column(name = "title_type")
    String titleType;
    @Column(name = "primary_title")
    String primaryTitle;
    @Column(name = "original_title")
    String originalTitle;
    @Column(name = "is_adult")
    boolean isAdult;
    @Column(name = "start_year")
    int startYear;
    @Column(name = "runtime_minutes")
    int runtimeMinutes;
    @Column(name = "genere_1")
    String genere1;
    @Column(name = "genere_2")
    String genere2;

    public Movie() {

    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(int votesNumber) {
        this.votesNumber = votesNumber;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getGenere1() {
        return genere1;
    }

    public void setGenere1(String genere1) {
        this.genere1 = genere1;
    }

    public String getGenere2() {
        return genere2;
    }

    public void setGenere2(String genere2) {
        this.genere2 = genere2;
    }

}
