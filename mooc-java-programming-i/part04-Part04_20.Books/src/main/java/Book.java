/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahian
 */
public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public boolean isAwesome() {
        return this.title.contains("MasterChef");
    }

    public String getTitle() {
        return title;
    }

    public int getAll() {
        return pages;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
