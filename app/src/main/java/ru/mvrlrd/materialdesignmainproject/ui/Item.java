package ru.mvrlrd.materialdesignmainproject.ui;

public class Item {
   private String text;
   private int resource;

    public Item(String text, int resource) {
        this.text = text;
        this.resource = resource;
    }

    String getText() {
        return text;
    }

    int getResource() {
        return resource;
    }

}
