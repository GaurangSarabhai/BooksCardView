package com.example.bookscardview;

public class Menu {
    private String title;
    private int thumbnail;
    public Menu(String title, int thumbnail ){
        this.title= title;

        this.thumbnail= thumbnail;

    }

    public String getTitle() {
        return title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}


