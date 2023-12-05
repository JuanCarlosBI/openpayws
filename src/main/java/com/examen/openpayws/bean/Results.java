package com.examen.openpayws.bean;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;
import java.util.List;

@Entity(name = "results")
public class Results{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Date modified;
    @Column
    private String resourceURI;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Urls> urls;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Thumbnail thumbnail;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Comics comics;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Stories stories;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private  Events events;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Series series;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<Urls> getUrls() {
        return urls;
    }

    public void setUrls(List<Urls> urls) {
        this.urls = urls;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Comics getComics() {
        return comics;
    }

    public void setComics(Comics comics) {
        this.comics = comics;
    }

    public Stories getStories() {
        return stories;
    }

    public void setStories(Stories stories) {
        this.stories = stories;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }
}
