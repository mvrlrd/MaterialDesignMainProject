package ru.mvrlrd.materialdesignmainproject.ui.animals;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ru.mvrlrd.materialdesignmainproject.R;

public class ModelAnimals {
    List<String> list;


    public ModelAnimals() {
        this.list = new ArrayList<>();

        list.add("кошка");
        list.add("собака");
        list.add("жираф");
        list.add("птица");
        list.add("тигр");
        list.add("лев");
        list.add("кит");
        list.add("дельфин");
        list.add("акула");
        list.add("змея");
        list.add("панголин");
        list.add("росомаха");


    }

    public List<String> getList() {
        return list;
    }
}