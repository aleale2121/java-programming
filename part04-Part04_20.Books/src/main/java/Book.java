/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class Book {
 private String name;
    private Integer pages;
    private Integer year;

    public Book(String name, Integer pages, Integer year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getYear() {
        return year;
    }


    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }

}
