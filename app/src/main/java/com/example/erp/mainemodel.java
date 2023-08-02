package com.example.erp;

import android.widget.TextView;

public class mainemodel {

    int stimage;
    String name;

    public mainemodel(int stimage, String name) {
        this.stimage = stimage;
        this.name = name;
    }

    public int getStimage() {
        return stimage;
    }

    public void setStimage(int stimage) {
        this.stimage = stimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
