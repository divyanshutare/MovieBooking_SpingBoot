package com.bct.movieTicket.moviebooking.movie;

import com.bct.movieTicket.moviebooking.show.Show;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private int movieId;

    private String title;

    @Column(length = 452222)
    private String Description;

    private Time duration;

    private String language;

    private Date releaseDate;

    private String country;

    private String genre;

    @OneToMany(mappedBy = "movie")
    private List<Show> showList;

    public Movie() {
    }

    public Movie(int movieId, String title, String description, Time duration, String language, Date releaseDate, String country, String genre, List<Show> showList) {
        this.movieId = movieId;
        this.title = title;
        Description = description;
        this.duration = duration;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.genre = genre;
        this.showList = showList;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }

    public Time getDuration() {
        return duration;
    }

    public String getLanguage() {
        return language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public String getGenre() {
        return genre;
    }

    public List<Show> getShowList() {
        return showList;
    }
}
