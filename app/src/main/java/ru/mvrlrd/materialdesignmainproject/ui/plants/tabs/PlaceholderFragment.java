package ru.mvrlrd.materialdesignmainproject.ui.plants.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import ru.mvrlrd.materialdesignmainproject.R;

public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
//        final TextView textView = root.findViewById(R.id.section_label);
        final ImageView imageView = root.findViewById(R.id.imageView2);
        pageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                if(s.endsWith("1")){
                    imageView.setImageResource(R.drawable.banan);
                }
                if(s.endsWith("2")){
                    imageView.setImageResource(R.drawable.rose);
                }
                if(s.endsWith("3")){
                    imageView.setImageResource(R.drawable.avocado);
                }
                if(s.endsWith("4")){
                    imageView.setImageResource(R.drawable.baobab);
                }
//                textView.setText(s);
                System.out.println(s);
            }
        });
        return root;
    }
}