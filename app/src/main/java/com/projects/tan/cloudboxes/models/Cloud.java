package com.projects.tan.cloudboxes.models;

import com.projects.tan.cloudboxes.networks.services.BaseService;

import org.parceler.Parcel;

/**
 * Created by oudong on 03/03/2017.
 */
@Parcel
public class Cloud {

    private String name;
    private int icon;
    private BaseService service;

    public Cloud(String name, int icon, BaseService service) {
        this.name = name;
        this.icon = icon;
        this.service = service;
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

    public BaseService getService() {
        return service;
    }

    public void setService(BaseService service) {
        this.service = service;
    }
}
