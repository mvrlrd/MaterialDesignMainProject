package ru.mvrlrd.materialdesignmainproject.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.mvrlrd.materialdesignmainproject.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<String> list;

    public MyAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(int position) {
            textView.setText(list.get(position));
            switch (position ){
                case 0:
                    String name = list.get(0);
                    imageView.setImageResource(R.drawable.cat);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.dog);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.giraffe);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.bird);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.tiger);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.lion);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.whale);
                    break;
                case 7:
                    imageView.setImageResource(R.drawable.dolphin);
                    break;
                case 8:
                    imageView.setImageResource(R.drawable.shark);
                    break;
                case 9:
                    imageView.setImageResource(R.drawable.snake);
                    break;
                case 10:
                    imageView.setImageResource(R.drawable.pangolin);
                    break;
                case 11:
                    imageView.setImageResource(R.drawable.rosomaha);
                    break;
            }

        }
    }
}