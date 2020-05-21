package ru.mvrlrd.materialdesignmainproject.ui;

import java.util.List;

import ru.mvrlrd.materialdesignmainproject.ui.animals.ModelAnimals;

public class Presenter {
    ModelAnimals model;

    public Presenter() {
        this.model = new ModelAnimals();
    }

    public List<String> getList() {
        return model.getList();
    }
}
