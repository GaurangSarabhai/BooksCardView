package com.example.bookscardview;


public class Book {
    private String title;
    private int thumbnail;
    private String bookPdfLink;
    public Book(){

    }
    public Book(String title, int thumbnail, String bookPdfLink){
        this.title= title;

        this.thumbnail= thumbnail;
        this.bookPdfLink=bookPdfLink;
    }

    public String getTitle() {
        return title;
    }



    public int getThumbnail() {
        return thumbnail;
    }


    public String getBookPdfLink(){ return bookPdfLink;}



    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookPdfLink(String bookPdfLink){ this.bookPdfLink= bookPdfLink;}

    }

