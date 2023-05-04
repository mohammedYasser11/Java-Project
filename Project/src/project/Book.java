/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author dell
 */
public class Book {
    private int ISBN;
    private String name;
    private String author;
    private String category;
    

    public Book() {
    }

    public Book(int ISBN, String name, String author, String category) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public int ISBN_getter() {
        return ISBN;
    }

    public void ISBN_setter(int ISBN) {
        this.ISBN = ISBN;
    }

    public String name_getter() {
        return name;
    }

    public void name_setter(String name) {
        this.name = name;
    }

    public String author_getter() {
        return author;
    }

    public void author_setter(String author) {
        this.author = author;
    }

    public String category_getter() {
        return category;
    }

    public void category_setter(String category) {
        this.category = category;
    }
}