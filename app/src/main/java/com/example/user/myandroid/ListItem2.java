package com.example.user.myandroid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ListItem2 {
    private Bitmap image;
    private String title;


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




    public ListItem2(Bitmap images,String titles){
        this.image=images;
        title=titles;

    }

}
