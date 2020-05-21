package ru.mvrlrd.materialdesignmainproject.ui.animals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.mvrlrd.materialdesignmainproject.R;
import ru.mvrlrd.materialdesignmainproject.ui.MyAdapter;
import ru.mvrlrd.materialdesignmainproject.ui.Presenter;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    Presenter presenter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_animals, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        presenter = new Presenter();
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(presenter.getList());
        recyclerView.setAdapter(myAdapter);
//        recyclerView.addItemDecoration(new ItemDivider(this));
        return root;
    }



    private void initRecyclerView() {

    }
}