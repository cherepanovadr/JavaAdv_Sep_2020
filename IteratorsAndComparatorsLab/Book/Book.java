package IteratorsAndComparatorsLab.Book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Book implements Iterable<String> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String ... authors) { //Varargs
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

    public void setAuthors(String ... authors) {
        this.authors =Arrays.asList(authors);
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = this.authors.iterator();
        return iterator;
    }
}
