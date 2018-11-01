package com.example.user.myandroid;

import android.graphics.Bitmap;

public class listitem {
    private Bitmap image;
    private String title;
    private String byname;
    private String release;

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }




    public listitem(Bitmap images,String titles, String bynames, String releases){
        this.image=images;
        title=titles;
        byname=bynames;
        release=releases;
    }

}
