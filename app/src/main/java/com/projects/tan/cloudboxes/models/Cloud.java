package com.projects.tan.cloudboxes.models;

import org.parceler.Parcel;

/**
 * Created by oudong on 03/03/2017.
 */
@Parcel
public class Cloud {

    private String name;
    private int icon;

    public Cloud(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
