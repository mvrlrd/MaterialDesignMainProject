package ru.mvrlrd.materialdesignmainproject.ui.plants;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import ru.mvrlrd.materialdesignmainproject.R;


import ru.mvrlrd.materialdesignmainproject.ui.plants.fragments.Fragment1;
import ru.mvrlrd.materialdesignmainproject.ui.plants.fragments.Fragment2;
import ru.mvrlrd.materialdesignmainproject.ui.plants.fragments.Fragment3;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private Toolbar toolbar;

    private FragmentActivity myContext;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        final ImageView imageView = root.findViewById(R.id.imageView);


        Fragment fragment1 = Fragment1.newInstance(null);
        Fragment fragment2 = Fragment2.newInstance(null);
        Fragment fragment3 = Fragment3.newInstance(null);




        MyAdapter myAdapter = new MyAdapter(getActivity().getSupportFragmentManager());
        myAdapter.addFragment(fragment1, "банан");
        myAdapter.addFragment(fragment2, "баобаб");
        myAdapter.addFragment(fragment3, "роза");

        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabs = root.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);



//        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
////        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
//        recyclerView.setLayoutManager(layoutManager);
//        MyAdapter myAdapter = new MyAdapter(new ModelPlants().itemList);
//        recyclerView.setAdapter(myAdapter);
//        recyclerView.addItemDecoration(new ItemDivider(this));

        return root;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }
}




