package com.example.ilmubahasainggris;

public class MenuLatihanModel {
    private String imageUrl,title;

    public MenuLatihanModel(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
