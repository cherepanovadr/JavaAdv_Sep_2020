package IteratorsAndComparatorsLab.Comparators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) { //Varargs
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }



    @Override
    public int compareTo(Book other) {
        int compareTitle = this.getTitle().compareTo(other.title);
        if (compareTitle == 0) {
            compareTitle = Integer.compare(this.year, other.year);
        }
        return compareTitle;
    }
}
