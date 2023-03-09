package com.improve10x.myrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class RecipeItemAdapter extends ArrayAdapter<RecipeItem> {
    public RecipeItemAdapter(@NonNull Context context, int resource, @NonNull RecipeItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        RecipeItem item  = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.recipe_item,parent,false);
        TextView tittleTxt = view.findViewById(R.id.tittle_txt);
        tittleTxt.setText(item.recipeName);
        ImageView imageLv = view.findViewById(R.id.image_iv);
        Picasso.get().load(item.imageUrl).into(imageLv);

        TextView descriptionTxt = view.findViewById(R.id.description_txt);
        descriptionTxt.setText(item.description);
        TextView snoTxt = view.findViewById(R.id.sno_txt);
        snoTxt.setText(item.serialNo);
        return view;

    }
}
