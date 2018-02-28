package com.films.free.movieonline.objects;

import java.io.Serializable;

/**
 * Created by loanx on 2/12/2018.
 */

public class FilmObject implements Serializable {
    private String pathIMG;
    private String nameFilm;
    private Category category;
    private String source;
    private int year;

    public FilmObject(String pathIMG, String nameFilm, Category category, String source, int year) {
        this.pathIMG = pathIMG;
        this.nameFilm = nameFilm;
        this.category = category;
        this.source = source;
        this.year = year;
    }

    public FilmObject() {

    }

    public String getPathIMG() {
        return pathIMG;
    }

    public void setPathIMG(String pathIMG) {
        this.pathIMG = pathIMG;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
