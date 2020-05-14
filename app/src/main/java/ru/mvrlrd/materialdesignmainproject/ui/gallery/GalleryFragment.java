package ru.mvrlrd.materialdesignmainproject.ui.gallery;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import ru.mvrlrd.materialdesignmainproject.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

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
        final ImageView imageView = root.findViewById(R.id.imageView);

//        Bitmap bm = null;
//        try {
//            bm = getBitmapFromAsset("mask.jpg");
//            imageView.setImageBitmap(bm);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return root;
    }

    private Bitmap getBitmapFromAsset(String strName) throws IOException
    {
        System.out.println(getActivity().toString());
        if(getActivity()!=null) {
            AssetManager assetManager = getActivity().getAssets();
            InputStream istr = assetManager.open(strName);
            Bitmap bitmap = BitmapFactory.decodeStream(istr);
            return bitmap;
        }
        return null;
    }
}
