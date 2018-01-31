package com.example.angie.id_app.model;

/**
 * Created by angie on 31/01/18.
 */

public class CustomItem {

    private String title;
    private String description;

    public CustomItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
