package ru.mvrlrd.materialdesignmainproject.ui.animals;
import ru.mvrlrd.materialdesignmainproject.R;
import ru.mvrlrd.materialdesignmainproject.ui.Item;
import ru.mvrlrd.materialdesignmainproject.ui.Model;

public class ModelAnimals extends Model {

    public ModelAnimals() {
        super();
        addItem(new Item("кошка",R.drawable.cat));
        addItem(new Item("собака",R.drawable.dog));
        addItem(new Item("жираф",R.drawable.giraffe));
        addItem(new Item("птица",R.drawable.bird));
        addItem(new Item("тигр",R.drawable.tiger));
        addItem(new Item("лев",R.drawable.lion));
        addItem(new Item("кит",R.drawable.whale));
        addItem(new Item("дельфин",R.drawable.dolphin));
        addItem(new Item("акула",R.drawable.shark));
        addItem(new Item("змея",R.drawable.snake));
        addItem(new Item("панголин",R.drawable.pangolin));
        addItem(new Item("росомаха",R.drawable.rosomaha));
    }



}