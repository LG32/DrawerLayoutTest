package com.example.administrator.drawerlayouttest;

/**
 * Created by Administrator on 2018/4/8.
 */

public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name, int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageId()
    {
        return imageId;
    }
}
