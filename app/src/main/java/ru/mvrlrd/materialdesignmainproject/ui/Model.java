package ru.mvrlrd.materialdesignmainproject.ui;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public List<Item>itemList;

    public Model() {
        this.itemList = new ArrayList<>();
    }

   public List<Item>getItems(){
        return itemList;
    }

   public void addItem(Item item){
        itemList.add(item);
    }
}
