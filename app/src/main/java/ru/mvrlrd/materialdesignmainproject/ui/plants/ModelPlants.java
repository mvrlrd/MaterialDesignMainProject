package ru.mvrlrd.materialdesignmainproject.ui.plants;

import ru.mvrlrd.materialdesignmainproject.R;
import ru.mvrlrd.materialdesignmainproject.ui.Item;
import ru.mvrlrd.materialdesignmainproject.ui.Model;

class ModelPlants extends Model {
    ModelPlants() {
        super();
        addItem(new Item("кофе", R.drawable.coffee));
        addItem(new Item("авокадо", R.drawable.avocado));
        addItem(new Item("роза", R.drawable.rose));
        addItem(new Item("банан", R.drawable.banan));
        addItem(new Item("баобаб", R.drawable.baobab));
        addItem(new Item("кактус", R.drawable.cactus));
        addItem(new Item("клубника", R.drawable.strawberry));

    }
}