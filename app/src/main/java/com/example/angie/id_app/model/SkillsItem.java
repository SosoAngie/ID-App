package com.example.angie.id_app.model;

import android.graphics.drawable.Drawable;

/**
 * Created by angie on 31/01/18.
 */

public class SkillsItem {

    private String title;
    private Drawable level;

    public SkillsItem(String title, Drawable level) {
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getLevel() {
        return level;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(Drawable level) {
        this.level = level;
    }
}
