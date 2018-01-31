package com.example.angie.id_app.model;

import android.graphics.drawable.ColorDrawable;

/**
 * Created by angie on 31/01/18.
 */

public class SkillsItem {

    private String title;
    private int level;

    public SkillsItem(String title, int level) {
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
